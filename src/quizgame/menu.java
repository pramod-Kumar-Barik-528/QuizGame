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
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu1
     */
    public menu() {
        initComponents();
        setVisible(true);
        setBounds(420,120,623,420);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/dev__1_-removebg-preview.png"))); // NOI18N
        jLabel6.setText(" ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, -30, 220, 220);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/zexit11.png"))); // NOI18N
        b4.setText(" ");
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b4MouseReleased(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(460, 330, 120, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/monkey2-removebg-preview.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, -70, 200, 170);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/monkey1-removebg-preview.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 220, 150, 100);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/babout.png"))); // NOI18N
        b3.setText("jLabel5");
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b3MouseReleased(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(160, 230, 240, 140);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/bguide.png"))); // NOI18N
        b2.setText(" ");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b2MouseReleased(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(150, 140, 240, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/bird-removebg-preview.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 120, 110, 110);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/bplay.png"))); // NOI18N
        b1.setText(" ");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b1MouseReleased(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(140, 10, 240, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/zzzwww12.png"))); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, -80, 500, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/zzzwww12345.jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseReleased
        // TODO add your handling code here:
         new Quizgame1().setVisible(true);
        //new guide().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b1MouseReleased

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        // TODO add your handling code here:
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/bplay.png")));
    }//GEN-LAST:event_b1MouseExited

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        // TODO add your handling code here:
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/gplay.png")));
    }//GEN-LAST:event_b1MouseEntered

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
        // TODO add your handling code here:
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/bguide.png")));
    }//GEN-LAST:event_b2MouseExited

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        // TODO add your handling code here:
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/gguide.png")));
    }//GEN-LAST:event_b2MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        // TODO add your handling code here:
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/babout.png")));
    }//GEN-LAST:event_b3MouseExited

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        // TODO add your handling code here:
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/gabout.png")));
    }//GEN-LAST:event_b3MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        // TODO add your handling code here:
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/zexit11.png")));
    }//GEN-LAST:event_b4MouseExited

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        // TODO add your handling code here:
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame/img/zexit12.png")));
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseReleased
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_b4MouseReleased

    private void b2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseReleased
        // TODO add your handling code here:
                new guide().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_b2MouseReleased

    private void b3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseReleased
        // TODO add your handling code here:
           new about().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b3MouseReleased

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
