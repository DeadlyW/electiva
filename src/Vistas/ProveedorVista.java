/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.ProveedoresControlador;
import Modelo.ProveedoresModelo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class ProveedorVista extends javax.swing.JFrame {

    /**
     * Creates new form ProveedorVista
     */
    public ProveedorVista() {
        initComponents();
        this.setTitle("Gestionar Proveedores");
        this.setLocationRelativeTo(null);
    }

    DefaultTableModel dtm3 = new DefaultTableModel();

    ProveedoresControlador mc = new ProveedoresControlador();
    ProveedoresModelo m = new ProveedoresModelo();

    public void llenado() {
        dtm3.setNumRows(0);

        for (int i = 0; i < mc.getProveedores().size(); i++) {
            ProveedoresModelo mt = mc.getProveedores().get(i);

            String[] fmj = {mt.getCodigo(), mt.getNombre(), mt.getFecha(), mt.getDireccion(), mt.getEvaluacionI() + "", mt.getReevaluacion() + "", mt.getTproveedor(), mt.getNit(), mt.getContacto(), mt.getCorreo(), mt.getTelefono() + "", mt.getEstado()};
            dtm3.addRow(fmj);
            System.out.println(fmj);

        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproveedores = new javax.swing.JTable();
        addproveedor = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        dtm3.addColumn("Código");
        dtm3.addColumn("Nombre");
        dtm3.addColumn("Fecha Ingreso");
        dtm3.addColumn("Dirección");
        dtm3.addColumn("Evaluación");
        dtm3.addColumn("Revaluación");
        dtm3.addColumn("Proveedor");
        dtm3.addColumn("Nit");
        dtm3.addColumn("Contacto");
        dtm3.addColumn("E-mail");
        dtm3.addColumn("Telefono");
        dtm3.addColumn("Estado");
        tablaproveedores.setModel(dtm3);
        jScrollPane1.setViewportView(tablaproveedores);

        addproveedor.setText("Agregar");
        addproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproveedorActionPerformed(evt);
            }
        });

        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Eliminar))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addproveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproveedorActionPerformed
        ProveedorRegistro pro = new ProveedorRegistro();
        this.dispose();
        pro.setVisible(true);
    }//GEN-LAST:event_addproveedorActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        
        llenado();
        
    }//GEN-LAST:event_listarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int x = tablaproveedores.getSelectedRow();
        dtm3 = (DefaultTableModel) tablaproveedores.getModel();
        //dtm3.removeRow(tablaproveedores.getSelectedRow());

        //for (int i = 0; i < dtm3.getRowCount(); i++) {
        //  if (dtm3.getValueAt(i, 0).toString().equals("")) {
        System.out.println("lol");
        //} else {
        m.setCodigo(dtm3.getValueAt(x, 0).toString());
        m.setNombre(dtm3.getValueAt(x, 1).toString());
        m.setFecha(dtm3.getValueAt(x, 2).toString());
        m.setDireccion(dtm3.getValueAt(x, 3).toString());
        m.setEvaluacionI(Integer.parseInt(dtm3.getValueAt(x, 4).toString()));
        m.setReevaluacion(Integer.parseInt(dtm3.getValueAt(x, 5).toString()));
        m.setTproveedor(dtm3.getValueAt(x, 6).toString());
        m.setNit(dtm3.getValueAt(x, 7).toString());
        m.setContacto(dtm3.getValueAt(x, 8).toString());
        m.setCorreo(dtm3.getValueAt(x, 9).toString());
        m.setTelefono(Integer.parseInt(dtm3.getValueAt(x, 10).toString()));
        m.setEstado(dtm3.getValueAt(x, 11).toString());
        mc.eliminar(m);
        dtm3.removeRow(tablaproveedores.getSelectedRow());
        //}
        //}

        


    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ProveedorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveedorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveedorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveedorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProveedorVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton addproveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listar;
    private javax.swing.JTable tablaproveedores;
    // End of variables declaration//GEN-END:variables
}
