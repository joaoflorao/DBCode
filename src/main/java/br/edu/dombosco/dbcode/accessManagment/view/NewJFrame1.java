/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.dombosco.dbcode.accessManagment.view;

/**
 *
 * @author fabio
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
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

        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        requisitos = new javax.swing.JMenu();
        subMenuRequisitos = new javax.swing.JMenu();
        subMenuRequisitos2 = new javax.swing.JMenu();
        bugs = new javax.swing.JMenu();
        subMenuBugs = new javax.swing.JMenu();
        subMenuBugs2 = new javax.swing.JMenu();
        javax.swing.JMenu test = new javax.swing.JMenu();
        subMenuTest = new javax.swing.JMenu();
        subMenutest2 = new javax.swing.JMenu();
        javax.swing.JMenu config = new javax.swing.JMenu();
        subMenuConfig = new javax.swing.JMenu();
        subMenuConfig2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/dombosco/dbcode/accessManagment/view/backend_opaco.png"))); // NOI18N

        requisitos.setText("Requisitos");

        subMenuRequisitos.setText("Requisitos");
        requisitos.add(subMenuRequisitos);

        subMenuRequisitos2.setText("Requisitos");
        requisitos.add(subMenuRequisitos2);

        menu.add(requisitos);

        bugs.setText("Bugs");

        subMenuBugs.setText("Requisitos");
        bugs.add(subMenuBugs);

        subMenuBugs2.setText("Requisitos");
        bugs.add(subMenuBugs2);

        menu.add(bugs);

        test.setText("Test");

        subMenuTest.setText("Requisitos");
        test.add(subMenuTest);

        subMenutest2.setText("Requisitos");
        test.add(subMenutest2);

        menu.add(test);

        config.setText("Configurações");

        subMenuConfig.setText("Requisitos");
        config.add(subMenuConfig);

        subMenuConfig2.setText("Requisitos");
        config.add(subMenuConfig2);

        menu.add(config);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bugs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu requisitos;
    private javax.swing.JMenu subMenuBugs;
    private javax.swing.JMenu subMenuBugs2;
    private javax.swing.JMenu subMenuConfig;
    private javax.swing.JMenu subMenuConfig2;
    private javax.swing.JMenu subMenuRequisitos;
    private javax.swing.JMenu subMenuRequisitos2;
    private javax.swing.JMenu subMenuTest;
    private javax.swing.JMenu subMenutest2;
    // End of variables declaration//GEN-END:variables
}
