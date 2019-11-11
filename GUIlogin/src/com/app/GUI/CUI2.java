package com.app.GUI;

import javax.swing.*;

public class CUI2 {
    public static void main(String[] args){
        JFrame frame = new JFrame("register");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);

    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel user = new JLabel("user");
        user.setBounds(10,20,80,25);
        panel.add(user);
        JTextField userfield = new JTextField(20);
        userfield.setBounds(100,20,165,25);
        panel.add(userfield);

        JLabel password = new JLabel("password");
        password.setBounds(10,50,80,25);
        panel.add(password);
        JTextField passwordfield = new JTextField(20);
        passwordfield.setBounds(100,50,165,25);
        panel.add(passwordfield);

        JLabel mailbox = new JLabel("QQ mailbox");
        mailbox.setBounds(10,80,80,25);
        panel.add(mailbox);
        JTextField mailboxfield = new JTextField(20);
        mailboxfield.setBounds(100,80,165,25);
        panel.add(mailboxfield);

        JButton register = new JButton("register");
        register.setBounds(10,120,90,25);
        panel.add(register);
    }
}
