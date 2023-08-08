//WILMER
package Vista;

import java.awt.Color;
import Modelo.*;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {    
    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rsUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        Registrare = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rsContraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Inicio de Sesion");

        rsUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rsUsuario.setBorder(null);
        rsUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rsUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rsUsuarioMousePressed(evt);
            }
        });
        rsUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña:");

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Login");
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIniciarMouseReleased(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        Registrare.setBackground(new java.awt.Color(0, 0, 0));
        Registrare.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Registrare.setForeground(new java.awt.Color(255, 255, 255));
        Registrare.setText("Registarse");
        Registrare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrareMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrareMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrareMouseExited(evt);
            }
        });
        Registrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrareActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo3.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Correo:");

        rsContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rsContraseña.setForeground(new java.awt.Color(204, 204, 204));
        rsContraseña.setText("*********************");
        rsContraseña.setBorder(null);
        rsContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rsContraseñaMousePressed(evt);
            }
        });
        rsContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsContraseñaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Registrare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rsContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addComponent(rsUsuario))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rsUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rsContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar)
                    .addComponent(Registrare))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrareActionPerformed
        Registro Rg= new Registro();
        Rg.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegistrareActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Querry consulta=new Querry();
        //obtener datos
        String correo=rsUsuario.getText();
        String contrasena=String.valueOf(rsContraseña.getPassword());
        //generar consulta
        int usuarios=consulta.login(correo, contrasena);
        //validar si existe usuarios registrados con esos datos
        if(usuarios==1){
            //validar tipo de usuario y abrir sus respectivas vistas
            int tipousuario =consulta.logintipodeusuario(correo);
            switch (tipousuario) {
                case 11:
                    Administrador admin=new Administrador();
                    admin.setVisible(true);
                    dispose();
                    break;
                case 12:
                case 14:
                case 15:
                    JfrmEmpleado empleado;
                    try {
                        empleado = new JfrmEmpleado(consulta.loginobteneridempleado(correo),consulta.loginobtenertipoempleado(correo),consulta.loginobteneridtipoempleado(correo));
                        empleado.setVisible(true);
                        dispose();
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 13:
                    Mesero mesero;
                    mesero = new Mesero(consulta.loginobteneridempleado(correo),consulta.loginobtenertipoempleado(correo),consulta.loginobteneridtipoempleado(correo));
                    mesero.setVisible(true);
                    dispose();
                    break;
                case 16:
                Recepcion recepcion;
                    recepcion = new Recepcion(consulta.loginobteneridempleado(correo),consulta.loginobtenertipoempleado(correo),consulta.loginobteneridtipoempleado(correo));
                    recepcion.setVisible(true);
                    dispose();
                    break;
                default:
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Correo y/o contraseña incorecta");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void rsUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsUsuarioMousePressed
        if(rsUsuario.getText().equals("Ingrese Correo")){
            rsUsuario.setText("");
            rsUsuario.setForeground(Color.black);
            
        }else if(rsUsuario.getText().equals("")){
            rsUsuario.setText("");
            rsUsuario.setForeground(Color.black);
        }
        
        if(String.valueOf(rsContraseña.getPassword()).isEmpty()){
            rsContraseña.setText("*********************");
            rsContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_rsUsuarioMousePressed

    private void rsUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rsUsuarioActionPerformed

    private void rsContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsContraseñaMousePressed
        if (String.valueOf(rsContraseña.getPassword()).equals("*********************")) {
            rsContraseña.setText("");
            rsContraseña.setForeground(Color.black);
        }

        if (String.valueOf(rsUsuario.getText()).isEmpty()) {
            rsUsuario.setText("Ingrese Correo");
            rsUsuario.setForeground(Color.gray);
        }

    }//GEN-LAST:event_rsContraseñaMousePressed

    private void rsContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rsContraseñaActionPerformed

    private void btnIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseReleased
        
    }//GEN-LAST:event_btnIniciarMouseReleased

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setForeground(Color.black);
        btnIniciar.setBackground(Color.white);
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setForeground(Color.white);
        btnIniciar.setBackground(Color.black);
    }//GEN-LAST:event_btnIniciarMouseExited

    private void RegistrareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrareMouseClicked
        
    }//GEN-LAST:event_RegistrareMouseClicked

    private void RegistrareMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrareMouseEntered
        Registrare.setForeground(Color.black);
        Registrare.setBackground(Color.white);
    }//GEN-LAST:event_RegistrareMouseEntered

    private void RegistrareMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrareMouseExited
        Registrare.setForeground(Color.white);
        Registrare.setBackground(Color.black);
    }//GEN-LAST:event_RegistrareMouseExited

  
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrare;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField rsContraseña;
    private javax.swing.JTextField rsUsuario;
    // End of variables declaration//GEN-END:variables

}
