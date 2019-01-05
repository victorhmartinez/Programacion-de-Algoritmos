package proyectoprogramaciondealgoritmo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    Operaciones op = new Operaciones();
    public static ArrayList<Personal> PersonalEmp = new ArrayList<Personal>();
    public static ArrayList<Producto> catalogo = new ArrayList<Producto>();

    public void crearRegistros() {
        Formatter archivoPers, archivoClientes;
        try {
            archivoPers = new Formatter("Registro_Empleados.csv");
            archivoClientes = new Formatter("Registro_Cliente.csv");
            for (int i = 0; i < PersonalEmp.size(); i++) {
                Personal pers = PersonalEmp.get(i);
                if (pers instanceof Empleado) {
                    archivoPers.format("%s,%s,%s,%s,%s,%s,%s,%f\r\n", PersonalEmp.get(i).getNombre(), PersonalEmp.get(i).getApellido(),
                            PersonalEmp.get(i).getCedula(), PersonalEmp.get(i).getCorreo(), PersonalEmp.get(i).getTelefono(),
                            PersonalEmp.get(i).getNumCelular(), ((Empleado) pers).getCargo(), ((Empleado) pers).getSalario());
                } else if (pers instanceof Cliente) {
                    archivoClientes.format("%s,%s,%s,%s,%s,%s,%s\r\n", PersonalEmp.get(i).getNombre(), PersonalEmp.get(i).getApellido(),
                            PersonalEmp.get(i).getCedula(), PersonalEmp.get(i).getCorreo(), PersonalEmp.get(i).getTelefono(),
                            PersonalEmp.get(i).getNumCelular(), ((Cliente) pers).getTipo());
                }
            }
            JOptionPane.showMessageDialog(null, " Registrado Correctamente");
            archivoClientes.close();
            archivoPers.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se Encontror el registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarRegistros() {

        Scanner cargaArchivo;
        String linea, nombre, apellido, cedula, telefono, correo, cargo, tipo,celular;
        double sueldo;
        int cant = 0;
        try {

            cargaArchivo = new Scanner(new File("Registro_Empleados.csv"));

            while (cargaArchivo.hasNext()) {
                linea = cargaArchivo.nextLine();
                String[] tokens = linea.split(",");
                nombre = tokens[0];
                apellido = tokens[1];
                cedula = tokens[2];
                correo = tokens[3];
                telefono = tokens[4];
                celular = tokens[5];
                cargo = tokens[6];
                sueldo = Double.parseDouble(tokens[7]);

                PersonalEmp.add(new Empleado(sueldo, cargo, cedula, nombre, apellido, telefono, correo, celular));
            }
            cargaArchivo = new Scanner(new File("Registro_Cliente.csv"));
            
            while (cargaArchivo.hasNext()) {
                linea = cargaArchivo.nextLine();
                String[] tokens = linea.split(",");
                nombre = tokens[0];
                apellido = tokens[1];
                cedula = tokens[2];
                correo = tokens[3];
                telefono = tokens[4];
                celular = tokens[5];
                tipo= tokens[6];
                PersonalEmp.add(new Cliente(tipo, cedula, nombre, apellido, telefono, correo, celular));
            }
            cargaArchivo.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error archivo no encontrado", "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }

 
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarRegistros();
       
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        btnIngresarEmpleado = new javax.swing.JButton();
        btnInNuevoCiente = new javax.swing.JButton();
        btnRegisProducto = new javax.swing.JButton();
        btnMosProducto = new javax.swing.JButton();
        btnMosEmpleados = new javax.swing.JButton();
        btnMosClientes = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        btnValorCaja = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("---- SISTEMA DE VENTAS -----");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setOpaque(false);

        btnIngresarEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnIngresarEmpleado.setText("INGRESAR NUEVO EMPLEADO");
        btnIngresarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEmpleadoActionPerformed(evt);
            }
        });

        btnInNuevoCiente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInNuevoCiente.setText("INGRESAR NUEVO CLIENTE");
        btnInNuevoCiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInNuevoCienteActionPerformed(evt);
            }
        });

        btnRegisProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegisProducto.setText("REGISTRAR PRODUCTOS");

        btnMosProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMosProducto.setText("MOSTRAR PRODUCTOS");

        btnMosEmpleados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMosEmpleados.setText("MOSTRAR EMPLEADOS");
        btnMosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosEmpleadosActionPerformed(evt);
            }
        });

        btnMosClientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMosClientes.setText("MOSTRAR CLIENTES");

        btnVender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVender.setText("REALIZAR UNA VENTA");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnValorCaja.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnValorCaja.setText("MOSTRAR VALOR EN CAJA");

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("   BIENVENIDO AL SISTEMA DE VENTAS ");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInNuevoCiente, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegisProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnValorCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(btnMosEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(57, 57, 57))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnMosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnInNuevoCiente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValorCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoprogramaciondealgoritmo/Imagenes/lineas,-fondo-negro-186039.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEmpleadoActionPerformed
        op.registarNuevoTrabajador(PersonalEmp);
        crearRegistros();
    }//GEN-LAST:event_btnIngresarEmpleadoActionPerformed

    private void btnInNuevoCienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInNuevoCienteActionPerformed
        op.registrarCliente(PersonalEmp);
        crearRegistros();
    }//GEN-LAST:event_btnInNuevoCienteActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        int opcion = op.mostrarNombreProductos(catalogo);
        //Se pide al usuario que ingrese la cantidad  del producto que desee
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la  Cantidad que desea del Producto"));
        //Se llama al metodo venerProducto.
        op.venderProducto(catalogo, opcion, cantidad);
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnMosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosEmpleadosActionPerformed
       Mostrar_Personal mPersonal = new Mostrar_Personal();
       mPersonal.setVisible(true);
    }//GEN-LAST:event_btnMosEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInNuevoCiente;
    private javax.swing.JButton btnIngresarEmpleado;
    private javax.swing.JButton btnMosClientes;
    private javax.swing.JButton btnMosEmpleados;
    private javax.swing.JButton btnMosProducto;
    private javax.swing.JButton btnRegisProducto;
    private javax.swing.JButton btnValorCaja;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
