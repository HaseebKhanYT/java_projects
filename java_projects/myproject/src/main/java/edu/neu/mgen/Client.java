package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;

public class Client extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;

    private void receiveMessage(final String message) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                chatArea.append("Other: " + message + "\n");
            }
        });
    }

    public Client() {
        setTitle("Chat");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        inputField = new JTextField();

        setLayout(new BorderLayout());
        add(new JScrollPane(chatArea), BorderLayout.CENTER);
        add(inputField, BorderLayout.SOUTH);

        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText();
                sendMessage(message);
                inputField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Auth loginWindow = new Auth();
                loginWindow.setVisible(true);

                Client client = new Client();
                client.setVisible(true);
                
    
        }
            
        });
    }

    private void sendMessage(final String message) {
        chatArea.append("You: " + message + "\n");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Update the chatArea on the EDT
                // chatArea.append("You: " + message + "\n");
                
            }
        });

        try (Socket socket = new Socket("localhost", 12345)) {
            // Rest of your code for sending the message to the server...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
