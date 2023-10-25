package br.edu.dombosco.dbcode.accessManagment.view;

import br.edu.dombosco.dbcode.accessManagment.controller.EmailController;
import br.edu.dombosco.dbcode.accessManagment.model.Profile;
import br.edu.dombosco.dbcode.accessManagment.model.User;
import br.edu.dombosco.dbcode.accessManagment.controller.UserController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RegisterView extends JFrame {
    private JLabel usernameLabel;
    private JTextField user;

    private JLabel emailLabel;
    private JTextField email;

    private JLabel passwordLabel;
    private JPasswordField password;

    private JLabel replyPasswordLabel;
    private JPasswordField replyPassword;

    private JLabel profileLabel;
    private ButtonGroup profileGroup;
    private Profile profileSelected;

    private JButton register;
    int cantoEsquerdoTexto = 10;
    int comprimentoTexto = 170;
    int distanciaTexto = comprimentoTexto - 15;
    private UserController userController;
    private EmailController emailController;

    public RegisterView(UserController userController, EmailController emailController) {
        this.userController = userController;
        this.emailController = emailController;
        setLocationRelativeTo(null);
        initializeComponents();
        setupListeners();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setupListeners() {

        usernameLabel.setBounds(cantoEsquerdoTexto, 10, comprimentoTexto, 25);
        user.setBounds(distanciaTexto, 10, 150, 25);
        emailLabel.setBounds(cantoEsquerdoTexto, 50, comprimentoTexto, 25);
        email.setBounds(distanciaTexto, 50, 150, 25);
        passwordLabel.setBounds(cantoEsquerdoTexto, 90, comprimentoTexto, 25);
        password.setBounds(distanciaTexto, 90, 150, 25);
        replyPasswordLabel.setBounds(cantoEsquerdoTexto, 130, comprimentoTexto, 25);
        replyPassword.setBounds(distanciaTexto, 130, 150, 25);
        profileLabel.setBounds(cantoEsquerdoTexto, 170, comprimentoTexto, 25);


        add(usernameLabel);
        add(user);
        add(emailLabel);
        add(email);
        add(passwordLabel);
        add(password);
        add(replyPasswordLabel);
        add(replyPassword);
        add(profileLabel);
        add(register);

        for (Profile profile : Profile.values()) {
            JRadioButton radioButton = new JRadioButton(profile.getProfileName());
            radioButton.setBounds(profile.getPadding(), 195, profile.getWidth(), 25);
            radioButton.addActionListener(e -> profileSelected = profile);
            profileGroup.add(radioButton);
            add(radioButton);

        }

        register.setBounds(130, 230, 150, 25);
        register.addActionListener(e -> {
            String username = user.getText();
            String emailAddress = email.getText();
            String userPassword = new String(password.getPassword());
            String userReplyPassword = new String(replyPassword.getPassword());
            if(userPassword.isEmpty() || userReplyPassword.isEmpty() || !userPassword.equals(userReplyPassword)){
                JOptionPane.showMessageDialog(RegisterView.this, "Senhas não conferem","Valide Campos",JOptionPane.WARNING_MESSAGE);
            }

            var userCreated = userController.create(User.builder()
                    .username(username)
                    .email(emailAddress)
                    .password(userPassword)
                    .profile(profileSelected)
                    .fields(new ArrayList<>())
                    .build());
            if(userCreated.getFields().isEmpty()){
                JOptionPane.showMessageDialog(this, "Registro efetuado com sucesso!");
                setVisible(false);
                new LoginView(userController, emailController).setVisible(true);
            }else {
                String mensagem = "Por favor, verifique os seguintes campos: " + String.join(", ", userCreated.getFields());
                JOptionPane.showMessageDialog(RegisterView.this, mensagem,"Valide Campos",JOptionPane.WARNING_MESSAGE);

            }
        });




    }

    private void initializeComponents() {
        setTitle("Cadastro");
        setSize(800, 600);
        setLocationRelativeTo(null);
        //setLayout(new GridLayout(3, 2));
        setLayout(null);

        usernameLabel = new JLabel("Nome de Usuário:");
        user = new JTextField();

        emailLabel = new JLabel("Email:");
        email = new JTextField();

        password = new JPasswordField();
        passwordLabel = new JLabel("Nova Senha:");

        replyPassword = new JPasswordField();
        replyPasswordLabel = new JLabel("Repita Nova Senha:");

        profileLabel = new JLabel("Perfil:");
        profileGroup = new ButtonGroup();

        register = new JButton("Registrar");

    }

}

