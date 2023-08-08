//WILMER
package Vista;

import Modelo.Querry;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public final class JfrmEmpleado extends javax.swing.JFrame {
    int idInciado;
    int TipoEmpleado;
    
    public JfrmEmpleado(int idEmpleado, String NombreVentana,int TipoEmpleado) throws SQLException {
        this.idInciado=idEmpleado;
        this.TipoEmpleado=TipoEmpleado;
        Querry query=new Querry();
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        this.setTitle(NombreVentana+">>"+idEmpleado);
        this.setLocationRelativeTo(null);
        filtrardatosenTabla(idInciado,10000000);
        //lennar combox
        if(ComboEstado.getItemCount()<=1){
            query.listarestado(ComboEstado);
        }
        //desabilitar combo
        ComboEstado.setEnabled(false);
        //banner
        query.Banner(banner, idEmpleado, NombreVentana);
    }
    
    
    
    public void filtrardatosenTabla(int idempleado,int idinicial) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("idPedido");
        modelo.addColumn("idLista");
        modelo.addColumn("Mesa");
        modelo.addColumn("Cant.");
        modelo.addColumn("Plato");
        modelo.addColumn("cliente");
        modelo.addColumn("Mozo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Estado");
       Tabla.setModel(modelo);
       //tamaño de alas columnas
        Tabla.getColumnModel().getColumn(0).setPreferredWidth(25);
        Tabla.getColumnModel().getColumn(1).setPreferredWidth(25);
        Tabla.getColumnModel().getColumn(2).setPreferredWidth(2);
        Tabla.getColumnModel().getColumn(3).setPreferredWidth(2);
        Tabla.getColumnModel().getColumn(4).setPreferredWidth(150);
        Tabla.getColumnModel().getColumn(5).setPreferredWidth(70);
        Tabla.getColumnModel().getColumn(6).setPreferredWidth(70);
        Tabla.getColumnModel().getColumn(7).setPreferredWidth(250);
        Tabla.getColumnModel().getColumn(8).setPreferredWidth(25);
        //clase querry
        String[] datos = new String[9];
        int[] tipodePedido = new int[2];
        Querry qr = new Querry();
        String juntadequerry="";
        String query="100";
        switch (TipoEmpleado) {

            case 12:
                tipodePedido[0] = 100;
                tipodePedido[1] = 101;
                break;
            case 14:
                tipodePedido[0] = 102;
                tipodePedido[1] = 103;
                break;
            case 15:
                tipodePedido[0] = 104;
                tipodePedido[1] = 104;
                break;
            default:
                break;
        }
        for (int i = 0; i< tipodePedido.length; i++) {
            if (i == 0) {
                juntadequerry = tipodePedido[i] + "";
            } else if (i >= 1) {
                juntadequerry = "' OR tipo_producto.idTipo_Producto='" + tipodePedido[i];
            }
            query+=juntadequerry;
        };
        try {
                ResultSet rs = qr.mostrarDatosPedidos(idempleado, idinicial,query);
                while (rs.next()) {
                    //id pedido
                    datos[0] = rs.getString(2);
                    //id Lista de Pedido
                    datos[1] = rs.getString(1);
                    //mesa
                    datos[2] = rs.getString(12);
                    //cant
                    datos[3] = rs.getString(4);
                    //plato
                    datos[4] = rs.getString(15);
                    //cliente
                    datos[5] = qr.consultanombrcliente(rs.getString(10));
                    //empleado
                    datos[6] = qr.consultanombreempleado(rs.getString(9));
                    //descripcion
                    datos[7] = rs.getString(5);
                    //estado
                    datos[8] = qr.consultaestado(rs.getString(7));
                    modelo.addRow(datos);
                }
        } catch (SQLException e) {
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCerrarSecion = new javax.swing.JTextField();
        ComboEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        IDLista = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("ID Lista de Pedio:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Lista de Pedidos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Mostar");

        comboTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Mis pedidos selecionados", "Pedidos En espera" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acceso.png"))); // NOI18N

        btnCerrarSecion.setEditable(false);
        btnCerrarSecion.setBackground(new java.awt.Color(255, 0, 51));
        btnCerrarSecion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarSecion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSecion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        btnCerrarSecion.setText("Cerrar sesión");
        btnCerrarSecion.setToolTipText("");
        btnCerrarSecion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSecionMouseClicked(evt);
            }
        });
        btnCerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSecionActionPerformed(evt);
            }
        });

        ComboEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        ComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEstadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Estado");

        IDLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDLista.setText("Sin Selecionar");
        IDLista.setEnabled(false);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.setFocusable(false);
        Tabla.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla.setOpaque(false);
        Tabla.setRequestFocusEnabled(false);
        Tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tabla.setUpdateSelectionOnSort(false);
        Tabla.setVerifyInputWhenFocusTarget(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        banner.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        banner.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(576, 576, 576)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(banner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(IDLista, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(288, 288, 288)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7)
                            .addComponent(btnCerrarSecion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(IDLista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSecionActionPerformed
        
    }//GEN-LAST:event_btnCerrarSecionActionPerformed

    private void btnCerrarSecionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSecionMouseClicked
        Login nwlg=new Login();
        nwlg.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarSecionMouseClicked

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        String Tipo=String.valueOf(comboTipo.getSelectedItem());
        if(null != Tipo)switch (Tipo) {
            case "Todos":
                try {
                    filtrardatosenTabla(idInciado,10000000);
                } catch (SQLException ex) {
                    Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case "Mis pedidos selecionados":
                try {
                    filtrardatosenTabla(idInciado,idInciado);
                } catch (SQLException ex) {
                    Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case "Pedidos En espera":
                try {
                    filtrardatosenTabla(10000000,10000000);
                } catch (SQLException ex) {
                    Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            default:
                break;
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void ComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEstadoActionPerformed

        Querry actualizar=new Querry();
        
        if(ComboEstado.getItemCount()<=1){
            actualizar.listarestado(ComboEstado);
        }
        //obtiene dato de columna selecionada
        String IDlista=Tabla.getValueAt(Tabla.getSelectedRow(),1).toString();
        
        //obtiene dato de combo box selecionado
        String combobox=String.valueOf(ComboEstado.getSelectedItem());
        //consultar el id con la base de datos
        int valorid=actualizar.consultaridestado(combobox);
        //actualizar JfrmEmpleado
        switch (valorid) {
            case 10:
                actualizar.Actulizarchefdepedido(Integer.parseInt(IDlista),10000000);
                break;
            case 20:
                valorid=10;
                actualizar.Actulizarchefdepedido(Integer.parseInt(IDlista),10000000);
                break;
            default:
                actualizar.Actulizarchefdepedido(Integer.parseInt(IDlista),idInciado );
                break;
        }
        //actualizar estado
        actualizar.Actualizarestado(IDlista, valorid);
        //refresca la Tabla
        String Tipo=String.valueOf(comboTipo.getSelectedItem());
        if(null != Tipo)switch (Tipo) {
            case "Todos":
                try {
                    filtrardatosenTabla(idInciado,10000000);
                } catch (SQLException ex) {
                    Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case "Mis pedidos selecionados":
                try {
                    filtrardatosenTabla(idInciado,idInciado);
                } catch (SQLException ex) {
                    Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case "Pedidos En espera":
                try {
                    filtrardatosenTabla(10000000,10000000);
                } catch (SQLException ex) {
                    Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            default:
                break;
        }
        IDLista.setText("Sin Seleccionar");
        ComboEstado.setEnabled(false);
    }//GEN-LAST:event_ComboEstadoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        ComboEstado.setEnabled(true);
        String ID=Tabla.getValueAt(Tabla.getSelectedRow(),1).toString();
        Querry query=new Querry();
        IDLista.setText(ID);
        ComboEstado.addItem(String.valueOf(query.consultaridestadodecliente(Integer.parseInt(ID))));
    }//GEN-LAST:event_TablaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JfrmEmpleado(0,"Sin Asignar",0).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JTextField IDLista;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel banner;
    private javax.swing.JTextField btnCerrarSecion;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
