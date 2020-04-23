/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vfix.inventario;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;


/**
 *
 * @author carlo
 */
public class Inventario extends javax.swing.JPanel {

    /**
     * Creates new form Inventario
     */
    private CrearProducto request = new CrearProducto();
    List<Integer> idProducto = new ArrayList();
    List<String> codigoProducto = new ArrayList();
    
    public Inventario() {
        initComponents();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Modelo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Existencia");
        modelo.addColumn("Precio");
        modelo.addColumn("Color");
        modelo.addColumn("Marca");
        modelo.addColumn("Categoria");
        jTable1.setModel(modelo);
        request.get(modelo, "", idProducto);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnPrueba = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(54, 159, 128));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 260, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InventarioVerde.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnNuevoProducto.setBackground(new java.awt.Color(26, 46, 70));
        btnNuevoProducto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setText("+ Nuevo Producto");
        btnNuevoProducto.setBorderPainted(false);
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 40, 240, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        txtFiltro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFiltro.setBorder(null);
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 260, 30));

        jSeparator2.setBackground(new java.awt.Color(54, 159, 128));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 790, 180));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 200, -1));

        btnModificar.setBackground(new java.awt.Color(26, 46, 70));
        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 110, 40));

        btnDesactivar.setBackground(new java.awt.Color(26, 46, 70));
        btnDesactivar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDesactivar.setForeground(new java.awt.Color(255, 255, 255));
        btnDesactivar.setText("Desactivar");
        btnDesactivar.setBorder(null);
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });
        add(btnDesactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 120, 40));

        btnPrueba.setText("Prueba");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });
        add(btnPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        // TODO add your handling code here:
        NuevoP producto = new NuevoP();
        producto.setVisible(true);
        
        
        request.get((DefaultTableModel)jTable1.getModel(), "", idProducto);
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
        // TODO add your handling code here:   
        try {
            //String url = "http://localhost:8000/api/colores/";
            HttpClient httpclient = HttpClients.createDefault();
            HttpPost request = new HttpPost("http://localhost:8000/api/colores/");
            
            List<NameValuePair> params = new ArrayList<NameValuePair>(2);
            params.add(new BasicNameValuePair("nombre","Blancardo"));
            request.setEntity(new UrlEncodedFormEntity(params, "UTF-8")); 
            
            HttpResponse response = httpclient.execute(request);
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPruebaActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        request.get(modelo, txtFiltro.getText(),idProducto);
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        String dato=String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0));
        ModificarP modificarproducto = new ModificarP(dato, obtenerProducto());
        modificarproducto.setVisible(true);
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        request.get(modelo, "", idProducto);
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    
    
    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar a este producto?") == JOptionPane.YES_OPTION)
        {
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
            String dato=String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),0));
           // int seleccionado = idProducto.get(jTable1.getSelectedRow());
            request.delete(dato);
            request.get(modelo, txtFiltro.getText(), idProducto);
            
            JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");
        }
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private Producto obtenerProducto()
    {
        Producto producto = new Producto();
        producto.setCodigo(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
        producto.setNombre(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
        producto.setModelo(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)));
        producto.setTipo(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)));
        producto.setDescripcion(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 4)));
        producto.setExistencia(Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 5))));
        producto.setPrecio(Float.parseFloat(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 6))));
        
        return producto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnPrueba;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
