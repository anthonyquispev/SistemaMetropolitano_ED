package ventanasCliente;

import sistema.Sistema;
import javax.swing.table.DefaultTableModel;

public class pnlMensajesRecibidos extends javax.swing.JPanel {

    public pnlMensajesRecibidos() {
        initComponents();
        this.actualizarTabla();
    }

    private void actualizarTabla() {
        String[] titulos = {"Mensaje enviado", "Respuesta"};
        String[][] datos = Sistema.clienteActual.getMensajesRecibidos();
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblMensajes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMensajes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setMinimumSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMensajes.setBackground(new java.awt.Color(204, 255, 204));
        tblMensajes.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblMensajes.setForeground(new java.awt.Color(0, 0, 0));
        tblMensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MensajeEnviado", "Respuesta"
            }
        ));
        jScrollPane1.setViewportView(tblMensajes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 210));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove_16px.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 60, 30));

        btnActualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 120, 50));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MENSAJES RECIBIDOS");
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Desapila mensaje
        Sistema.clienteActual.desapilarMensajeRecibido();
        actualizarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMensajes;
    // End of variables declaration//GEN-END:variables
}
