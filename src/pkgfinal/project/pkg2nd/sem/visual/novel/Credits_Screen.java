/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgfinal.project.pkg2nd.sem.visual.novel;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author user
 */
public class Credits_Screen extends javax.swing.JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;
    int half_width = screenWidth/2;
    int half_height = screenHeight/2;

    /**
     * Creates new form Credits_Screen
     */
    public Credits_Screen() {
        initComponents();
        this.setSize(620,430);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 600, 440));
        setLocation(half_width-310,half_height-215);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(620, 430));
        setSize(new java.awt.Dimension(600, 440));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel1.setText("Project Manager");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 20, 153, 20);

        jLabel2.setText("Herny Philip S. Dael");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 40, 106, 16);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("Programmers");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 60, 120, 22);

        jLabel4.setText("Henry Philip S. Dael");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 80, 110, 20);

        jLabel5.setText("Ninmar H. Olpenado");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 96, 110, 30);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel6.setText("Script Writers");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 120, 130, 22);

        jLabel7.setText("Ninmar H. Olpenado");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 136, 110, 30);

        jLabel8.setText("Pauleen L. Somido");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 160, 100, 16);

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel9.setText("Document Expert");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 170, 170, 22);

        jLabel10.setText("Jasmine Rei P. Amoncio");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 190, 130, 20);

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel11.setText("Designer");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(270, 210, 80, 22);

        jLabel12.setText("Henry Philip S. Dael");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(260, 230, 110, 20);

        jLabel13.setText("Ninmar H. Olpenado");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(257, 250, 110, 20);

        jLabel14.setText("Pauleen L. Somido");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(263, 270, 100, 16);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("This game is produce for academic purposes only. And is not for public use and distribition.");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 320, 590, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Please do not distribute or sell without permisson on the developers");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(90, 340, 450, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("I would like to thank you all people who worked hard on this project in coming to life.");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(40, 360, 550, 20);

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 10, 72, 22);

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(121, 15, 31), 4));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 620, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Credits_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credits_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credits_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credits_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Credits_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
