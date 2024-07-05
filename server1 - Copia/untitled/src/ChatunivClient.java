import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatunivClient {

    private static PrintWriter out;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chatuniv Client");
        JTextArea messageArea = new JTextArea(20, 50);
        JTextField textField = new JTextField(40);
        JButton sendButton = new JButton("Enviar");
        JButton exitButton = new JButton("Sair");

        messageArea.setEditable(false);
        frame.getContentPane().add(new JScrollPane(messageArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(sendButton);
        panel.add(exitButton);
        frame.getContentPane().add(panel, BorderLayout.SOUTH);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = textField.getText();
                if (!message.isEmpty()) {
                    out.println(message);
                    textField.setText("");
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.println("/logout");
                System.exit(0);
            }
        });

        try (Socket socket = new Socket("localhost", 20041);
             PrintWriter socketOut = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out = socketOut;

            String fromServer;
            while ((fromServer = in.readLine()) != null) {
                if (fromServer.startsWith("SUBMITNAME")) {
                    String username = JOptionPane.showInputDialog(frame, "Seu nome de usuario:", "Username", JOptionPane.PLAIN_MESSAGE);
                    if (username != null && !username.trim().isEmpty()) {
                        out.println(username);
                    } else {
                        System.exit(0);
                    }
                } else if (fromServer.startsWith("NAMEACCEPTED")) {
                    messageArea.append("Bem-vindo ao chat chat, " + fromServer.substring(13) + "\n");
                    break;
                }
            }

            while ((fromServer = in.readLine()) != null) {
                messageArea.append(fromServer + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
