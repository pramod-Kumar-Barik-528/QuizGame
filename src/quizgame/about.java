/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;

/**
 *
 * @author Dell
 */
public class about extends javax.swing.JFrame {

    /**
     * Creates new form about
     */
    public about() {
        initComponents();
          setVisible(true);
        setBounds(400,120,620,530);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bachground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/backc1234__1_-removebg-preview.png"))); // NOI18N
        b12.setText(" ");
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b12MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b12MouseReleased(evt);
            }
        });
        getContentPane().add(b12);
        b12.setBounds(510, 400, 140, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/board2-removebg-preview (1).png"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 250, 460, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/monky3-removebg-preview.png"))); // NOI18N
        jLabel4.setText(" ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 170, 450, 290);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/bird-removebg-preview.png"))); // NOI18N
        jLabel5.setText(" ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 230, 140, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/monky2-removebg-preview.png"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 10, 320, 380);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/2rt-removebg-preview (1) (1).png"))); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -50, 520, 420);

        bachground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/zzzmenu.jpg"))); // NOI18N
        bachground.setText(" ");
        getContentPane().add(bachground);
        bachground.setBounds(0, 0, 630, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseExited
        // TODO add your handling code here:
         b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/backc1234__1_-removebg-preview.png")));
    }//GEN-LAST:event_b12MouseExited

    private void b12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseEntered
        // TODO add your handling code here:
         b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/image/back123__1_-removebg-preview.png")));
    }//GEN-LAST:event_b12MouseEntered

    private void b12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseReleased
        // TODO add your handling code here:
          new menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b12MouseReleased

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
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b12;
    private javax.swing.JLabel bachground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
