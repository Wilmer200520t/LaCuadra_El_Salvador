//KEVIN
package Vista;

import Controlador.ConexionMysql;
import Controlador.Validar_Email;
import Modelo.Empleados;
import Modelo.Querry;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Adm_ListaUsuario extends javax.swing.JFrame {


    Empleados p = new Empleados();
    DefaultTableModel modelo = new DefaultTableModel();
   
    
    
    public Adm_ListaUsuario() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        this.setTitle("lISTA DE USUARIOS");
        this.setLocationRelativeTo(null);
        cargar(tb_Usuarios);
        
    }

    public void bloquear(){
        radmi.setEnabled(false);
        rapellido.setEnabled(false);
        rcorreo.setEnabled(false);
        rcontraseña1.setEnabled(false);
        rnombre.setEnabled(false);
        rdni.setEnabled(false);
        
        
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    public void limpiar(){
        radmi.setText("");
        rapellido.setText("");
        rcorreo.setText("");
        rcontraseña1.setText("");
        rnombre.setText("");
        rdni.setText("");
        
    }
    public void desbloquear(){
        radmi.setEnabled(true);
        rapellido.setEnabled(true);
        rcorreo.setEnabled(true);
        rcontraseña1.setEnabled(true);
        rnombre.setEnabled(true);
        rdni.setEnabled(true);
       
        
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnSalir.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    void limpiarTabla() {
        for (int i = 0; i < tb_Usuarios.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    public void cargar(JTable tabla){
       
         Querry dao = new Querry();
        modelo = (DefaultTableModel) tabla.getModel();

        List<Empleados> lista = dao.listar();
        Object[] objeto = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getId();
            objeto[1] = lista.get(i).getTipo_empleado();
            objeto[2] = lista.get(i).getNombre();
            objeto[3] = lista.get(i).getApellido();
            objeto[4] = lista.get(i).getDni();
            objeto[5] = lista.get(i).getCoreo();
            objeto[6] = lista.get(i).getContraseña();
            modelo.addRow(objeto);
        }
        tabla.setModel(modelo);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(40);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(6).setPreferredWidth(40);
    }
    
    public void EliminarRegistro(){
        
        Querry eliminar = new Querry();
        
        
        int filaSeleccionada = tb_Usuarios.getSelectedRow();
        int id=Integer.parseInt((String)tb_Usuarios.getValueAt(filaSeleccionada, 0).toString());
        
        if(filaSeleccionada>=0){
                eliminar.EliminarRegistro(id);
                JOptionPane.showMessageDialog(null, "Registro eliminado");  
        }else{
            JOptionPane.showMessageDialog(null, "Seleciona una fila");
        }
    }
    
    
    public void ActualizarRegistro(){
       
        Querry actualizar = new Querry();
            
        if (rdni.getText().equals("") || rnombre.getText().equals("") || rapellido.getText().equals("") || rcontraseña1.getText().equals("") || rcorreo.getText().equals("") || radmi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }else {
                
            int admi = Integer.parseInt(radmi.getText());
            int dni = Integer.parseInt(rdni.getText());
            String nom = rnombre.getText();
            String ape = rapellido.getText();
            String correo = rcorreo.getText();
            String contra = rcontraseña1.getText();
           
            p.setTipo_empleado(admi);
            p.setDni(dni);
            p.setNombre(nom);
            p.setApellido(ape);
            p.setCoreo(correo);
            p.setContraseña(contra);
           
            actualizar.ActualizarRegistro(p);
            
            JOptionPane.showMessageDialog(null, "Usuario actualizado");
        
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rdni = new javax.swing.JTextField();
        rapellido = new javax.swing.JTextField();
        rcorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rcontraseña1 = new javax.swing.JPasswordField();
        radmi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Usuarios = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        inicio = new javax.swing.JTextField();
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

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel7.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel1.setText("Nuevo  Usuario");

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rdni.setBackground(new java.awt.Color(0, 204, 204));
        rdni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdni.setBorder(null);
        rdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdniActionPerformed(evt);
            }
        });

        rapellido.setBackground(new java.awt.Color(0, 204, 204));
        rapellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rapellido.setBorder(null);
        rapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapellidoActionPerformed(evt);
            }
        });

        rcorreo.setBackground(new java.awt.Color(0, 204, 204));
        rcorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rcorreo.setBorder(null);
        rcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcorreoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("DNI:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Correo:");

        rcontraseña1.setBackground(new java.awt.Color(0, 204, 204));
        rcontraseña1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rcontraseña1.setBorder(null);
        rcontraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcontraseña1ActionPerformed(evt);
            }
        });

        radmi.setBackground(new java.awt.Color(0, 204, 204));
        radmi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        radmi.setBorder(null);
        radmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radmiActionPerformed(evt);
            }
        });

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Contraseña");

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("Tipo de Usario:");

        rnombre.setBackground(new java.awt.Color(0, 204, 204));
        rnombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rnombre.setBorder(null);
        rnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radmi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcontraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addGroup(jPanel7Layout.createSequentialGroup()
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
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 0, 0)
                .addComponent(jLabel16)
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(rcontraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel17))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(radmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel19))
                    .addComponent(jLabel11))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        tb_Usuarios.setBackground(new java.awt.Color(51, 153, 255));
        tb_Usuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tb_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdEmpleado", "IdTipo", "Nombre", "Apellido", "Dni", "Correo", "Contraseña"
            }
        ));
        tb_Usuarios.setRowHeight(35);
        tb_Usuarios.setSelectionBackground(new java.awt.Color(0, 0, 204));
        tb_Usuarios.setShowHorizontalLines(true);
        tb_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_UsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Usuarios);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-archivo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disquete.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/senal.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-x.png"))); // NOI18N
        btnEliminar.setText("Elliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, 820, 690));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 230, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        inicio.setEditable(false);
        inicio.setBackground(new java.awt.Color(255, 255, 255));
        inicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inicio.setText("INICIO");
        inicio.setAutoscrolls(false);
        inicio.setBorder(null);
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inicioMousePressed(evt);
            }
        });
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        lista.setEditable(false);
        lista.setBackground(new java.awt.Color(0, 0, 0));
        lista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lista.setForeground(new java.awt.Color(255, 255, 255));
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
        cliente.setBackground(new java.awt.Color(255, 255, 255));
        cliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrar, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inicio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(cliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(actividades, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(listapoducto, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 303, 400));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 310, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // ============Boton Nuevo ===========
        desbloquear();
        limpiar();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // ============Boton Guardar ===========
        
        try {
            Validar_Email validar = new Validar_Email();
            String a = String.valueOf(rcontraseña1.getPassword());
            //String b = String.valueOf(rcontraseña2.getPassword());

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
                            } 
                                
                                 else {
                                    if (a.equals(a)) {
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
                                        } else if (contraseadmin.equals("recepcionista")) {
                                            idadmin = 16;
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
                                            
                                            radmi.setText("");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(rootPane, "Contraseñas Diferentes");
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
        
        limpiarTabla();
        desbloquear();
        cargar(tb_Usuarios);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // ============Boton Actualizar ===========
       ActualizarRegistro();
        limpiar();
        limpiarTabla();
        cargar(tb_Usuarios);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // ============Boton Cancelar ===========

        bloquear();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // ============Boton Salir ===========
        Login login = new Login();
        login.setVisible(true);   
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // ============Boton Eliminar ===========
        EliminarRegistro();
        cargar(tb_Usuarios);
        limpiar();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void rdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdniActionPerformed

    private void rapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rapellidoActionPerformed

    private void rcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcorreoActionPerformed

    private void rcontraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcontraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcontraseña1ActionPerformed

    private void radmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radmiActionPerformed

    private void rnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnombreActionPerformed

    private void tb_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_UsuariosMouseClicked
         int filaseleccionada=tb_Usuarios.rowAtPoint(evt.getPoint());
        
        radmi.setText(tb_Usuarios.getValueAt(filaseleccionada, 1).toString());
        rnombre.setText(tb_Usuarios.getValueAt(filaseleccionada, 2).toString());
        rapellido.setText(tb_Usuarios.getValueAt(filaseleccionada, 3).toString());
        rdni.setText(tb_Usuarios.getValueAt(filaseleccionada, 4).toString());
        rcorreo.setText(tb_Usuarios.getValueAt(filaseleccionada, 5).toString());
        rcontraseña1.setText(tb_Usuarios.getValueAt(filaseleccionada, 6).toString());
       
    }//GEN-LAST:event_tb_UsuariosMouseClicked

    private void inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseEntered
        inicio.setForeground(Color.white);
        inicio.setBackground(Color.black);
    }//GEN-LAST:event_inicioMouseEntered

    private void inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseExited
        inicio.setForeground(Color.black);
        inicio.setBackground(Color.white);
    }//GEN-LAST:event_inicioMouseExited

    private void inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioMousePressed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioActionPerformed

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
        lista.setForeground(Color.white);
        lista.setBackground(Color.black);
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
        cliente.setForeground(Color.black);
        cliente.setBackground(Color.white);
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

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        Administrador adm=new Administrador();
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioMouseClicked

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
            java.util.logging.Logger.getLogger(Adm_ListaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adm_ListaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adm_ListaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adm_ListaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adm_ListaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actividades;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cerrar;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lista;
    private javax.swing.JTextField listapoducto;
    private javax.swing.JTextField radmi;
    private javax.swing.JTextField rapellido;
    private javax.swing.JPasswordField rcontraseña1;
    private javax.swing.JTextField rcorreo;
    private javax.swing.JTextField rdni;
    private javax.swing.JTextField rnombre;
    private javax.swing.JTable tb_Usuarios;
    // End of variables declaration//GEN-END:variables



}
