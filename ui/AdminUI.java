package ui;

import javax.swing.*;

public class AdminUI extends JFrame {

    public AdminUI() {
        setTitle("Admin Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("ADMIN PANEL");
        label.setBounds(150, 30, 200, 30);
        add(label);

        JButton btn = new JButton("Go to Dashboard");
        btn.setBounds(120, 100, 150, 30);
        add(btn);

        btn.addActionListener(e -> {
            new DashboardUI().setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        new AdminUI().setVisible(true);
    }
}