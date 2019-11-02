/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;


import PackegeRecursosHumanos.AdaptadorEmpleados;
import PackegeRecursosHumanos.Empleado;
import PackegeRecursosHumanos.Empleados;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;


/**
 *
 * @author User
 */
public class FRRHH extends javax.swing.JPanel {
   
        private File fotografia=null;
       
    /**
     * Creates new form FRRHH
     */
    public FRRHH() {
        initComponents();
       
        modificarEmpleados();
        mostrarEmpleados();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblCContrasena = new javax.swing.JLabel();
        sepCodigo = new javax.swing.JSeparator();
        sepCContrasena = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        sepNombre = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        sepUsuario = new javax.swing.JSeparator();
        txtContrasena = new javax.swing.JTextField();
        sepContrasena = new javax.swing.JSeparator();
        txtConfirmarContrasena = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblElegirFtg = new javax.swing.JLabel();
        botonFotografia = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbEmpleado = new javax.swing.JRadioButton();
        rbSAdministrador = new javax.swing.JRadioButton();
        rbAdministrador = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();

        pnlGeneral.setBackground(new java.awt.Color(52, 73, 85));
        pnlGeneral.setPreferredSize(new java.awt.Dimension(1280, 680));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        pnlGeneral.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        pnlGeneral.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        lblContrasena.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setText("Contraseña");
        pnlGeneral.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        lblCContrasena.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblCContrasena.setText("Confirmar contraseña");
        pnlGeneral.add(lblCContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 170, -1));
        pnlGeneral.add(sepCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, 10));
        pnlGeneral.add(sepCContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 200, 10));

        txtNombre.setBackground(new java.awt.Color(52, 73, 85));
        txtNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        pnlGeneral.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 200, 30));
        pnlGeneral.add(sepNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 200, 10));

        txtUsuario.setBackground(new java.awt.Color(52, 73, 85));
        txtUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        pnlGeneral.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 30));
        pnlGeneral.add(sepUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 200, 10));

        txtContrasena.setBackground(new java.awt.Color(52, 73, 85));
        txtContrasena.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasena.setBorder(null);
        pnlGeneral.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 200, 30));
        pnlGeneral.add(sepContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 200, 10));

        txtConfirmarContrasena.setBackground(new java.awt.Color(52, 73, 85));
        txtConfirmarContrasena.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtConfirmarContrasena.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmarContrasena.setBorder(null);
        pnlGeneral.add(txtConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 200, 30));

        txtCodigo.setBackground(new java.awt.Color(52, 73, 85));
        txtCodigo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        pnlGeneral.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 200, 30));

        lblCodigo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código");
        pnlGeneral.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jPanel1.setBackground(new java.awt.Color(249, 170, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recursos Humanos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        pnlGeneral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        pnlGeneral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 820, 140));

        jSeparator1.setBackground(new java.awt.Color(112, 112, 112));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlGeneral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1280, 10));

        jSeparator3.setBackground(new java.awt.Color(112, 112, 112));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlGeneral.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 10, 340));

        jPanel3.setBackground(new java.awt.Color(52, 73, 85));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fotografia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblElegirFtg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo imagen.png"))); // NOI18N
        jPanel3.add(lblElegirFtg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 250, 200));

        botonFotografia.setText("jButton2");
        botonFotografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFotografiaActionPerformed(evt);
            }
        });
        jPanel3.add(botonFotografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        pnlGeneral.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 350, 290));

        jPanel2.setBackground(new java.awt.Color(52, 73, 85));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbEmpleado.setBackground(new java.awt.Color(52, 73, 85));
        rbEmpleado.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        rbEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        rbEmpleado.setText("Empleado");
        rbEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(rbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        rbSAdministrador.setBackground(new java.awt.Color(52, 73, 85));
        rbSAdministrador.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        rbSAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        rbSAdministrador.setText("SubAdministrador");
        rbSAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSAdministradorActionPerformed(evt);
            }
        });
        jPanel2.add(rbSAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 40));

        rbAdministrador.setBackground(new java.awt.Color(52, 73, 85));
        rbAdministrador.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        rbAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        rbAdministrador.setText("Administrador");
        rbAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdministradorActionPerformed(evt);
            }
        });
        jPanel2.add(rbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 40));

        pnlGeneral.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 310, 240));

        jPanel5.setBackground(new java.awt.Color(52, 73, 85));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        botonModificar.setText("jButton2");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        jPanel5.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        pnlGeneral.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEmpleadoActionPerformed

    private void rbAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAdministradorActionPerformed

    private void rbSAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSAdministradorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       if(validarInsercion()==true){
           List<Empleado> empleado= null;
           Empleados empleados = new Empleados("http://icris17.pythonanywhere.com/api/recursoshumanos/");
           empleados.insertarEmpleado(txtCodigo.getText(),txtNombre.getText(),validarRol(),txtUsuario.getText(),
                   txtContrasena.getText(),fotografia);
           empleado = empleados.mostrarEmpleados();
           if(empleado!=null){
                AdaptadorEmpleados adaptadorEmpleados = new AdaptadorEmpleados(empleado);
                tablaEmpleados.setModel(adaptadorEmpleados.obtenerModelo());
           }
           limpiarDatos();
       }else{
           JOptionPane.showMessageDialog(null,"Complete los campos del Formulario");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonFotografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFotografiaActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        int opcion = jFileChooser.showOpenDialog(this);
        if(opcion == JFileChooser.APPROVE_OPTION){
            String rutaFoto = jFileChooser.getSelectedFile().getPath();
            fotografia = new File(rutaFoto);
            Image imagen = new ImageIcon(getClass().getResource(rutaFoto)).getImage();
            Image newimg = imagen.getScaledInstance(lblElegirFtg.getWidth(),lblElegirFtg.getHeight(),java.awt.Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(newimg); 
            lblElegirFtg.setIcon(imageIcon);
        }
        
    }//GEN-LAST:event_botonFotografiaActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        
        if(validarModificacion()==true){
            
            List<Empleado> empleado= null;
            Empleados empleados = new Empleados("http://icris17.pythonanywhere.com/api/recursoshumanos/"+txtCodigo.getText()+"/");
            empleados.modificarEmpleado(txtNombre.getText(),validarRol(),fotografia);
            empleado = empleados.mostrarEmpleados();
           if(empleado!=null){
                AdaptadorEmpleados adaptadorEmpleados = new AdaptadorEmpleados(empleado);
                tablaEmpleados.setModel(adaptadorEmpleados.obtenerModelo());
           }
            
        }else{
            JOptionPane.showMessageDialog(null,"Asegurese de que los campos estan completos");
        }
        
    }//GEN-LAST:event_botonModificarActionPerformed
    
    private void  modificarEmpleados(){
        tablaEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_evet){
                JTable tabla = (JTable) Mouse_evet.getSource();
                Point point = Mouse_evet.getPoint();
                if(Mouse_evet.getClickCount()==2){
                    limpiarDatos();
                    txtCodigo.setText(tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(),0).toString());
                    txtNombre.setText(tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(),1).toString());
                    String rol = tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(),2).toString();
                    if("Administrador".equals(rol)){
                        rbAdministrador.setSelected(true);
                    }else if("Empleado".equals(rol)){
                        rbEmpleado.setSelected(true);
                    }
                }
            }
        });
    }
    
    private boolean validarInsercion(){
        
        return !txtCodigo.getText().equals("")&&!txtNombre.getText().equals("")&&!txtUsuario.getText().equals("")&&
                !txtContrasena.getText().equals("")&&!txtConfirmarContrasena.getText().equals("");
    }
    
    private boolean validarModificacion(){
        
        return !txtNombre.getText().equals("") &&(rbAdministrador.isSelected() || rbEmpleado.isSelected());
        
    }
    
    public void mostrarEmpleados(){
        List<Empleado> empleado= null;
        Empleados empleados = new Empleados("http://icris17.pythonanywhere.com/api/recursoshumanos/");
        empleado = empleados.mostrarEmpleados();
           if(empleado!=null){
                AdaptadorEmpleados adaptadorEmpleados = new AdaptadorEmpleados(empleado);
                tablaEmpleados.setModel(adaptadorEmpleados.obtenerModelo());
           }
    }
    
    private boolean validarRol(){
        
        if(rbAdministrador.isSelected()){
            return true;
        }else if(rbEmpleado.isSelected()){
            return false;
        }else{
            return false;
        }
    }
    
    private void limpiarDatos(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtUsuario.setText("");
        rbAdministrador.setSelected(false);
        rbEmpleado.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFotografia;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCContrasena;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblElegirFtg;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbEmpleado;
    private javax.swing.JRadioButton rbSAdministrador;
    private javax.swing.JSeparator sepCContrasena;
    private javax.swing.JSeparator sepCodigo;
    private javax.swing.JSeparator sepContrasena;
    private javax.swing.JSeparator sepNombre;
    private javax.swing.JSeparator sepUsuario;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConfirmarContrasena;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
