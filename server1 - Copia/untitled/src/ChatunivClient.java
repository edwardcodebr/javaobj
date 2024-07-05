import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatunivClient {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ChatunivClient <server-ip> <username>");
            return;
        }

        String serverAddress = args[0];
        String username = args[1];

        try (Socket socket = new Socket(serverAddress, 20041);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            // Enviar nome de usuário ao servidor
            out.println(username);

            // Thread para receber mensagens do servidor
            new Thread(new Runnable() {
                public void run() {
                    try {
                        String serverMessage;
                        while ((serverMessage = in.readLine()) != null) {
                            System.out.println(serverMessage);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            // Enviar mensagens do cliente ao servidor
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                if (userInput.equalsIgnoreCase("/logout")) {
                    break;
                } else if (userInput.equalsIgnoreCase("/list")) {
                    out.println(userInput);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
