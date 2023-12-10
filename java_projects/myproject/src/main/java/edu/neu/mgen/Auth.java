package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Auth extends JFrame {

    private CardLayout cardLayout = new CardLayout();
    private JPanel cardPanel = new JPanel(cardLayout);

    private Map<String, String> userDatabase = new HashMap<>();

    public Auth() {
        cardPanel.setLayout(cardLayout);

        JPanel loginPanel = createLoginPanel();
        cardPanel.add(loginPanel, "Login");

        JPanel signUpPanel = createSignUpPanel();
        cardPanel.add(signUpPanel, "SignUp");

        add(cardPanel);

        setTitle("Login / Sign Up");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        final JTextField usernameField = new JTextField();
        final JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton switchToSignUpButton = new JButton("Sign Up");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (authenticateUser(username, password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    // Here you can add code to open a new window or perform other actions after login
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Try again.");
                }
            }
        });

        switchToSignUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "SignUp");
            }
        });

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(switchToSignUpButton);

        return panel;
    }

    private JPanel createSignUpPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        final JTextField newUsernameField = new JTextField();
        final JPasswordField newPasswordField = new JPasswordField();
        JButton signUpButton = new JButton("Create Account");
        JButton switchToLoginButton = new JButton("Back to Login");

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newUsername = newUsernameField.getText();
                String newPassword = new String(newPasswordField.getPassword());

                if (userDatabase.containsKey(newUsername)) {
                    JOptionPane.showMessageDialog(null, "Username already exists. Try a different one.");
                } else {
                    userDatabase.put(newUsername, newPassword);
                    JOptionPane.showMessageDialog(null, "Account created successfully! You can now log in.");
                    cardLayout.show(cardPanel, "Login");
                }
            }
        });

        switchToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Login");
            }
        });

        panel.add(new JLabel("New Username:"));
        panel.add(newUsernameField);
        panel.add(new JLabel("New Password:"));
        panel.add(newPasswordField);
        panel.add(signUpButton);
        panel.add(switchToLoginButton);

        return panel;
    }

    private boolean authenticateUser(String username, String password) {
        // In a real application, you would typically check against a database
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Auth().setVisible(true);
            }
        });
    }
}
