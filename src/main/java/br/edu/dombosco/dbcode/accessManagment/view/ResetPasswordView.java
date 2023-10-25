package br.edu.dombosco.dbcode.accessManagment.view;

import br.edu.dombosco.dbcode.accessManagment.controller.EmailController;
import br.edu.dombosco.dbcode.accessManagment.controller.UserController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ResetPasswordView extends JFrame {
    private JTextField txtEmail;
    private JLabel labelEmail;
    private JTextField textCode;
    private JLabel labelCode;
    private JButton sendCodeButton;
    private JButton verifyCodeButton;
    private final UserController userController;

    public ResetPasswordView(UserController emailController) {
        this.userController = emailController;
        setVisible(true);
        setTitle("Password Reset");
        setSize(300, 350);
        setLocationRelativeTo(null);
        setLayout(null);

        labelCode = new JLabel("Código de Verificação:");
        labelCode.setBounds(10,60,180,25);
        add(labelCode);

        textCode = new JTextField();
        textCode.setBounds(60, 80, 100, 60);
        textCode.setColumns(10);
        add(textCode);

        verifyCodeButton = new JButton("Verificar Código");
        verifyCodeButton.addActionListener(new VerifyCodeAction());

//
//        add(txtEmail);
//        add(sendCodeButton);
//        add(new JLabel("Code:"));
//        add(codeField);
//        add(verifyCodeButton);
//
//        sendCodeButton.addActionListener(new SendCodeAction());
//

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class VerifyCodeAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String code = textCode.getText();
            userController.verifyCode(code);

        }
    }

}