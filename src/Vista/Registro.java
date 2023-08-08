//WILMER
package Vista;

import Controlador.Validar_Email;
import Modelo.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        this.setLocationRelativeTo(this);
        this.setTitle("Registro");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rdni = new javax.swing.JTextField();
        rapellido = new javax.swing.JTextField();
        rcorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rcontraseña1 = new javax.swing.JPasswordField();
        rcontraseña2 = new javax.swing.JPasswordField();
        radmi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rnombre = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel10.setText("*Todos los campos son obligatorios");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Usuario");

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rdni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdni.setBorder(null);
        rdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdniActionPerformed(evt);
            }
        });

        rapellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rapellido.setBorder(null);
        rapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapellidoActionPerformed(evt);
            }
        });

        rcorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rcorreo.setBorder(null);
        rcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcorreoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("DNI:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Correo:");

        rcontraseña1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rcontraseña1.setBorder(null);
        rcontraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcontraseña1ActionPerformed(evt);
            }
        });

        rcontraseña2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rcontraseña2.setBorder(null);
        rcontraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcontraseña2ActionPerformed(evt);
            }
        });

        radmi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        radmi.setBorder(null);
        radmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radmiActionPerformed(evt);
            }
        });

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Contraseña");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Repetir Contraseña");

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Tipo de Usario:");

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rnombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rnombre.setBorder(null);
        rnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnombreActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Ya tengo una Cuenta");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Registrar.setBackground(new java.awt.Color(0, 0, 0));
        Registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registarse");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarMouseExited(evt);
            }
        });
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(salir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Registrar)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radmi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rcontraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rcontraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel12)
                                .addGap(20, 20, 20)
                                .addComponent(rapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel13)))
                        .addGap(20, 20, 20)
                        .addComponent(rdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14))
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 0, 0)
                .addComponent(jLabel16)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rcontraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel17))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(rcontraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(0, 0, 0)
                .addComponent(jLabel19)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 0, 0)
                .addComponent(jLabel20)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salir)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseExited
        Registrar.setForeground(Color.white);
        Registrar.setBackground(Color.black);
    }//GEN-LAST:event_RegistrarMouseExited

    private void RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseEntered
        Registrar.setForeground(Color.black);
        Registrar.setBackground(Color.white);
    }//GEN-LAST:event_RegistrarMouseEntered

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setForeground(Color.white);
        salir.setBackground(Color.black);
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setForeground(Color.black);
        salir.setBackground(Color.white);
    }//GEN-LAST:event_salirMouseEntered

    private void rnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnombreActionPerformed

    private void radmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radmiActionPerformed

    private void rcontraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcontraseña2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcontraseña2ActionPerformed

    private void rcontraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcontraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcontraseña1ActionPerformed

    private void rcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcorreoActionPerformed

    private void rapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rapellidoActionPerformed

    private void rdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdniActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        try {
            Validar_Email validar = new Validar_Email();
            String a = String.valueOf(rcontraseña1.getPassword());
            String b = String.valueOf(rcontraseña2.getPassword());

            //validar los datos ingresados en nombre apellido dni
            int contn = 0;
            int conte = 0;
            int contl = 0;
            int contan = 0;
            int contnn = 0;
            for (int j = 1; j <= 3; j++) {
                String Cadena = "";

                if (j == 1) {
                    Cadena = rdni.getText();
                } else if (j == 2) {
                    Cadena = rapellido.getText();
                } else {
                    Cadena = rnombre.getText();
                }

                for (int i = 0; i < Cadena.length(); i++) {
                    if (Character.isDigit(Cadena.charAt(i))) {
                        if (j == 1) {
                            contn++;
                        } else if (j == 2) {
                            contan++;
                        } else {
                            contnn++;
                        }
                    }
                    if (Character.isLetter(Cadena.charAt(i))) {
                        if (j == 1) {
                            contl++;
                        }
                    }

                    if (Character.isSpaceChar(Cadena.charAt(i))) {
                        if (j == 1) {
                            conte++;
                        }
                    }
                }
            }
            //consultar si ya existe registros con el dni y correo
            Querry consulta = new Querry();
            //dni
            int valordni=consulta.consultadni(rdni.getText());
            
            //correo
            int valorcorreo=consulta.consultemail(rcorreo.getText());
            
            //validar que los textos no esten vacios y que cumplan los requerimientos
            if (rnombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese Nombre");
            } else if (contnn == 0) {
                if (rapellido.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese Apellido");
                } else if (contan == 0) {
                    if (rdni.getText().equals("")) {
                        JOptionPane.showMessageDialog(rootPane, "Ingrese Dni");
                    } else if (contn == 8 && conte == 0 && contl == 0 && valordni==0) {
                        if (rcorreo.getText().equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Ingrese Correo");
                        } else if (validar.ValidarEmail(rcorreo.getText()) && valorcorreo==0) {
                            if (String.valueOf(rcontraseña1.getPassword()).equals("")) {
                                JOptionPane.showMessageDialog(rootPane, "Ingrese Contraseña");
                            } else {
                                if (String.valueOf(rcontraseña2.getPassword()).equals("")) {
                                    JOptionPane.showMessageDialog(rootPane, "Repita Contraseña");
                                } else {
                                    if (a.equals(b)) {
                                        //obtencion de todos los datos del jframe
                                        String Nombre, Apellido, Correo, contraseña, contraseadmin;
                                        int Dni = 0, idadmin = 0;
                                        Nombre = rnombre.getText();
                                        Apellido = rapellido.getText();
                                        Correo = rcorreo.getText();
                                        Dni = Integer.parseInt(rdni.getText());
                                        contraseña = String.valueOf(rcontraseña1.getPassword());
                                        contraseadmin = radmi.getText();
                                        //condicional contrasena admi
                                        if (contraseadmin.equals("admin")) {
                                            idadmin = 11;
                                        } else if (contraseadmin.equals("chef")) {
                                            idadmin = 12;
                                        } else if (contraseadmin.equals("mozo")) {
                                            idadmin = 13;
                                        } else {
                                            JOptionPane.showMessageDialog(rootPane, "Contraseña de tipo empleado fallida");
                                            radmi.setText("");
                                        }
                                        
                                        //enviar consulta ala bd
                                        if (idadmin != 0) {
                                            Empleados RegistroEmpleados = new Empleados(idadmin, Nombre, Apellido, Dni, Correo, contraseña);
                                            RegistroEmpleados.RegistarEmpleado();
                                            JOptionPane.showMessageDialog(rootPane, "Usuario Registrado");
                                            rnombre.setText("");
                                            rapellido.setText("");
                                            rdni.setText("");
                                            rcorreo.setText("");
                                            rcontraseña1.setText("");
                                            rcontraseña2.setText("");
                                            radmi.setText("");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(rootPane, "Contraseñas Diferentes");
                                    }
                                }
                            }
                        } else if(valorcorreo>=1){
                            JOptionPane.showMessageDialog(rootPane, "Ya existe ususarios registardos con este correo");
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Ingrese el correo en el siguiente formato: \n" + " example@micorreo.com");
                        }
                    } else if(valordni>=1){
                        JOptionPane.showMessageDialog(rootPane, "Ya existe usuarios registrados con este dni");
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "El Dni solo puede contener 8 numeros");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El apellido no puede tener numeros");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "El nombre no puede tener numeros");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al resgitrar");
        }
    }//GEN-LAST:event_RegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField radmi;
    private javax.swing.JTextField rapellido;
    private javax.swing.JPasswordField rcontraseña1;
    private javax.swing.JPasswordField rcontraseña2;
    private javax.swing.JTextField rcorreo;
    private javax.swing.JTextField rdni;
    private javax.swing.JTextField rnombre;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
