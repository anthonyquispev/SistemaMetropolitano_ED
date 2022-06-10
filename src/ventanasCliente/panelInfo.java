
package ventanasCliente;

import sistema.Sistema;

public class panelInfo extends javax.swing.JPanel {

    public panelInfo() {
        initComponents();
        this.cargarDatos();
    }

    private void cargarDatos(){
        this.lblNombre.setText(Sistema.clienteActual.getNombres());
        this.lblApellidoPaterno.setText(Sistema.clienteActual.getApellidoPaterno());
        this.lblApellidoMaterno.setText(Sistema.clienteActual.getApellidoMaterno());
        this.lblEdad.setText(String.valueOf(Sistema.clienteActual.getEdad()));
        this.lblDni.setText(Sistema.clienteActual.getDni());
        this.lblNumeroDeTarjetas.setText(String.valueOf(Sistema.clienteActual.getNumeroTarjetas()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblNumeroDeTarjetas = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 153));
        lblNombre.setText("________");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 160, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombres:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 160, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Apellido Paterno:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 160, 30));

        lblApellidoPaterno.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblApellidoPaterno.setForeground(new java.awt.Color(0, 0, 153));
        lblApellidoPaterno.setText("________");
        add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 160, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Apellido Materno:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 30));

        lblApellidoMaterno.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblApellidoMaterno.setForeground(new java.awt.Color(0, 0, 153));
        lblApellidoMaterno.setText("________");
        add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 160, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Edad:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, 30));

        lblEdad.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 0, 153));
        lblEdad.setText("________");
        add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, 30));

        lblNumeroDeTarjetas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNumeroDeTarjetas.setForeground(new java.awt.Color(0, 0, 153));
        lblNumeroDeTarjetas.setText("________");
        add(lblNumeroDeTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 160, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Número de tarjetas:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("DNI:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 30));

        lblDni.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 0, 153));
        lblDni.setText("________");
        add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 160, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cv_80px.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 70, 80));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INFORMACIÓN DEL CLIENTE");
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroDeTarjetas;
    // End of variables declaration//GEN-END:variables
}
