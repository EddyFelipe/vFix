/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author User
 */
public class FInventario extends javax.swing.JPanel {

    /**
     * Creates new form FInventario
     */
    public FInventario() {
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
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        sepColor = new javax.swing.JSeparator();
        tfCodigo = new javax.swing.JTextField();
        sepCodigo = new javax.swing.JSeparator();
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

        pnlGeneral.setBackground(new java.awt.Color(34, 51, 59));
        pnlGeneral.setMinimumSize(new java.awt.Dimension(1280, 680));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCategoria.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categoría");
        pnlGeneral.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código");
        pnlGeneral.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        lblNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        pnlGeneral.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        lblModelo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Modelo");
        pnlGeneral.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        lblColor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Color");
        pnlGeneral.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 57, -1));
        pnlGeneral.add(sepColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 200, -1));

        tfCodigo.setBackground(new java.awt.Color(34, 51, 59));
        tfCodigo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfCodigo.setForeground(new java.awt.Color(255, 255, 255));
        tfCodigo.setBorder(null);
        pnlGeneral.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 200, -1));
        pnlGeneral.add(sepCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 200, -1));

        tfNombre.setBackground(new java.awt.Color(34, 51, 59));
        tfNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.setBorder(null);
        pnlGeneral.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 200, -1));
        pnlGeneral.add(sepNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 200, 10));

        tfModelo.setBackground(new java.awt.Color(34, 51, 59));
        tfModelo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfModelo.setForeground(new java.awt.Color(255, 255, 255));
        tfModelo.setBorder(null);
        pnlGeneral.add(tfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 200, -1));
        pnlGeneral.add(sepModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 200, -1));

        tfColor.setBackground(new java.awt.Color(34, 51, 59));
        tfColor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfColor.setForeground(new java.awt.Color(255, 255, 255));
        tfColor.setBorder(null);
        pnlGeneral.add(tfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 200, -1));

        lblImagen.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(255, 255, 255));
        lblImagen.setText("Imagen");
        pnlGeneral.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        tfMarca.setBackground(new java.awt.Color(34, 51, 59));
        tfMarca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfMarca.setForeground(new java.awt.Color(255, 255, 255));
        tfMarca.setBorder(null);
        pnlGeneral.add(tfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 200, -1));
        pnlGeneral.add(sepMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, 200, -1));

        lblTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");
        pnlGeneral.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

        tfTipo.setBackground(new java.awt.Color(34, 51, 59));
        tfTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfTipo.setForeground(new java.awt.Color(255, 255, 255));
        tfTipo.setBorder(null);
        pnlGeneral.add(tfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 200, -1));
        pnlGeneral.add(sepTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 200, -1));

        lblDescripcion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción");
        pnlGeneral.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, -1, -1));

        tfDescripcion.setBackground(new java.awt.Color(34, 51, 59));
        tfDescripcion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        tfDescripcion.setBorder(null);
        pnlGeneral.add(tfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 200, -1));
        pnlGeneral.add(sepDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 200, -1));

        lblExistencia.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblExistencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia.setText("Existencia");
        pnlGeneral.add(lblExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, -1));

        tfExistencia.setBackground(new java.awt.Color(34, 51, 59));
        tfExistencia.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfExistencia.setForeground(new java.awt.Color(255, 255, 255));
        tfExistencia.setBorder(null);
        pnlGeneral.add(tfExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 200, -1));
        pnlGeneral.add(sepExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 200, -1));

        lblPrecio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio");
        pnlGeneral.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, -1));

        tfPrecio.setBackground(new java.awt.Color(34, 51, 59));
        tfPrecio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tfPrecio.setForeground(new java.awt.Color(255, 255, 255));
        tfPrecio.setBorder(null);
        pnlGeneral.add(tfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, 200, -1));
        pnlGeneral.add(sepPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 200, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ingresar.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlGeneral.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 310, 80));

        btnElegirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Elegir imagen.png"))); // NOI18N
        pnlGeneral.add(btnElegirImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 140, 30));

        lblSelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo imagen.png"))); // NOI18N
        pnlGeneral.add(lblSelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 210, 160));

        lblMarca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca");
        pnlGeneral.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, -1));

        cbCategoria.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlGeneral.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 200, 30));

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

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElegirImg;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSelImg;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JSeparator sepCodigo;
    private javax.swing.JSeparator sepColor;
    private javax.swing.JSeparator sepDescripcion;
    private javax.swing.JSeparator sepExistencia;
    private javax.swing.JSeparator sepMarca;
    private javax.swing.JSeparator sepModelo;
    private javax.swing.JSeparator sepNombre;
    private javax.swing.JSeparator sepPrecio;
    private javax.swing.JSeparator sepTipo;
    private javax.swing.JTextField tfCodigo;
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
