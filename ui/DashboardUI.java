package ui;

import javax.swing.*;

public class DashboardUI extends JFrame {

    public DashboardUI() {
        setTitle("Dashboard");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("EVENT DASHBOARD");
        label.setBounds(180, 30, 200, 30);
        add(label);

        JButton eventBtn = new JButton("View Events");
        eventBtn.setBounds(180, 100, 150, 30);
        add(eventBtn);

        JButton paymentBtn = new JButton("Payment");
        paymentBtn.setBounds(180, 150, 150, 30);
        add(paymentBtn);

        eventBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Event List Page"));
        paymentBtn.addActionListener(e -> new PaymentUI().setVisible(true));
    }
}