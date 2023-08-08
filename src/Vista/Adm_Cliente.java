//BRYAN
package Vista;

import Modelo.Empleados;
import Modelo.Querry;
import Modelo.cliente;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRYAN
 */
public class Adm_Cliente extends javax.swing.JFrame {
    cliente p=new cliente();
     DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form Adm_Cliente
     */
    public Adm_Cliente() {
         initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        this.setTitle("Administrador");
        this.setLocationRelativeTo(null);
        cargar(Tabla2);
    }
    
   public void cargar (JTable Tabla2){
       Querry dao = new Querry();
        modelo = (DefaultTableModel) Tabla2.getModel();
        List<cliente> lista = dao.cliente();
        Object[] objeto = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getApellido();
            objeto[3] = lista.get(i).getDni();
            modelo.addRow(objeto);    
   } 
        Tabla2.setModel(modelo);
        Tabla2.getColumnModel().getColumn(0).setPreferredWidth(100);
        Tabla2.getColumnModel().getColumn(1).setPreferredWidth(40);
        Tabla2.getColumnModel().getColumn(2).setPreferredWidth(60);
        Tabla2.getColumnModel().getColumn(3).setPreferredWidth(60);
   }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        inicio2 = new javax.swing.JTextField();
        lista = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        actividades = new javax.swing.JTextField();
        cerrar = new javax.swing.JTextField();
        listapoducto = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("INFORME DE CLIENTES");

        Tabla2.setBackground(new java.awt.Color(51, 153, 255));
        Tabla2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla2.setRowHeight(35);
        Tabla2.setSelectionBackground(new java.awt.Color(0, 0, 204));
        Tabla2.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(Tabla2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1)
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, 820, 690));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 230, 230));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        inicio2.setEditable(false);
        inicio2.setBackground(new java.awt.Color(255, 255, 255));
        inicio2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inicio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inicio2.setText("INICIO");
        inicio2.setAutoscrolls(false);
        inicio2.setBorder(null);
        inicio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicio2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicio2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicio2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inicio2MousePressed(evt);
            }
        });
        inicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio2ActionPerformed(evt);
            }
        });

        lista.setEditable(false);
        lista.setBackground(new java.awt.Color(255, 255, 255));
        lista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lista.setText("LISTA DE USUARIOS");
        lista.setBorder(null);
        lista.setCaretColor(new java.awt.Color(255, 255, 255));
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaMouseExited(evt);
            }
        });
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });

        cliente.setEditable(false);
        cliente.setBackground(new java.awt.Color(0, 0, 0));
        cliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cliente.setForeground(new java.awt.Color(255, 255, 255));
        cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cliente.setText("CLIENTE");
        cliente.setBorder(null);
        cliente.setCaretColor(new java.awt.Color(255, 255, 255));
        cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clienteMouseExited(evt);
            }
        });
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });

        actividades.setEditable(false);
        actividades.setBackground(new java.awt.Color(255, 255, 255));
        actividades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actividades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        actividades.setText("ACTIVIDADES");
        actividades.setBorder(null);
        actividades.setCaretColor(new java.awt.Color(255, 255, 255));
        actividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actividadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actividadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actividadesMouseExited(evt);
            }
        });
        actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actividadesActionPerformed(evt);
            }
        });

        cerrar.setEditable(false);
        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cerrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cerrar.setText("CERRAR SECCION");
        cerrar.setBorder(null);
        cerrar.setCaretColor(new java.awt.Color(255, 255, 255));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        listapoducto.setEditable(false);
        listapoducto.setBackground(new java.awt.Color(255, 255, 255));
        listapoducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listapoducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        listapoducto.setText("LISTA DE PRODUCTOS");
        listapoducto.setBorder(null);
        listapoducto.setCaretColor(new java.awt.Color(255, 255, 255));
        listapoducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listapoductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listapoductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listapoductoMouseExited(evt);
            }
        });
        listapoducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listapoductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrar, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inicio2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(lista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(actividades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                    .addComponent(listapoducto, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(inicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listapoducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 303, 400));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 303, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicio2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio2MouseEntered
        inicio2.setForeground(Color.white);
        inicio2.setBackground(Color.black);
    }//GEN-LAST:event_inicio2MouseEntered

    private void inicio2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio2MouseExited
        inicio2.setForeground(Color.black);
        inicio2.setBackground(Color.white);
    }//GEN-LAST:event_inicio2MouseExited

    private void inicio2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicio2MousePressed

    private void inicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicio2ActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        Adm_ListaUsuario lista= new Adm_ListaUsuario();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_listaMouseClicked

    private void listaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseEntered
        lista.setForeground(Color.white);
        lista.setBackground(Color.black);
    }//GEN-LAST:event_listaMouseEntered

    private void listaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseExited
        lista.setForeground(Color.black);
        lista.setBackground(Color.white);
    }//GEN-LAST:event_listaMouseExited

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaActionPerformed

    private void clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseClicked
        Adm_Cliente cli = new Adm_Cliente();
        cli.setVisible(true);
        dispose();
    }//GEN-LAST:event_clienteMouseClicked

    private void clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseEntered
        cliente.setForeground(Color.white);
        cliente.setBackground(Color.black);
    }//GEN-LAST:event_clienteMouseEntered

    private void clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseExited
        cliente.setForeground(Color.white);
        cliente.setBackground(Color.black);
    }//GEN-LAST:event_clienteMouseExited

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void actividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadesMouseClicked
        Adm_Actividades act= new Adm_Actividades();
        act.setVisible(true);
        dispose();
    }//GEN-LAST:event_actividadesMouseClicked

    private void actividadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadesMouseEntered
        actividades.setForeground(Color.white);
        actividades.setBackground(Color.black);
    }//GEN-LAST:event_actividadesMouseEntered

    private void actividadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadesMouseExited
        actividades.setForeground(Color.black);
        actividades.setBackground(Color.white);
    }//GEN-LAST:event_actividadesMouseExited

    private void actividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actividadesActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cerrar.setForeground(Color.white);
        cerrar.setBackground(Color.black);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        cerrar.setForeground(Color.black);
        cerrar.setBackground(Color.white);
    }//GEN-LAST:event_cerrarMouseExited

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed

    }//GEN-LAST:event_cerrarActionPerformed

    private void listapoductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listapoductoMouseClicked
        Adm_ListaProducto lista=new Adm_ListaProducto();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_listapoductoMouseClicked

    private void listapoductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listapoductoMouseEntered
        listapoducto.setForeground(Color.white);
        listapoducto.setBackground(Color.black);
    }//GEN-LAST:event_listapoductoMouseEntered

    private void listapoductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listapoductoMouseExited
        listapoducto.setForeground(Color.black);
        listapoducto.setBackground(Color.white);
    }//GEN-LAST:event_listapoductoMouseExited

    private void listapoductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listapoductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listapoductoActionPerformed

    private void inicio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio2MouseClicked
        Administrador adm=new Administrador();
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_inicio2MouseClicked

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
            java.util.logging.Logger.getLogger(Adm_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adm_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adm_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adm_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adm_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla2;
    private javax.swing.JTextField actividades;
    private javax.swing.JTextField cerrar;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField inicio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lista;
    private javax.swing.JTextField listapoducto;
    // End of variables declaration//GEN-END:variables

    
}
