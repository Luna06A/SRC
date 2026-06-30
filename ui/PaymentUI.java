package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PaymentUI extends JFrame {

    public PaymentUI() {
        setTitle("Payment");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel amount = new JLabel("Enter Amount:");
        amount.setBounds(50, 50, 120, 30);
        add(amount);

        JTextField amtField = new JTextField();
        amtField.setBounds(170, 50, 150, 30);
        add(amtField);

        JButton payBtn = new JButton("Pay");
        payBtn.setBounds(150, 120, 100, 30);
        add(payBtn);

        payBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Payment Successful!");
        });
    }
}