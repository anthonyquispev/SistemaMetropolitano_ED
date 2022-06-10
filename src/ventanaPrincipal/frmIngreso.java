package ventanaPrincipal;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import ventanasEmpleados.frmPrincipalTrabajador;
import javax.swing.JOptionPane;
import librerias.SerializadoraGen;
import sistema.Sistema;
import ventanasCliente.frmPrincipalCliente;

public class frmIngreso extends javax.swing.JFrame {

    public frmIngreso() {
        initComponents();
        limpiarCajas();
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoMetropolitano.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 39, 56));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 40));

        txtUsuario.setBackground(new java.awt.Color(36, 47, 65));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUsuario.setName("Al"); // NOI18N
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 270, 39));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 270, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 120, 40));

        txtPassword.setBackground(new java.awt.Color(36, 47, 65));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtPassword.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 270, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 270, 10));

        btnSalir.setBackground(new java.awt.Color(105, 134, 146));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Exit");
        btnSalir.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 60, 20));

        jLabel4.setForeground(new java.awt.Color(60, 63, 65));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foto-perfil-2.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 240, 190));

        btnIngresar.setBackground(new java.awt.Color(105, 134, 146));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("LOGIN");
        btnIngresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 160, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lock_24px.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 30, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/driver_30px.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 40, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("USER LOGIN");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, 40));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 80, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo06.jpg"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 570));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 430, 570));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subway_100px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 100, 140));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Metropolitano");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 90));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/municipalidadDeLima.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/driver_license_80px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 80, 70));

        jButton1.setBackground(new java.awt.Color(105, 134, 146));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CUENTAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 90, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo08.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String username = this.txtUsuario.getText();
        String password = this.txtPassword.getText();
        Sistema.usuarioActual = Sistema.usuarios.validar(username, password);
        if (Sistema.usuarioActual != null) {
            JOptionPane.showMessageDialog(this, "Bienvenido!!!");
            int tipoUsuario = Sistema.usuarioActual.getTipo();

            //Interfaz empleados
            if (tipoUsuario == 1) {
                frmPrincipalTrabajador frm = new frmPrincipalTrabajador();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
                this.dispose();
            } //Interfaz usuarios
            else if (tipoUsuario == 2) {
                Sistema.clienteActual = Sistema.clientes.obtenerClienteUsername(username);
                Sistema.estacionActual = Sistema.estaciones.getEstacion("Estación virtual");
                frmPrincipalCliente frm = new frmPrincipalCliente();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario incorrecto");
            this.limpiarCajas();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        //SERIALIZACIÓN
        SerializadoraGen.serializar(Sistema.FILE_ESTACIONES, Sistema.estaciones.getEstaciones());
        SerializadoraGen.serializar(Sistema.FILE_USUARIOS, Sistema.usuarios.getUsuarios());
        SerializadoraGen.serializarClientes(Sistema.FILE_CLIENTES, Sistema.clientes);
        SerializadoraGen.serializarEmpleados(Sistema.FILE_EMPLEADOS, Sistema.empleados);
        SerializadoraGen.serializar(Sistema.FILE_MOVIMIENTOSTARJETA, Sistema.movimientosTarjeta.getMovimientos());
        SerializadoraGen.serializar(Sistema.FILE_MOVIMIENTOSVIAJE, Sistema.movimientosViaje.getMovimientos());
        SerializadoraGen.serializarMensajesClientes(Sistema.FILE_COLAMENSAJES, Sistema.mensajesClientes);

        JOptionPane.showMessageDialog(this, "Gracias por utilizar este programa");
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        if (txtUsuario.getText().equals("Enter your username")) {
            this.txtUsuario.setText("");
        }
        if (txtPassword.getText().equals(""))
            txtPassword.setText("EnterYourPassword");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        if (txtPassword.getText().equals("EnterYourPassword")) {
            this.txtPassword.setText("");
        }
        if (txtUsuario.getText().equals(""))
            txtUsuario.setText("Enter your username");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.btnIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sistema.usuarios.mostrarUsuarios();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarCajas() {
        txtUsuario.setText("Enter your username");
        txtPassword.setText("EnterYourPassword");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
