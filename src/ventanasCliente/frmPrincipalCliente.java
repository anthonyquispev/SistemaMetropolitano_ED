package ventanasCliente;

import java.awt.Image;
import java.awt.Toolkit;
import ventanaPrincipal.frmIngreso;
import librerias.SerializadoraGen;
import sistema.Sistema;

public class frmPrincipalCliente extends javax.swing.JFrame {

    panelTablas pnl1 = new panelTablas();
    panelRecargaVirtual pnl2 = new panelRecargaVirtual();
    panelBuses pnlBuses = new panelBuses();
    panelEstaciones pnlBuscar = new panelEstaciones();
    panelInfo pnlInfo = new panelInfo();
    panelTarjeta pnlTarjeta = new panelTarjeta();
    pnlEnviarMensaje pnlEnviarMensaje = new pnlEnviarMensaje();
    pnlMensajesRecibidos pnlMensajesRecibidos = new pnlMensajesRecibidos();
    pnlMensajesEnviados pnlMensajesEnviados = new pnlMensajesEnviados();

    public frmPrincipalCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pnlContenedor.add(pnl1);
        pnl1.setVisible(true);
        pnl2.setVisible(false);
        this.deshabilitarBotones();
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoMetropolitano.png"));
        return retValue;
    }

    private void deshabilitarBotones() {
        if (pnl1.isVisible()) {
            btnInicio.setEnabled(false);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnEnviarMensaje.setEnabled(true);
            btnMensajesRecibidos.setEnabled(true);
            btnMensajesEnviados.setEnabled(true);
        } else if (pnl2.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(false);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnEnviarMensaje.setEnabled(true);
            btnMensajesRecibidos.setEnabled(true);
            btnMensajesEnviados.setEnabled(true);
        } else if (pnlBuses.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(false);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnEnviarMensaje.setEnabled(true);
            btnMensajesRecibidos.setEnabled(true);
            btnMensajesEnviados.setEnabled(true);
        } else if (pnlBuscar.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(false);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnEnviarMensaje.setEnabled(true);
            btnMensajesRecibidos.setEnabled(true);
            btnMensajesEnviados.setEnabled(true);
        } else if (pnlInfo.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(false);
            btnModoTarjeta.setEnabled(true);
            btnEnviarMensaje.setEnabled(true);
            btnMensajesRecibidos.setEnabled(true);
            btnMensajesEnviados.setEnabled(true);
        } else if (pnlTarjeta.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(false);
            btnEnviarMensaje.setEnabled(true);
            btnMensajesRecibidos.setEnabled(true);
            btnMensajesEnviados.setEnabled(true);
        } else if (pnlEnviarMensaje.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnEnviarMensaje.setEnabled(false);
            btnMensajesRecibidos.setEnabled(true);
            btnMensajesEnviados.setEnabled(true);
        } else if (pnlMensajesRecibidos.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnEnviarMensaje.setEnabled(true);
            btnMensajesRecibidos.setEnabled(false);
            btnMensajesEnviados.setEnabled(true);
        } else if (pnlMensajesEnviados.isVisible()) {
            btnInicio.setEnabled(true);
            btnRecarga.setEnabled(true);
            btnBuses.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnInfo.setEnabled(true);
            btnModoTarjeta.setEnabled(true);
            btnEnviarMensaje.setEnabled(true);
            btnMensajesRecibidos.setEnabled(true);
            btnMensajesEnviados.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlContenedor = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnRecarga = new javax.swing.JButton();
        btnBuses = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModoTarjeta = new javax.swing.JButton();
        btnEnviarMensaje = new javax.swing.JButton();
        btnMensajesRecibidos = new javax.swing.JButton();
        btnMensajesEnviados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlContenedor.setPreferredSize(new java.awt.Dimension(422, 440));
        pnlContenedor.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(pnlContenedor, new java.awt.GridBagConstraints());

        pnlBotones.setBackground(new java.awt.Color(102, 102, 102));
        pnlBotones.setPreferredSize(new java.awt.Dimension(420, 125));
        pnlBotones.setLayout(new java.awt.GridBagLayout());

        btnInicio.setBackground(new java.awt.Color(102, 51, 0));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_home_45px_1.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnInicio, gridBagConstraints);

        btnRecarga.setBackground(new java.awt.Color(102, 51, 0));
        btnRecarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_prepaid_recharge_45px.png"))); // NOI18N
        btnRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 99.0;
        gridBagConstraints.weighty = 99.9;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnRecarga, gridBagConstraints);

        btnBuses.setBackground(new java.awt.Color(102, 51, 0));
        btnBuses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_bus_38px.png"))); // NOI18N
        btnBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnBuses, gridBagConstraints);

        btnBuscar.setBackground(new java.awt.Color(102, 51, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_schedule_45px.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnBuscar, gridBagConstraints);

        btnInfo.setBackground(new java.awt.Color(102, 51, 0));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_information_45px.png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnInfo, gridBagConstraints);

        btnSalir.setBackground(new java.awt.Color(102, 51, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_exit_sign_45px.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnSalir, gridBagConstraints);

        btnModoTarjeta.setBackground(new java.awt.Color(102, 51, 0));
        btnModoTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_card_payment_45px.png"))); // NOI18N
        btnModoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoTarjetaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnModoTarjeta, gridBagConstraints);

        btnEnviarMensaje.setBackground(new java.awt.Color(102, 51, 0));
        btnEnviarMensaje.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnEnviarMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_sent_45px_2.png"))); // NOI18N
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnEnviarMensaje, gridBagConstraints);

        btnMensajesRecibidos.setBackground(new java.awt.Color(102, 51, 0));
        btnMensajesRecibidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_reply_45px.png"))); // NOI18N
        btnMensajesRecibidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajesRecibidosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnMensajesRecibidos, gridBagConstraints);

        btnMensajesEnviados.setBackground(new java.awt.Color(102, 51, 0));
        btnMensajesEnviados.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnMensajesEnviados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_send_45px.png"))); // NOI18N
        btnMensajesEnviados.setMinimumSize(new java.awt.Dimension(80, 66));
        btnMensajesEnviados.setPreferredSize(new java.awt.Dimension(80, 66));
        btnMensajesEnviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajesEnviadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBotones.add(btnMensajesEnviados, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(pnlBotones, gridBagConstraints);

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmIngreso frm = new frmIngreso();
        Sistema.usuarioActual.salir();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();

        //SERIALIZACIÓN
        SerializadoraGen.serializar(Sistema.FILE_ESTACIONES, Sistema.estaciones.getEstaciones());
        SerializadoraGen.serializar(Sistema.FILE_USUARIOS, Sistema.usuarios.getUsuarios());
        SerializadoraGen.serializarClientes(Sistema.FILE_CLIENTES, Sistema.clientes);
        SerializadoraGen.serializarEmpleados(Sistema.FILE_EMPLEADOS, Sistema.empleados);
        SerializadoraGen.serializar(Sistema.FILE_MOVIMIENTOSTARJETA, Sistema.movimientosTarjeta.getMovimientos());
        SerializadoraGen.serializar(Sistema.FILE_MOVIMIENTOSVIAJE, Sistema.movimientosViaje.getMovimientos());
        SerializadoraGen.serializarMensajesClientes(Sistema.FILE_COLAMENSAJES, Sistema.mensajesClientes);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        pnl1.setVisible(true);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlEnviarMensaje.setVisible(false);
        pnlMensajesRecibidos.setVisible(false);
        pnlMensajesEnviados.setVisible(false);
        this.pnlContenedor.add(pnl1);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargaActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(true);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlEnviarMensaje.setVisible(false);
        pnlMensajesRecibidos.setVisible(false);
        pnlMensajesEnviados.setVisible(false);
        this.pnlContenedor.add(pnl2);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnRecargaActionPerformed

    private void btnBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusesActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(true);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlEnviarMensaje.setVisible(false);
        pnlMensajesRecibidos.setVisible(false);
        pnlMensajesEnviados.setVisible(false);
        this.pnlContenedor.add(pnlBuses);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnBusesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(true);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlEnviarMensaje.setVisible(false);
        pnlMensajesRecibidos.setVisible(false);
        pnlMensajesEnviados.setVisible(false);
        this.pnlContenedor.add(pnlBuscar);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(true);
        pnlTarjeta.setVisible(false);
        pnlEnviarMensaje.setVisible(false);
        pnlMensajesRecibidos.setVisible(false);
        pnlMensajesEnviados.setVisible(false);
        this.pnlContenedor.add(pnlInfo);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnModoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoTarjetaActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(true);
        pnlEnviarMensaje.setVisible(false);
        pnlMensajesRecibidos.setVisible(false);
        pnlMensajesEnviados.setVisible(false);
        this.pnlContenedor.add(pnlTarjeta);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();

    }//GEN-LAST:event_btnModoTarjetaActionPerformed

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlEnviarMensaje.setVisible(true);
        pnlMensajesRecibidos.setVisible(false);
        pnlMensajesEnviados.setVisible(false);
        this.pnlContenedor.add(pnlEnviarMensaje);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void btnMensajesRecibidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajesRecibidosActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlEnviarMensaje.setVisible(false);
        pnlMensajesRecibidos.setVisible(true);
        pnlMensajesEnviados.setVisible(false);
        this.pnlContenedor.add(pnlMensajesRecibidos);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnMensajesRecibidosActionPerformed

    private void btnMensajesEnviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajesEnviadosActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnlBuses.setVisible(false);
        pnlBuscar.setVisible(false);
        pnlInfo.setVisible(false);
        pnlTarjeta.setVisible(false);
        pnlEnviarMensaje.setVisible(false);
        pnlMensajesRecibidos.setVisible(false);
        pnlMensajesEnviados.setVisible(true);
        this.pnlContenedor.add(pnlMensajesEnviados);
        this.pnlContenedor.validate();
        this.deshabilitarBotones();
    }//GEN-LAST:event_btnMensajesEnviadosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmPrincipalCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuses;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMensajesEnviados;
    private javax.swing.JButton btnMensajesRecibidos;
    private javax.swing.JButton btnModoTarjeta;
    private javax.swing.JButton btnRecarga;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables

}
