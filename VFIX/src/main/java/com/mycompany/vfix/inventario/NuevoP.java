/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vfix.inventario;

import com.mycompany.vfix.estilos.TextPrompt;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.http.entity.mime.content.FileBody;



/**
 *
 * @author carlo
 */
public class NuevoP extends javax.swing.JFrame {
    
    private int x;
    private int y;
    //String imagen="";
    FileBody image = null;
    List<Integer> idCategoria = new ArrayList();
    
    private CrearProducto request = new CrearProducto();
    private ConsultarCategorias reqCategoria = new ConsultarCategorias();

    /**
     * Creates new form NuevoP
     */
    public NuevoP() {
        cargarComboBox();
        jComboBox1.addItem("Prueba");
        
        initComponents();
        setLocationRelativeTo(null);
        placeHolders();
    }
    public void cargarComboBox(){
        DefaultComboBoxModel categoria = new DefaultComboBoxModel();
        /*categoria.addElement("Holi");
        categoria.addElement("Holi");
        categoria.addElement("Holi");
        categoria.addElement("Holi");
        categoria = (DefaultComboBoxModel)this.jComboBox1.getModel();*/
        //categoria.removeAllElements();
        
        //reqCategoria.get(categoria, idCategoria);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtModelo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtTipo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtExistencia = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        cmbColor = new javax.swing.JComboBox<>();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 159, 128)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Color");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCodigo.setBorder(null);
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(54, 159, 128));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 180, 10));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNombre.setBorder(null);
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 30));

        jSeparator2.setBackground(new java.awt.Color(54, 159, 128));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, 20));

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtModelo.setBorder(null);
        jPanel2.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 30));

        jSeparator3.setBackground(new java.awt.Color(54, 159, 128));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 180, 20));

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTipo.setBorder(null);
        jPanel2.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 180, 30));

        jSeparator6.setBackground(new java.awt.Color(54, 159, 128));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 180, 20));

        txtExistencia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtExistencia.setBorder(null);
        jPanel2.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 180, 30));

        jSeparator7.setBackground(new java.awt.Color(54, 159, 128));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 180, 20));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPrecio.setBorder(null);
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 180, 30));

        jSeparator9.setBackground(new java.awt.Color(54, 159, 128));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 180, 20));

        cmbColor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(cmbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, -1));

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDescripcion.setBorder(null);
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 180, 30));

        jSeparator10.setBackground(new java.awt.Color(54, 159, 128));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 180, 20));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 310, 180));

        jButton2.setBackground(new java.awt.Color(26, 46, 70));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar Producto");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 320, 50));

        jButton3.setBackground(new java.awt.Color(54, 159, 128));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Seleccionar Imagen");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 310, 50));

        cmbCategoria.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", " " }));
        jPanel2.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Categoria");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Marca");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        cmbMarca.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 180, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 670, 720));

        jPanel1.setBackground(new java.awt.Color(26, 46, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 270, -1));

        jButton1.setBackground(new java.awt.Color(26, 46, 70));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        List<String> parametros = new ArrayList<String>();
        asignarParametros(parametros);
        request.post(parametros, image);
        JOptionPane.showMessageDialog(null, "El nuevo registro ha sido ingresado con éxito.");
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        FileFilter imaFileFilter = new FileNameExtensionFilter("png","jpg");
        jFileChooser.addChoosableFileFilter(imaFileFilter);
        int condicionAprobado = jFileChooser.showOpenDialog(this);
        if(condicionAprobado==JFileChooser.APPROVE_OPTION){
            File file = jFileChooser.getSelectedFile();
            ImageIcon fot = new ImageIcon(file.getPath());
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
            jLabel3.setIcon(icono);

            System.out.println(file);
            FileBody data = new FileBody(file);
            image=data;
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void asignarParametros(List<String> lista)
    {
        lista.add(txtCodigo.getText());
        lista.add(txtNombre.getText());
        lista.add(txtModelo.getText());
        lista.add(txtTipo.getText());
        lista.add(txtDescripcion.getText());
        lista.add(txtExistencia.getText());
        lista.add(txtPrecio.getText());
        lista.add("0"); //Precio mayorista
        lista.add("0"); //Precio cliente
        lista.add("1"); //colorId
        lista.add("1"); //marcaId
        lista.add("1"); //categoriaId
    }
    
    private void placeHolders(){
       TextPrompt codigo = new TextPrompt("Codigo", txtCodigo);
       TextPrompt nombre = new TextPrompt("Nombre", txtNombre);
       TextPrompt modelo = new TextPrompt("Modelo", txtModelo);
       //TextPrompt color = new TextPrompt("Color", txtColor);
       //TextPrompt marca = new TextPrompt("Marca", txtMarca);
       TextPrompt tipo = new TextPrompt("Tipo", txtTipo);
       TextPrompt existencia = new TextPrompt("Existencia", txtExistencia);
       TextPrompt precio = new TextPrompt("Precio", txtPrecio);
       TextPrompt descripcion = new TextPrompt("Descripcion", txtDescripcion);
       
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
            java.util.logging.Logger.getLogger(NuevoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new NuevoP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
