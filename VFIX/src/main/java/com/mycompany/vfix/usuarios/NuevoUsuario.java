/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vfix.usuarios;

import com.mycompany.vfix.usuarios.peticiones.InsertarUsuario;
import com.mycompany.vfix.usuarios.peticiones.FabricaPeticion;
import com.mycompany.vfix.usuarios.peticiones.Peticion;
import com.mycompany.vfix.usuarios.peticiones.EjecutarPeticion;
import com.mycompany.vfix.estilos.TextPrompt;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.http.HttpEntity;

/**
 *
 * @author carlo
 */
public class NuevoUsuario extends javax.swing.JFrame {
    
    private int x;
    private int y;
    private String rutaImagen="";
    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario() {
        initComponents();
        placeHolder();
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
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtContra = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        txtConfirmarContra = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnEmpleado = new javax.swing.JButton();
        rol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 159, 128)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 46, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Empleado");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 270, -1));

        btnCerrar.setBackground(new java.awt.Color(26, 46, 70));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 50, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 30));

        jSeparator3.setBackground(new java.awt.Color(54, 159, 128));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, 10));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 30));

        jSeparator5.setBackground(new java.awt.Color(54, 159, 128));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 10));

        txtContra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContra.setBorder(null);
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 30));

        jSeparator7.setBackground(new java.awt.Color(54, 159, 128));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 190, 10));

        txtConfirmarContra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConfirmarContra.setBorder(null);
        jPanel1.add(txtConfirmarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 30));

        jSeparator8.setBackground(new java.awt.Color(54, 159, 128));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 159, 128)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 210, 180));

        jButton1.setBackground(new java.awt.Color(54, 159, 128));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seleccionar Fotografia");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 210, 30));

        btnEmpleado.setBackground(new java.awt.Color(26, 46, 70));
        btnEmpleado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleado.setText("Ingresar Empleado");
        btnEmpleado.setBorder(null);
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 250, 40));

        rol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        rol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(54, 159, 128))); // NOI18N
        jPanel1.add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x= evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x-x, point.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        // TODO add your handling code here:  
        if(validarCamposdeTexto()){
            
           if(txtContra.getText().equals(txtConfirmarContra.getText())){
              
                   Peticion insertarEmpleado = new InsertarUsuario(txtNombre.getText(),txtUsuario.getText(),Encriptacion.getEncriptacion(txtContra.getText()),
                           validarRol(rol.getSelectedItem().toString()));
                   
                   FabricaPeticion fabricaPeticion = new FabricaPeticion();
                   Peticion peticion = fabricaPeticion.getPeticion(insertarEmpleado, rutaImagen);
                   EjecutarPeticion ejecutarPeticion = new EjecutarPeticion();
                   
                   ejecutarPeticion.Insertar(peticion.getPeticion().build());
           
           }else{
               JOptionPane.showMessageDialog(null, "Las contraseñas no coincicen");
           }
            
        }else{
            JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
        }
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        FileFilter imaFileFilter = new FileNameExtensionFilter("Imagenes","png","jpg");
        jFileChooser.addChoosableFileFilter(imaFileFilter);
        int aprobado = jFileChooser.showOpenDialog(this);
        
        if(aprobado==JFileChooser.APPROVE_OPTION){
            File file = jFileChooser.getSelectedFile();
            System.out.println(file);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }
    
    private void placeHolder(){
        TextPrompt nombre = new TextPrompt("Nombre", txtNombre);
        TextPrompt usuario = new TextPrompt("Usuario", txtUsuario);
        TextPrompt contrasena = new TextPrompt("Contraseña", txtContra);
        TextPrompt confirmarContra = new TextPrompt("Confirmar Contraseña", txtConfirmarContra);
        
    }
    
    private boolean validarCamposdeTexto(){
     
         return !txtNombre.getText().isEmpty() && !txtUsuario.getText().isEmpty() && !txtContra.getText().isEmpty();
    }
    
    private boolean validarRol(String rol){
        
        return rol.equals("Administrador");
    }
    
    private void limpiarCampos(){
        txtNombre.setText("");
        txtUsuario.setText("");
        txtContra.setText("");
        txtConfirmarContra.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JPasswordField txtConfirmarContra;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
