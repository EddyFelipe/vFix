/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Windows 8.1
 */
public class FModInventario extends javax.swing.JPanel {

    /**
     * Creates new form FModInventario
     */
    public FModInventario() {
        initComponents();
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
        lblCategoria = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblImagenesCont = new javax.swing.JLabel();
        sepColor = new javax.swing.JSeparator();
        tfNombre = new javax.swing.JTextField();
        sepNombre = new javax.swing.JSeparator();
        tfModelo = new javax.swing.JTextField();
        sepModelo = new javax.swing.JSeparator();
        tfColor = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        sepMarca = new javax.swing.JSeparator();
        lblTipo = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        sepTipo = new javax.swing.JSeparator();
        lblDescripcion = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        sepDescripcion = new javax.swing.JSeparator();
        lblExistencia = new javax.swing.JLabel();
        tfExistencia = new javax.swing.JTextField();
        sepExistencia = new javax.swing.JSeparator();
        lblPrecio = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        sepPrecio = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        btnElegirImg = new javax.swing.JButton();
        lblSelImg = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        btnAdelante = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnEliminarImagen = new javax.swing.JButton();
        lblColor1 = new javax.swing.JLabel();
        btnAgregarImagen1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        pnlGeneral.setBackground(new java.awt.Color(34, 51, 59));
        pnlGeneral.setMinimumSize(new java.awt.Dimension(1280, 680));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCategoria.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categoría *");
        pnlGeneral.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lblNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre *");
        pnlGeneral.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        lblModelo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Modelo *");
        pnlGeneral.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        lblImagenesCont.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblImagenesCont.setForeground(new java.awt.Color(255, 255, 255));
        lblImagenesCont.setText("Contador");
        pnlGeneral.add(lblImagenesCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 210, -1));
        pnlGeneral.add(sepColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 200, -1));

        tfNombre.setBackground(new java.awt.Color(34, 51, 59));
        tfNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.setBorder(null);
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });
        pnlGeneral.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 200, -1));
        pnlGeneral.add(sepNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, 10));

        tfModelo.setBackground(new java.awt.Color(34, 51, 59));
        tfModelo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfModelo.setForeground(new java.awt.Color(255, 255, 255));
        tfModelo.setBorder(null);
        tfModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfModeloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfModeloKeyTyped(evt);
            }
        });
        pnlGeneral.add(tfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 200, -1));
        pnlGeneral.add(sepModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 200, -1));

        tfColor.setBackground(new java.awt.Color(34, 51, 59));
        tfColor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfColor.setForeground(new java.awt.Color(255, 255, 255));
        tfColor.setBorder(null);
        tfColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfColorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfColorKeyTyped(evt);
            }
        });
        pnlGeneral.add(tfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 200, -1));

        lblImagen.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(255, 255, 255));
        lblImagen.setText("Imagen");
        pnlGeneral.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        tfMarca.setBackground(new java.awt.Color(34, 51, 59));
        tfMarca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfMarca.setForeground(new java.awt.Color(255, 255, 255));
        tfMarca.setBorder(null);
        tfMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMarcaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMarcaKeyTyped(evt);
            }
        });
        pnlGeneral.add(tfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 200, -1));
        pnlGeneral.add(sepMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, -1));

        lblTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo *");
        pnlGeneral.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, -1));

        tfTipo.setBackground(new java.awt.Color(34, 51, 59));
        tfTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfTipo.setForeground(new java.awt.Color(255, 255, 255));
        tfTipo.setBorder(null);
        tfTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTipoActionPerformed(evt);
            }
        });
        tfTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTipoKeyTyped(evt);
            }
        });
        pnlGeneral.add(tfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 200, -1));
        pnlGeneral.add(sepTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, 200, -1));

        lblDescripcion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción *");
        pnlGeneral.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, -1, -1));

        tfDescripcion.setBackground(new java.awt.Color(34, 51, 59));
        tfDescripcion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        tfDescripcion.setBorder(null);
        tfDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDescripcionKeyTyped(evt);
            }
        });
        pnlGeneral.add(tfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, 200, -1));
        pnlGeneral.add(sepDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, 200, -1));

        lblExistencia.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblExistencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia.setText("Existencia *");
        pnlGeneral.add(lblExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, -1));

        tfExistencia.setBackground(new java.awt.Color(34, 51, 59));
        tfExistencia.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfExistencia.setForeground(new java.awt.Color(255, 255, 255));
        tfExistencia.setBorder(null);
        tfExistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfExistenciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfExistenciaKeyTyped(evt);
            }
        });
        pnlGeneral.add(tfExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 200, -1));
        pnlGeneral.add(sepExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 200, -1));

        lblPrecio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio *");
        pnlGeneral.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, -1, -1));

        tfPrecio.setBackground(new java.awt.Color(34, 51, 59));
        tfPrecio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfPrecio.setForeground(new java.awt.Color(255, 255, 255));
        tfPrecio.setBorder(null);
        tfPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrecioKeyTyped(evt);
            }
        });
        pnlGeneral.add(tfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 200, -1));
        pnlGeneral.add(sepPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 200, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ingresar.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 310, 80));

        btnElegirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Elegir imagen.png"))); // NOI18N
        btnElegirImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirImgActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnElegirImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 140, 30));

        lblSelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo imagen.png"))); // NOI18N
        pnlGeneral.add(lblSelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 210, 160));

        lblMarca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca *");
        pnlGeneral.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        cbCategoria.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });
        cbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbCategoriaMouseReleased(evt);
            }
        });
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });
        cbCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbCategoriaKeyReleased(evt);
            }
        });
        pnlGeneral.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 200, 30));

        btnAdelante.setBackground(new java.awt.Color(226, 98, 75));
        btnAdelante.setForeground(new java.awt.Color(255, 255, 255));
        btnAdelante.setText(">");
        btnAdelante.setFocusPainted(false);
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        btnAtras.setBackground(new java.awt.Color(226, 98, 75));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("<");
        btnAtras.setBorderPainted(false);
        btnAtras.setFocusPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        btnEliminarImagen.setBackground(new java.awt.Color(226, 98, 75));
        btnEliminarImagen.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btnEliminarImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarImagen.setText("-");
        btnEliminarImagen.setFocusPainted(false);
        btnEliminarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarImagenActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnEliminarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 40, 30));

        lblColor1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblColor1.setForeground(new java.awt.Color(255, 255, 255));
        lblColor1.setText("Color *");
        pnlGeneral.add(lblColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 57, -1));

        btnAgregarImagen1.setBackground(new java.awt.Color(226, 98, 75));
        btnAgregarImagen1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        btnAgregarImagen1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarImagen1.setText("+");
        btnAgregarImagen1.setFocusPainted(false);
        btnAgregarImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagen1ActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnAgregarImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 40, 30));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlGeneral.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_ENTER))
        tfModelo.requestFocus();
        //else if (evt.getKeyCode() == KeyEvent.VK_UP)
        //tfCodigo.requestFocus();
    }//GEN-LAST:event_tfNombreKeyPressed

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A')|c > 'Z')
        {
            if ((c != ' ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú'))
            evt.consume();
        }

        if (tfNombre.getText().length()>55)
        evt.consume();
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfModeloKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_ENTER))
        tfColor.requestFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_UP)
        tfNombre.requestFocus();
    }//GEN-LAST:event_tfModeloKeyPressed

    private void tfModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfModeloKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A')|c > 'Z')
        {
            if ((c != ' ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú'))
            {
                if ((c < '0') || (c > '9'))
                evt.consume();
            }
        }

        if (tfModelo.getText().length()>45)
        evt.consume();
    }//GEN-LAST:event_tfModeloKeyTyped

    private void tfColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfColorKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_ENTER))
        tfMarca.requestFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_UP)
        tfModelo.requestFocus();
    }//GEN-LAST:event_tfColorKeyPressed

    private void tfColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfColorKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A')|c > 'Z')
        {
            if ((c != ' ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú'))
            evt.consume();
        }

        if (tfColor.getText().length()>35)
        evt.consume();
    }//GEN-LAST:event_tfColorKeyTyped

    private void tfMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMarcaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_ENTER))
        tfTipo.requestFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_UP)
        tfColor.requestFocus();
    }//GEN-LAST:event_tfMarcaKeyPressed

    private void tfMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMarcaKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A')|c > 'Z')
        {
            if ((c != ' ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú'))
            {
                if ((c < '0') || (c > '9'))
                evt.consume();
            }
        }

        if (tfMarca.getText().length()>45)
        evt.consume();
    }//GEN-LAST:event_tfMarcaKeyTyped

    private void tfTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTipoActionPerformed

    private void tfTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTipoKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_ENTER))
        tfDescripcion.requestFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_UP)
        tfMarca.requestFocus();
    }//GEN-LAST:event_tfTipoKeyPressed

    private void tfTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTipoKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A')|c > 'Z')
        {
            if ((c != ' ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú'))
            {
                if ((c < '0') || (c > '9'))
                evt.consume();
            }
        }

        if (tfTipo.getText().length()>45)
        evt.consume();
    }//GEN-LAST:event_tfTipoKeyTyped

    private void tfDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescripcionKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_ENTER))
        tfExistencia.requestFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_UP)
        tfTipo.requestFocus();
    }//GEN-LAST:event_tfDescripcionKeyPressed

    private void tfDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescripcionKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A')|c > 'Z')
        {
            if ((c != ' ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú'))
            {
                if ((c < '0') || (c > '9'))
                evt.consume();
            }
        }

        if (tfDescripcion.getText().length()>200)
        evt.consume();
    }//GEN-LAST:event_tfDescripcionKeyTyped

    private void tfExistenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfExistenciaKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_ENTER))
        tfPrecio.requestFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_UP)
        tfDescripcion.requestFocus();
    }//GEN-LAST:event_tfExistenciaKeyPressed

    private void tfExistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfExistenciaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
        evt.consume();

        if (tfExistencia.getText().length()>10)
        evt.consume();
    }//GEN-LAST:event_tfExistenciaKeyTyped

    private void tfPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecioKeyPressed
        //if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_ENTER))
        //tfCodigo.requestFocus();
        // else if (evt.getKeyCode() == KeyEvent.VK_UP)
        // tfExistencia.requestFocus();
    }//GEN-LAST:event_tfPrecioKeyPressed

    private void tfPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecioKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
        {
            if (c != '.')
            evt.consume();
        }

        if (tfPrecio.getText().length()>10)
        evt.consume();
    }//GEN-LAST:event_tfPrecioKeyTyped

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnElegirImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirImgActionPerformed

    }//GEN-LAST:event_btnElegirImgActionPerformed

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged

    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void cbCategoriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCategoriaMouseReleased

    }//GEN-LAST:event_cbCategoriaMouseReleased

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed

    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCategoriaKeyReleased

    }//GEN-LAST:event_cbCategoriaKeyReleased

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed

    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarImagenActionPerformed

    }//GEN-LAST:event_btnEliminarImagenActionPerformed

    private void btnAgregarImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagen1ActionPerformed

    }//GEN-LAST:event_btnAgregarImagen1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //URL myURL = new URL("http://localhost:8000/media/Blogger2.png");
            //Primera forma, sólo quería ver qué me retornaba, pero me tira un http notificándome que no encuentra el archivo
            /*HttpClient httpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet("localhost:8000/media/Blogger2.png");
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity resEntity = response.getEntity();
            System.out.println(EntityUtils.toString(resEntity));
            System.out.println(resEntity.toString());*/
            //Segunda forma, truena el programa, tira un error de FileNotFoundException
            URL myURL = new URL("localhost:8000/media/Blogger2.png");
            Image img = ImageIO.read(myURL.openStream());

            //Image img = new ImageIcon(myURL).getImage();
            ImageIcon img2 = new ImageIcon(img.getScaledInstance(lblSelImg.getWidth(), lblSelImg.getHeight(), Image.SCALE_SMOOTH));
            lblSelImg.setIcon(img2);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FModInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FModInventario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void voidPrueba(URL prueba)
    {
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAgregarImagen1;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnElegirImg;
    private javax.swing.JButton btnEliminarImagen;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblColor1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenesCont;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSelImg;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JSeparator sepColor;
    private javax.swing.JSeparator sepDescripcion;
    private javax.swing.JSeparator sepExistencia;
    private javax.swing.JSeparator sepMarca;
    private javax.swing.JSeparator sepModelo;
    private javax.swing.JSeparator sepNombre;
    private javax.swing.JSeparator sepPrecio;
    private javax.swing.JSeparator sepTipo;
    private javax.swing.JTextField tfColor;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfExistencia;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextField tfTipo;
    // End of variables declaration//GEN-END:variables
}
