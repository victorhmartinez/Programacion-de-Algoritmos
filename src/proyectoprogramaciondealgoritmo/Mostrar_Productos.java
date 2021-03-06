/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramaciondealgoritmo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Mostrar_Productos extends javax.swing.JFrame {

    public static ArrayList<Producto> catalogo = new ArrayList<Producto>();
     String Carpeta="C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Programacio_de_Algoritmos\\src\\proyectoprogramaciondealgoritmo\\";
    private void llenarTabla() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Nombre Producto");
        dtm.addColumn("Precio");
        dtm.addColumn("Cantidad");
     
        dtm.addColumn("Ram gb");
        dtm.addColumn("Sistema Operativo");
        dtm.addColumn("Disco gb");
        dtm.addColumn("Marca");
        dtm.addColumn("Procesador Core i");

        Object fila[] = new Object[dtm.getColumnCount()];
        Scanner cargaArchivo;
        String linea;
        try {
            cargaArchivo = new Scanner(new File(Carpeta+"Registro_Productos.csv"));
            while (cargaArchivo.hasNext()) {
                linea = cargaArchivo.nextLine();
                String[] tokens = linea.split(",");
                fila[0] = tokens[0];
                fila[1] = tokens[1];
                fila[2] = tokens[2];
                fila[3] = tokens[3];
                fila[4] = tokens[4];
                fila[5] = tokens[5];
                fila[6] = tokens[6];
                fila[7] = tokens[7];
                dtm.addRow(fila);
            }
            tablaProductos.setModel(dtm);
            cargaArchivo.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Mostrar_Productos() {
        initComponents();
        llenarTabla();
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
        tablaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 136, 970, 348));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" PRODUCTOS REGISTRADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 42, -1, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 540));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoprogramaciondealgoritmo/Imagenes/lineas,-fondo-negro-186039.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Mostrar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
