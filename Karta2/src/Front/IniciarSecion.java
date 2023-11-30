/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Isis
 */

public class IniciarSecion extends javax.swing.JFrame {
    int mouseSx,mouseSy;
    /**
     * Creates new form IniciarSecion
     */
    public IniciarSecion() {
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
        jPanel2 = new javax.swing.JPanel();
        ISbtnReg = new javax.swing.JLabel();
        iniSetxt = new javax.swing.JLabel();
        ISbtnCt = new javax.swing.JLabel();
        nombreIS = new javax.swing.JLabel();
        nombreIStxt = new javax.swing.JTextField();
        passIStxt = new javax.swing.JPasswordField();
        passIS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        ISbtnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Group 35_1.png"))); // NOI18N
        ISbtnReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ISbtnReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ISbtnRegMouseClicked(evt);
            }
        });

        iniSetxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        iniSetxt.setText("Iniciar Sesión");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ISbtnReg)
                .addGap(29, 29, 29)
                .addComponent(iniSetxt)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iniSetxt)
                    .addComponent(ISbtnReg))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        ISbtnCt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Group 35 (1).png"))); // NOI18N
        ISbtnCt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ISbtnCt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ISbtnCtMouseClicked(evt);
            }
        });
        jPanel1.add(ISbtnCt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        nombreIS.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nombreIS.setText("Nombre");
        jPanel1.add(nombreIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));
        jPanel1.add(nombreIStxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 150, -1));

        passIStxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passIStxtActionPerformed(evt);
            }
        });
        jPanel1.add(passIStxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 140, -1));

        passIS.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        passIS.setText("Contraseña");
        jPanel1.add(passIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 275));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passIStxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passIStxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passIStxtActionPerformed

    private void ISbtnRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ISbtnRegMouseClicked
        this.hide();
        InterfazIniciarCrearPerfil obj=new InterfazIniciarCrearPerfil();
        obj.setVisible(true);
    }//GEN-LAST:event_ISbtnRegMouseClicked

    private void ISbtnCtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ISbtnCtMouseClicked
        
        InterfazIniciar obj =new InterfazIniciar();
        obj.setVisible(true);
        this.hide();
    }//GEN-LAST:event_ISbtnCtMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseSx=evt.getX();
        mouseSy=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-mouseSx,y-mouseSy);
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(IniciarSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSecion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ISbtnCt;
    private javax.swing.JLabel ISbtnReg;
    private javax.swing.JLabel iniSetxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreIS;
    private javax.swing.JTextField nombreIStxt;
    private javax.swing.JLabel passIS;
    private javax.swing.JPasswordField passIStxt;
    // End of variables declaration//GEN-END:variables
}

