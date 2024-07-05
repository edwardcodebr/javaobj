package server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ChatunivServer {
    private static final int PORT = 271104;
    private static Map<String, ClientHandler> clients = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("O servidor Chatuniv está rodando...");
        try (ServerSocket listener = new ServerSocket(PORT)) {
            while (true) {
                new ClientHandler(listener.accept()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        private String username;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // Solicitar o nome de usuário
                out.println("SUBMITNAME");
                username = in.readLine();
                synchronized (clients) {
                    clients.put(username, this);
                }
                out.println("NAMEACCEPTED " + username);
                broadcastMessage("User " + username + " entrou no chat");

                String message;
                while ((message = in.readLine()) != null) {
                    if (message.startsWith("/logout")) {
                        break;
                    } else if (message.startsWith("@")) {
                        String[] parts = message.split(" ", 2);
                        if (parts.length == 2) {
                            String targetUsername = parts[0].substring(1);
                            String privateMessage = parts[1];
                            sendMessageToUser(targetUsername, "Mensagem privada de " + username + ": " + privateMessage);
                        }
                    } else {
                        broadcastMessage(username + ": " + message);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (clients) {
                    clients.remove(username);
                }
                broadcastMessage("User " + username + " saiu do chat");
            }
        }

        private void broadcastMessage(String message) {
            synchronized (clients) {
                for (ClientHandler handler : clients.values()) {
                    handler.out.println(message);
                }
            }
        }

        private void sendMessageToUser(String username, String message) {
            synchronized (clients) {
                ClientHandler handler = clients.get(username);
                if (handler != null) {
                    handler.out.println(message);
                } else {
                    out.println("Usuário " + username + " não está disponível.");
                }
            }
        }
    }
}
