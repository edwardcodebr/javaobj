import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatunivClient {
    private static String serverAddress = "127.0.0.1"; // IP do servidor
    private static int serverPort = 20041; // Porta do servidor

    public static void main(String[] args) {
        try (Socket socket = new Socket(serverAddress, serverPort);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            Scanner scanner = new Scanner(System.in);
            String response;

            // Receber solicitação de nome de usuário do servidor
            response = in.readLine();
            if (response.equals("SUBMITNAME")) {
                System.out.println("Digite seu nome de usuário: ");
                String username = scanner.nextLine();
                out.println(username);
            }

            // Receber confirmação de nome de usuário aceito
            response = in.readLine();
            if (response.startsWith("NAMEACCEPTED")) {
                String username = response.substring(13);
                System.out.println("Nome de usuário aceito: " + username);
                System.out.println("Bem-vindo ao chat!");

                // Iniciar uma nova thread para ler mensagens do servidor
                new Thread(new IncomingMessageReader(in)).start();

                // Ler mensagens do usuário e enviá-las ao servidor
                while (scanner.hasNextLine()) {
                    String message = scanner.nextLine();
                    out.println(message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class IncomingMessageReader implements Runnable {
        private BufferedReader in;

        public IncomingMessageReader(BufferedReader in) {
            this.in = in;
        }

        public void run() {
            try {
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
