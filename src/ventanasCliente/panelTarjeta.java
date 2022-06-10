package ventanasCliente;

import sistema.Sistema;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class panelTarjeta extends javax.swing.JPanel {

    private int estadoLed;

    public panelTarjeta() {
        initComponents();
        this.cargarDatos();
        this.cargarTarjetas();
        cargarImagenTarjeta();
        pasarTarjeta.setEnabled(false);
    }

    private void cargarTarjetas() {
        String[] tarjetas = Sistema.clienteActual.getTarjetas();
        for (String tarjeta : tarjetas) {
            this.cboTarjetas.addItem(tarjeta);
        }
    }

    private void cargarDatos() {
        String nombreCompleto;
        int idTarjeta = Sistema.tarjetaActual.getIdTarjeta();

        nombreCompleto = Sistema.clienteActual.getNombres();
        nombreCompleto += " ";
        nombreCompleto += Sistema.clienteActual.getApellidoPaterno();
        nombreCompleto += " ";
        nombreCompleto += Sistema.clienteActual.getApellidoMaterno();
        this.lblNombres.setText(nombreCompleto);
        this.lblNumTarjeta.setText(String.valueOf(idTarjeta));
        double saldo = Sistema.tarjetaActual.getSaldo();
        this.lblSaldo.setText(String.valueOf(saldo));
        String tipoTarjeta = Sistema.tarjetaActual.getTipo().getNombre();
        this.lblTipoTarjeta.setText(tipoTarjeta);

    }

    private void cargarImagenTarjeta() {
        Icon imagen;
        String tipoDeTarjeta = Sistema.tarjetaActual.getTipo().getNombre();
        switch (tipoDeTarjeta) {
            case "GENERAL":
                imagen = new ImageIcon(getClass().getResource("/imagenes/tarjetaTipoGeneral.jpg"));
                this.imagen.setIcon(imagen);
                break;
            case "ESCOLAR":
                imagen = new ImageIcon(getClass().getResource("/imagenes/tarjetaTipoEscolar.jpg"));
                this.imagen.setIcon(imagen);
                break;
            case "UNIVERSITARIO":
                imagen = new ImageIcon(getClass().getResource("/imagenes/tarjetaTipoUniversitario.jpg"));
                this.imagen.setIcon(imagen);
                break;
            default:
                break;
        }
    }

    private void cargarImagenLed() {
        Icon imagen;
        switch (estadoLed) {
            case 0:
                imagen = new ImageIcon(getClass().getResource("/imagenes/ledRojo.png"));
                this.imagenLed.setIcon(imagen);
                break;
            case 1:
                imagen = new ImageIcon(getClass().getResource("/imagenes/ledVerde.png"));
                this.imagenLed.setIcon(imagen);
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboTarjetas = new javax.swing.JComboBox<>();
        lblSaldo = new javax.swing.JLabel();
        lblNumTarjeta = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        etiquetaSaldoGastado = new javax.swing.JLabel();
        etiquetaSaldoActual = new javax.swing.JLabel();
        gasto = new javax.swing.JLabel();
        pasarTarjeta = new javax.swing.JButton();
        imagenLed = new javax.swing.JLabel();
        lblTipoTarjeta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setForeground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboTarjetas.setBackground(new java.awt.Color(204, 255, 204));
        cboTarjetas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboTarjetas.setForeground(new java.awt.Color(0, 0, 0));
        cboTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTarjetasActionPerformed(evt);
            }
        });
        add(cboTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 40));

        lblSaldo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("Saldo");
        add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 60, 30));

        lblNumTarjeta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNumTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        lblNumTarjeta.setText("Numero Tarjeta");
        add(lblNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 100, 30));

        lblNombres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setText("Nombres");
        add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 200, 20));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tarjetaTipoGeneral.jpg"))); // NOI18N
        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 360, 230));

        etiquetaSaldoGastado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaSaldoGastado.setForeground(new java.awt.Color(255, 102, 0));
        etiquetaSaldoGastado.setText("Saldo Gastado :");
        add(etiquetaSaldoGastado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        etiquetaSaldoActual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaSaldoActual.setForeground(new java.awt.Color(255, 102, 0));
        etiquetaSaldoActual.setText("Saldo Actual :");
        add(etiquetaSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        gasto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        add(gasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 70, 30));

        pasarTarjeta.setBackground(new java.awt.Color(51, 51, 0));
        pasarTarjeta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pasarTarjeta.setForeground(new java.awt.Color(0, 153, 153));
        pasarTarjeta.setText("Pasar Tarjeta");
        pasarTarjeta.setBorder(null);
        pasarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarTarjetaActionPerformed(evt);
            }
        });
        add(pasarTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 130, 50));

        imagenLed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ledApagado.png"))); // NOI18N
        add(imagenLed, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 170, 20));

        lblTipoTarjeta.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblTipoTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoTarjeta.setText("TIPO TARJETA");
        add(lblTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void cboTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTarjetasActionPerformed
        String codigo = this.cboTarjetas.getSelectedItem().toString();
        Sistema.tarjetaActual = Sistema.clienteActual.getTarjeta(Integer.parseInt(codigo));
        cargarImagenTarjeta();
        cargarDatos();
    }//GEN-LAST:event_cboTarjetasActionPerformed

    private void pasarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarTarjetaActionPerformed
        double gasto = Sistema.tarjetaActual.getTipo().getPorcentaje();
        double saldo = Sistema.tarjetaActual.getSaldo();
        if (Sistema.tarjetaActual.getSaldo() >= gasto) {
            estadoLed = 1;
            saldo = saldo - gasto;
            this.gasto.setText(String.format("%.2f", gasto));
        } else {
            estadoLed = 0;
            JOptionPane.showMessageDialog(null, "No tiene saldo suficiente, por favor, recargue");
        }
        cargarImagenLed();
    }//GEN-LAST:event_pasarTarjetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboTarjetas;
    private javax.swing.JLabel etiquetaSaldoActual;
    private javax.swing.JLabel etiquetaSaldoGastado;
    private javax.swing.JLabel gasto;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel imagenLed;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNumTarjeta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTipoTarjeta;
    private javax.swing.JButton pasarTarjeta;
    // End of variables declaration//GEN-END:variables
}
