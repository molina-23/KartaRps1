/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

/**
 *
 * @author nisit
 */
public class InterfazIniciar extends javax.swing.JFrame {

    /**
     * Creates new form Iniciar
     */
    public InterfazIniciar() {
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

        jPanel1 = new javax.swing.JPanel();
        lblImgLogo2 = new javax.swing.JLabel();
        miniMenuPnl1 = new Front.MiniMenuPnl();
        lblBtnmenu = new javax.swing.JLabel();
        lblBtnIniciar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(144, 215, 155));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(144, 215, 155));
        jPanel1.setForeground(new java.awt.Color(144, 215, 155));
        jPanel1.setPreferredSize(new java.awt.Dimension(825, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImgLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgLogo2.png"))); // NOI18N
        jPanel1.add(lblImgLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 67, -1, -1));
        jPanel1.add(miniMenuPnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));
        miniMenuPnl1.setVisible(false);

        lblBtnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgMenu.png"))); // NOI18N
        lblBtnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnmenuMouseClicked(evt);
            }
        });
        jPanel1.add(lblBtnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 16, -1, -1));

        lblBtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgIniciar.png"))); // NOI18N
        lblBtnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnIniciarMouseExited(evt);
            }
        });
        jPanel1.add(lblBtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 323, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnIniciarMouseEntered
        lblBtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgIniciar2.png")));
        
    }//GEN-LAST:event_lblBtnIniciarMouseEntered

    private void lblBtnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnIniciarMouseExited
        lblBtnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnImgIniciar.png")));
// TODO add your handling code here:
    }//GEN-LAST:event_lblBtnIniciarMouseExited

    private void lblBtnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnIniciarMouseClicked
        InterfazPregunta obj= new InterfazPregunta();
        obj.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBtnIniciarMouseClicked

    private void lblBtnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnmenuMouseClicked
        if (miniMenuPnl1.isVisible()) {
            miniMenuPnl1.setVisible(false);
        } else {
            miniMenuPnl1.setVisible(true);
        }
    }//GEN-LAST:event_lblBtnmenuMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazIniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBtnIniciar;
    private javax.swing.JLabel lblBtnmenu;
    private javax.swing.JLabel lblImgLogo2;
    private Front.MiniMenuPnl miniMenuPnl1;
    // End of variables declaration//GEN-END:variables
}
