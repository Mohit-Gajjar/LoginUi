package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame implements ActionListener {

    private JPanel pannel;
    private JLabel username;
    private JLabel password;
    private JTextField usernameTextField;
    private JPasswordField passwordTextField;
    private JButton loginBtn;


    public Form1(){
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pannel);
        this.pack();
        loginBtn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = usernameTextField.getText();
        String passWord = passwordTextField.getText();

        if (userName.equals("admin") && passWord.equals("admin")){
            JOptionPane.showMessageDialog(pannel, "login successful....!");
        }else{
            JOptionPane.showMessageDialog(pannel, "Incorrect Username or Password..!");
        }
    }
}
