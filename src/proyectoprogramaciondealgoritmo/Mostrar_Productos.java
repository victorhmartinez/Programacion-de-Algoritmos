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
    public void cargarRegistros() {

        Scanner cargaArchivo;
        String linea, marca, apellido, cedula, telefono, correo, cargo, tipo, celular;
        double sueldo;

        try {
            cargaArchivo = new Scanner(new File("Registro_Cliente.csv"));

            while (cargaArchivo.hasNext()) {
                linea = cargaArchivo.nextLine();
                String[] tokens = linea.split(",");
                marca = tokens[0];
                
            }
            cargaArchivo.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error archivo no encontrado", "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }
public void llenarTabla(){
    DefaultTableModel  dtm = new DefaultTableModel();
    dtm.addColumn("Cantidad");
    dtm.addColumn("Nombre Producto");
    dtm.addColumn("Precio");
    dtm.addColumn("Disponibilidad");
    dtm.addColumn("Categoria");
    dtm.addColumn("Marca");
    dtm.addColumn("Ram");
    dtm.addColumn("Disco");
    dtm.addColumn("Procesador");
    dtm.addColumn("Sistema Operativo");
    Object fila[] = new Object[dtm.getColumnCount()];
    for (int i = 0; i < catalogo.size(); i++) {
          Producto produ = catalogo.get(i);
        fila[0]=catalogo.get(i).getCantStock();
        fila[1]=catalogo.get(i).getNombre();
        fila[2]=catalogo.get(i).getPrecioUnit();
        fila[3]=catalogo.get(i).isDisponible();
        if(produ instanceof Computadoras){
            fila[5]=((Computadoras) produ).getMarca();
            fila[6]= ((Computadoras) produ).getRam();
            fila[7]=((Computadoras) produ).getDisco();
            fila[8]=((Computadoras) produ).getProcesador();
            fila[9]=((Computadoras) produ).getSistemaO();
        }else if(produ instanceof VideoJuegos){
            fila[4]=((VideoJuegos) produ).getCategoria();
            
        }
         dtm.addRow(fila);
    }
     tablaProductos.setModel(dtm);
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
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
