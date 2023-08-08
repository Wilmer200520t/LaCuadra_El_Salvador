//BRYAN
package Vista;

import Controlador.ConexionMysql;
import Modelo.ListaProductos;
import Modelo.Producto;
import Modelo.Querry;
import Modelo.registro_Producto;
import Modelo.tipo_producto_querry;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRYAN
 */
public class Adm_ListaProducto extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    registro_Producto p=new registro_Producto();
    ListaProductos a=new ListaProductos();
    public Adm_ListaProducto() {
         initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        this.setTitle("Administrador>>Lista de Productos");
        tipo_producto_querry cc = new tipo_producto_querry();

        DefaultComboBoxModel modelTipo = new DefaultComboBoxModel(cc.mostrarTipo());
        Combobox.setModel(modelTipo);
        this.setLocationRelativeTo(null);
        ListaProductos lista=new ListaProductos();
        lista.listarestado(tipoproducto);
        
    }
    
//           public void cargar (JTable tabla_producto){
//       Querry dao = new Querry();
//        modelo = (DefaultTableModel) tabla_producto.getModel();
//        List<Producto> lista = dao.listar_producto();
//        Object[] objeto = new Object[6];
//        for (int i = 0; i < lista.size(); i++) {
//            objeto[0] = lista.get(i).getIdproducto();
//            objeto[1] = lista.get(i).getIdtipo_producto();
//            objeto[2] = lista.get(i).getNombre();
//            objeto[3] = lista.get(i).getPrecio();
//            objeto[4] = lista.get(i).getTiempo();
//            modelo.addRow(objeto);    
//   } 
//        tabla_producto.setModel(modelo);
//        tabla_producto.getColumnModel().getColumn(0).setPreferredWidth(100);
//        tabla_producto.getColumnModel().getColumn(1).setPreferredWidth(40);
//        tabla_producto.getColumnModel().getColumn(2).setPreferredWidth(60);
//        tabla_producto.getColumnModel().getColumn(3).setPreferredWidth(60);
//        tabla_producto.getColumnModel().getColumn(4).setPreferredWidth(60);
//   }

    //ACTUALIZAR REGISTRO PRODUCTOS
    public void ActualizarRegistro(){
            
        if (txtProducto.getText().equals("") || txtPrecio.getText().equals("") || txtTiempo.getText().equals("") || tipoproducto.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }else {          
            String admi = (txtProducto.getText());
            double  pre= Double.parseDouble(txtPrecio.getText());
            double tiem = Double.parseDouble (txtTiempo.getText());
           // String tip = tipoproducto.getSelectedItem().toString();
            int id=Integer.parseInt(lblIDProducto.getText());
            
            p.setNombre(admi);
            p.setPrecio(pre);
            p.setTiempo(tiem);
            p.setID(id);
            a.ActualizarRegistroP(p);
            
            JOptionPane.showMessageDialog(null, "Registro actualizado");
        } 
    }
    
    //ELIMIAR REGISTRO PRODUCTOS
    
        public void EliminarRegistroP(){ 
        ListaProductos eliminar = new ListaProductos(); 
        int filaSeleccionada = tabla_producto.getSelectedRow();
        int id=Integer.parseInt((String)tabla_producto.getValueAt(filaSeleccionada, 0).toString());
        
        if(filaSeleccionada>=0){
                eliminar.EliminarRegistroP(id);
                JOptionPane.showMessageDialog(null, "Registro eliminado");  
        }else{
            JOptionPane.showMessageDialog(null, "Seleciona una fila");
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_producto = new javax.swing.JTable();
        Combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnactualizar2 = new javax.swing.JButton();
        btnagregar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tipoproducto = new javax.swing.JComboBox<>();
        lblIDProducto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        tabla_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_productoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_producto);

        Combobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboboxItemStateChanged(evt);
            }
        });
        Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Tipo de Producto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Lista de Productos");

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel7.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel4.setText("Registrar Producto");
        jLabel4.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Producto:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Tiempo Preparacion:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Precio:");

        txtProducto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtProducto.setBorder(null);
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTiempo.setBorder(null);
        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        btnactualizar2.setBackground(new java.awt.Color(255, 0, 0));
        btnactualizar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnactualizar2.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar2.setText("Actualizar");
        btnactualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar2ActionPerformed(evt);
            }
        });

        btnagregar1.setBackground(new java.awt.Color(255, 0, 0));
        btnagregar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnagregar1.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar1.setText("Agregar");
        btnagregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregar1MouseClicked(evt);
            }
        });
        btnagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregar1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Tipo de Producto:");

        lblIDProducto.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblIDProducto.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("IDProducto:");

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnagregar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(247, 247, 247)
                        .addComponent(btnactualizar2)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProducto)
                            .addComponent(tipoproducto, 0, 250, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(331, 331, 331))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(111, 111, 111))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblIDProducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(tipoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar1)
                            .addComponent(btnactualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(313, 313, 313))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, 900, 690));

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
        listapoducto.setBackground(new java.awt.Color(0, 0, 0));
        listapoducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listapoducto.setForeground(new java.awt.Color(255, 255, 255));
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
                        .addComponent(inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(lista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(actividades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
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
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 303, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void actividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actividadesActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        
    }//GEN-LAST:event_cerrarActionPerformed

    private void listaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseEntered
        lista.setForeground(Color.white);
	lista.setBackground(Color.black);
    }//GEN-LAST:event_listaMouseEntered

    private void inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseEntered
        inicio.setForeground(Color.white);
	inicio.setBackground(Color.black);
    }//GEN-LAST:event_inicioMouseEntered

    private void inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseExited
        inicio.setForeground(Color.black);
	inicio.setBackground(Color.white);
    }//GEN-LAST:event_inicioMouseExited

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cerrar.setForeground(Color.white);
	cerrar.setBackground(Color.black);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        cerrar.setForeground(Color.black);
	cerrar.setBackground(Color.white);
    }//GEN-LAST:event_cerrarMouseExited

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
       Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        Adm_ListaUsuario lista= new Adm_ListaUsuario();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_listaMouseClicked

    private void listaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseExited
        lista.setForeground(Color.black);
	lista.setBackground(Color.white);
    }//GEN-LAST:event_listaMouseExited

    private void actividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadesMouseClicked
        Adm_Actividades act= new Adm_Actividades();
         act.setVisible(true);
         dispose();

    }//GEN-LAST:event_actividadesMouseClicked

    private void clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseEntered
        cliente.setForeground(Color.white);
        cliente.setBackground(Color.black);
    }//GEN-LAST:event_clienteMouseEntered

    private void clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseExited
        cliente.setForeground(Color.black);
        cliente.setBackground(Color.white);
    }//GEN-LAST:event_clienteMouseExited

    private void actividadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadesMouseEntered
        actividades.setForeground(Color.white);
        actividades.setBackground(Color.black);
    }//GEN-LAST:event_actividadesMouseEntered

    private void actividadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadesMouseExited
        actividades.setForeground(Color.black);
        actividades.setBackground(Color.white);
    }//GEN-LAST:event_actividadesMouseExited

    private void clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseClicked
        Adm_Cliente cli = new Adm_Cliente();
        cli.setVisible(true);
        dispose();
    }//GEN-LAST:event_clienteMouseClicked

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
        listapoducto.setForeground(Color.white);
        listapoducto.setBackground(Color.black);
    }//GEN-LAST:event_listapoductoMouseExited

    private void listapoductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listapoductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listapoductoActionPerformed

    private void ComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboboxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            tipo_producto_querry ti = (tipo_producto_querry) Combobox.getSelectedItem();
            try {
                DefaultTableModel modelo = new DefaultTableModel();
                tabla_producto.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                ConexionMysql conn = new ConexionMysql();
                java.sql.Connection con = conn.getconexion();

                String sql = "SELECT * FROM producto WHERE idTipo_Producto=" + ti.getId();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("ID");
                modelo.addColumn("ID Tipo");
                modelo.addColumn("Nombre");
                modelo.addColumn("Precio");
                modelo.addColumn("Tiempo");

                while (rs.next()) {
                    Object[] filas = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }

            } catch (SQLException ex) {
                System.err.println(ex.toString());
            }
        }
    }//GEN-LAST:event_ComboboxItemStateChanged

    private void ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboboxActionPerformed

    private void inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioMousePressed

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        Administrador adm=new Administrador();
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_inicioMouseClicked

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnactualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar2ActionPerformed
        ActualizarRegistro();
    }//GEN-LAST:event_btnactualizar2ActionPerformed

    private void btnagregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregar1MouseClicked

    private void btnagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregar1ActionPerformed
        ListaProductos productos=new ListaProductos();

        String nombre=txtProducto.getText();
        double tiempo=Double.parseDouble(txtTiempo.getText());
        double precio=Double.parseDouble(txtPrecio.getText());
        String tipoSplit=tipoproducto.getSelectedItem().toString();
        String tipo=tipoSplit.split(" - ")[0];
        int ID=productos.generarIdProducto();

        productos.registroproducto(ID,Integer.parseInt(tipo), nombre, precio, tiempo);
    }//GEN-LAST:event_btnagregar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        EliminarRegistroP();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tabla_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_productoMouseClicked
        int filaseleccionada=tabla_producto.rowAtPoint(evt.getPoint());
       
        lblIDProducto.setText(tabla_producto.getValueAt(filaseleccionada, 0).toString());
        tipoproducto.setActionCommand(tabla_producto.getValueAt(filaseleccionada, 1).toString());
        txtProducto.setText(tabla_producto.getValueAt(filaseleccionada, 2).toString());
        txtTiempo.setText(tabla_producto.getValueAt(filaseleccionada, 3).toString());
        txtPrecio.setText(tabla_producto.getValueAt(filaseleccionada, 4).toString());
    }//GEN-LAST:event_tabla_productoMouseClicked

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
            java.util.logging.Logger.getLogger(Adm_ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adm_ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adm_ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adm_ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adm_ListaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Combobox;
    private javax.swing.JTextField actividades;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnactualizar2;
    public javax.swing.JButton btnagregar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cerrar;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIDProducto;
    private javax.swing.JTextField lista;
    private javax.swing.JTextField listapoducto;
    private javax.swing.JTable tabla_producto;
    private javax.swing.JComboBox<String> tipoproducto;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtProducto;
    public javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
