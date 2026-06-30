package ui;

import javax.swing.*;
import dao.UserDAO;

public class LoginUI extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;

    public LoginUI() {

        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Email label
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 50, 100, 30);
        add(emailLabel);

        // Email field
        emailField = new JTextField();
        emailField.setBounds(150, 50, 180, 30);
        add(emailField);

        // Password label
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        add(passLabel);

        // Password field
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 30);
        add(passwordField);

        // Login button
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150, 160, 100, 30);
        add(loginBtn);

        // Action
        loginBtn.addActionListener(e -> {

            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            UserDAO dao = new UserDAO();

            if (dao.validateLogin(email, password)) {
                JOptionPane.showMessageDialog(this, "Login Successful");

                new DashboardUI().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Email or Password");
            }
        });
    }

    public static void main(String[] args) {
        new LoginUI().setVisible(true);
    }
}