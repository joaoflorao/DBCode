/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.dombosco.dbcode.accessManagment.view;

/**
 *
 * @author fabio
 */
public class Vamo extends javax.swing.JFrame {

    /**
     * Creates new form Vamo
     */
    public Vamo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        replyPassword = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        profile = new javax.swing.JComboBox<>();
        labelPerfil = new javax.swing.JLabel();
        register1 = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(null);

        cancel.setText("Cancelar");
        cancel.setActionCommand("");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        panel.add(cancel);
        cancel.setBounds(320, 490, 90, 30);

        user.setForeground(new java.awt.Color(153, 153, 153));
        user.setText("Digite seu usu�rio");
        panel.add(user);
        user.setBounds(320, 140, 210, 30);

        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("Digite sua senha");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        panel.add(password);
        password.setBounds(320, 280, 210, 30);

        replyPassword.setForeground(new java.awt.Color(153, 153, 153));
        replyPassword.setText("Digite seu usu�rio");
        panel.add(replyPassword);
        replyPassword.setBounds(320, 350, 210, 30);

        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("Digite seu usu�rio");
        panel.add(email);
        email.setBounds(320, 210, 210, 30);

        profile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel.add(profile);
        profile.setBounds(320, 430, 140, 22);

        labelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        labelPerfil.setText("Selecione o perfil:");
        panel.add(labelPerfil);
        labelPerfil.setBounds(320, 410, 100, 16);

        register1.setBackground(new java.awt.Color(8, 138, 179));
        register1.setForeground(new java.awt.Color(255, 255, 255));
        register1.setText("Entrar");
        register1.setBorderPainted(false);
        panel.add(register1);
        register1.setBounds(430, 490, 100, 30);

        image.setForeground(new java.awt.Color(0, 51, 255));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO_INICIAL_FORMATED-fotor-20231103211254.png"))); // NOI18N
        panel.add(image);
        image.setBounds(0, 0, 599, 648);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel image;
    private javax.swing.JLabel labelPerfil;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> profile;
    private javax.swing.JButton register1;
    private javax.swing.JTextField replyPassword;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
