/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Jonathan
 */
public class ArchToxLogin extends javax.swing.JFrame {
    
    char[] pass;
    String contraseña, user;
    int ID;
    /**
     * Creates new form ArchToxLogin
     */
    public ArchToxLogin() {
        //this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
//        Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
//        this.setSize(tamaño);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/archtox.png"));
        return retValue;
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
        LabelInfo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        CampoPass = new javax.swing.JPasswordField();
        CampoID = new javax.swing.JTextField();
        PanelButtonEntrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArchTox: Guía de Manejo para Pacientes Intoxicados");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelInfo.setFont(new java.awt.Font("Castellar", 0, 40)); // NOI18N
        LabelInfo.setText("ArchTox");
        jPanel2.add(LabelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archtox.png"))); // NOI18N
        jLabel1.setText("CONTRASEÑA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 530, 590));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 10));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("PARA PACIENTES INTOXICADOS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 10));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("GUÍAS DE MANEJO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Iniciar Sesión");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 180, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 180, 10));

        CampoPass.setBackground(new java.awt.Color(36, 47, 65));
        CampoPass.setForeground(new java.awt.Color(255, 255, 255));
        CampoPass.setText("jPasswordField1");
        CampoPass.setBorder(null);
        CampoPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoPassMouseClicked(evt);
            }
        });
        jPanel1.add(CampoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 180, 20));

        CampoID.setBackground(new java.awt.Color(36, 47, 65));
        CampoID.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CampoID.setForeground(new java.awt.Color(255, 255, 255));
        CampoID.setText("Ingresa tu ID de usuario");
        CampoID.setBorder(null);
        CampoID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoIDMouseClicked(evt);
            }
        });
        CampoID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoIDKeyTyped(evt);
            }
        });
        jPanel1.add(CampoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 180, 20));

        PanelButtonEntrar.setBackground(new java.awt.Color(255, 102, 102));
        PanelButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelButtonEntrarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("ENTRAR");

        javax.swing.GroupLayout PanelButtonEntrarLayout = new javax.swing.GroupLayout(PanelButtonEntrar);
        PanelButtonEntrar.setLayout(PanelButtonEntrarLayout);
        PanelButtonEntrarLayout.setHorizontalGroup(
            PanelButtonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonEntrarLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        PanelButtonEntrarLayout.setVerticalGroup(
            PanelButtonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 180, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USER ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoIDMouseClicked
//        CampoID.setText("");
    }//GEN-LAST:event_CampoIDMouseClicked

    private void CampoPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoPassMouseClicked
//        CampoPass.setText("");
    }//GEN-LAST:event_CampoPassMouseClicked

    private void PanelButtonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelButtonEntrarMouseClicked
        pass = CampoPass.getPassword(); 
        contraseña = new String(pass);
        user = CampoID.getText();
        if(user.isEmpty() || contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        }else{
            try {
                ID = Integer.parseInt(user);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Igrese su ID", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String u = iniciarSesion(ID, DigestUtils.md5Hex(contraseña));
            
            if(!u.equals("OK")){
                JOptionPane.showMessageDialog(null, u, "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                ArchToxHome home = new ArchToxHome();
                home.setVisible(true);
                ArchToxHome.setUser(ID);
                this.dispose();
            }
        }
    }//GEN-LAST:event_PanelButtonEntrarMouseClicked

    private void CampoIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoIDKeyTyped
        Consume(evt);
        if(CampoID.getText().length()==10){
            evt.consume();
        }
    }//GEN-LAST:event_CampoIDKeyTyped
    
    private void Consume(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if(c < '0' || c > '9'){
            evt.consume();
        }
    }
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
            java.util.logging.Logger.getLogger(ArchToxLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArchToxLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArchToxLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArchToxLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArchToxLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoID;
    private javax.swing.JPasswordField CampoPass;
    private javax.swing.JLabel LabelInfo;
    private javax.swing.JPanel PanelButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables

    private static String iniciarSesion(int idUser, java.lang.String keyPass) {
        ws.usuario.WSUsuario_Service service = new ws.usuario.WSUsuario_Service();
        ws.usuario.WSUsuario port = service.getWSUsuarioPort();
        return port.iniciarSesion(idUser, keyPass);
    }
    
}
