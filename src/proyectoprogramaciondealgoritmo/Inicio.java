package proyectoprogramaciondealgoritmo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    String Carpeta = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Programacio_de_Algoritmos\\src\\proyectoprogramaciondealgoritmo\\";
    File crear_Carpeta = new File(Carpeta);
    //iNSTANCIAMOS NUESTRA CLASE OPERACIONES DONDE TENEMOSNUESTROS METODOS
    Operaciones op = new Operaciones();
    //CREAMOS DOS ARRAYLIST PARA GUARDA NUESTROS PRODUECTOS Y PERSONAL
    public static ArrayList<Personal> PersonalEmp = new ArrayList<Personal>();
    public static ArrayList<Producto> catalogo = new ArrayList<Producto>();

    //METODO CARGAvENTA PARA MOSTAR EL VALOR DE LAS VENTAS QUE HEMOS TENIDO
    public void cargarVentas() {
        //CREAMOS UNA VARIABLE DE TIPO SCANNER
        Scanner leerArchivo;
        //ENCERRAMOS EN UN TRY-CATCH PARA CAPTURAR CUALQUIER POSIBLE ERROR
        try {
            //CON LA AYUDA DE NUESZRA VARIABLDE TIPO SCANNER LEEMOS EL ARCHIVO
            leerArchivo = new Scanner(new File(Carpeta + "Valor_Caja.csv"));
            String linea;
            double caja = 0;
            //USAMOS UN SPLIT PARA IGNORAR LA COMA Y SOLO COGER LOS VALORES Q NOS INTERESAN
            linea = leerArchivo.nextLine();
            String[] tokens = linea.split(",");
            caja = Double.parseDouble(tokens[0]);

            JOptionPane.showMessageDialog(null, "El valor de la caja es de :" + caja, "Valor Caja", JOptionPane.OK_OPTION);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se puedo leer las ventas");
        }
    }

    public void crearRegistros() {
        //CREAMOS TRES VARIABLES DE TIPO FORMAT PARA CREAR NUESTROS ARCHVOS
        Formatter archivoPers, archivoClientes, archivoProductos;
        //ENCERRAMOS UN TRY-CATH PARA CAPTURA CUALQUIER EERO QUE SE PUEDA PRODUCIR
        try {
            //CON LA AYUDA DE NUESTRA VARIABLE FORMAT CREAMOS LOS ARCHVISO
            archivoPers = new Formatter(Carpeta + "Registro_Empleados.csv");
            archivoClientes = new Formatter(Carpeta + "Registro_Cliente.csv");
            //MEDIANTE UN FOR RECORREMOS NUESTROS ARRAYLIST 
            for (int i = 0; i < PersonalEmp.size(); i++) {
                Personal pers = PersonalEmp.get(i);
                //ESCRIBIMOS EN NUESTRO ARCHIVO CON LOS PARAMETROS QUE TIENE NUESTRO ARRAYLIST
                if (pers instanceof Empleado) {
                    archivoPers.format("%s,%s,%s,%s,%s,%s,%s,%f\r\n", PersonalEmp.get(i).getNombre(), PersonalEmp.get(i).getApellido(),
                            PersonalEmp.get(i).getCedula(), PersonalEmp.get(i).getCorreo(), PersonalEmp.get(i).getTelefono(),
                            PersonalEmp.get(i).getNumCelular(), ((Empleado) pers).getCargo(), ((Empleado) pers).getSalario());
                } else if (pers instanceof Cliente) {
                    archivoClientes.format("%s,%s,%s,%s,%s,%s\r\n", PersonalEmp.get(i).getNombre(), PersonalEmp.get(i).getApellido(),
                            PersonalEmp.get(i).getCedula(), PersonalEmp.get(i).getCorreo(), PersonalEmp.get(i).getTelefono(),
                            PersonalEmp.get(i).getNumCelular());
                }
            }
            JOptionPane.showMessageDialog(null, " Registrado Correctamente");
            //CERRAMOS NUESTRO ARCHIVOS PARA QUE PUEDAN GUARDA LOS DATOS INGRESADOS
            archivoClientes.close();
            archivoPers.close();
            //CON LA AYUDA DE NUESTRA VARIABLE FORMAT CREAMOS LOS ARCHVISO
            archivoProductos = new Formatter(Carpeta + "Registro_Productos.csv");
            //MEDIANTE UN FOR RECORREMOS NUESTROS ARRAYLIST 
            for (int i = 0; i < catalogo.size(); i++) {
                Producto prod = catalogo.get(i);
                //ESCRIBIMOS EN NUESTRO ARCHIVO CON LOS PARAMETROS QUE TIENE NUESTRO ARRAYLIST
                if (prod instanceof Computadoras) {
                    archivoProductos.format("%s,%f,%d,%d,%s,%d,%s,%d\r\n", catalogo.get(i).getNombre(), catalogo.get(i).getPrecioUnit(), catalogo.get(i).getCantStock(),
                            ((Computadoras) prod).getRam(), ((Computadoras) prod).getSistemaO(), ((Computadoras) prod).getDisco(), ((Computadoras) prod).getMarca(),
                            ((Computadoras) prod).getProcesador());
                }
            }
            //CERRAMOS NUESTRO ARCHIVOS PARA QUE PUEDAN GUARDA LOS DATOS INGRESADOS
            archivoProductos.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se Encontro el registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
//METODO CARGARREGISTROS PARA MOSTRAR EL PESRSONAL , CLIENTES Y PRODUCTOS  QUE HEMOS REGISTRADO

    public void cargarRegistros() {
        //USAMOS UNA VARIABLE TIPO SCANNER
        Scanner cargaArchivo;
        //CREAMOS VARIABLES PARA RECIBIR LOS VALORES
        String linea, nombre, apellido, cedula, telefono, correo, cargo, celular;
        double sueldo;
        //ENCERRAMOS EN UN TRY-CATCH PARA CAPTURA CUALQUIER POSIBLE ERROR
        try {
            //cON LA AYUDA DE NUESTRA VARIABLE DE TIPO SCANNER LEEMOS EL ARCHIVO
            cargaArchivo = new Scanner(new File(Carpeta + "Registro_Empleados.csv"));
            //USAMOS UN WHULE PARA RECORRER Y LERR TDO LO QUE ESTA ESCRTIO EN NUESTRO ARCHIVO
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
                // LE AÑADIMOS A NUESTRO ARRAYLYST NUESTRO NUEVO EMPLEADO 
                PersonalEmp.add(new Empleado(sueldo, cargo, cedula, nombre, apellido, telefono, correo, celular));

            }
            //cON LA AYUDA DE NUESTRA VARIABLE DE TIPO SCANNER LEEMOS EL ARCHIVO
            cargaArchivo = new Scanner(new File(Carpeta + "Registro_Cliente.csv"));
            //USAMOS UN WHULE PARA RECORRER Y LERR TDO LO QUE ESTA ESCRTIO EN NUESTRO ARCHIVO
            while (cargaArchivo.hasNext()) {
                linea = cargaArchivo.nextLine();
                String[] tokens = linea.split(",");
                nombre = tokens[0];
                apellido = tokens[1];
                cedula = tokens[2];
                correo = tokens[3];
                telefono = tokens[4];
                celular = tokens[5];
                // LE AÑADIMOS A NUESTRO ARRAYLYST NUESTRO NUEVO CLIENTE
                PersonalEmp.add(new Cliente(cedula, nombre, apellido, telefono, correo, celular));

            }
            int cantidad, ram, disco, procesador;
            double precioU;
            String sistemaO, marca;
            //cON LA AYUDA DE NUESTRA VARIABLE DE TIPO SCANNER LEEMOS EL ARCHIVO
            cargaArchivo = new Scanner(new File(Carpeta + "Registro_Productos.csv"));
            //USAMOS UN WHULE PARA RECORRER Y LERR TDO LO QUE ESTA ESCRTIO EN NUESTRO ARCHIVO
            while (cargaArchivo.hasNext()) {
                linea = cargaArchivo.nextLine();
                String[] tokens = linea.split(",");
                nombre = tokens[0];
                precioU = Double.parseDouble(tokens[1]);
                cantidad = Integer.parseInt(tokens[2]);
                ram = Integer.parseInt(tokens[3]);
                sistemaO = tokens[4];
                disco = Integer.parseInt(tokens[5]);
                marca = tokens[6];
                procesador = Integer.parseInt(tokens[7]);
                 // LE AÑADIMOS A NUESTRO ARRAYLYST NUESTRO NUEVO CLIENTE
                catalogo.add(new Computadoras(ram, sistemaO, disco, marca, procesador, nombre, precioU, cantidad));

            }
            cargaArchivo.close();
            //CERRAMOS NUESTRO ARCHIVO
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
        btnRegisProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisProductoActionPerformed(evt);
            }
        });

        btnMosProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMosProducto.setText("MOSTRAR PRODUCTOS");
        btnMosProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosProductoActionPerformed(evt);
            }
        });

        btnMosEmpleados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMosEmpleados.setText("MOSTRAR EMPLEADOS");
        btnMosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosEmpleadosActionPerformed(evt);
            }
        });

        btnMosClientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMosClientes.setText("MOSTRAR CLIENTES");
        btnMosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosClientesActionPerformed(evt);
            }
        });

        btnVender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVender.setText("REALIZAR UNA VENTA");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnValorCaja.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnValorCaja.setText("MOSTRAR VALOR EN CAJA");
        btnValorCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorCajaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("   BIENVENIDO AL SISTEMA DE VENTAS ");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnIngresarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441)
                .addComponent(btnMosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnInNuevoCiente, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441)
                .addComponent(btnMosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnRegisProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnMosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441)
                .addComponent(btnValorCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMosEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInNuevoCiente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegisProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValorCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 690));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoprogramaciondealgoritmo/Imagenes/lineas,-fondo-negro-186039.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1270, 690));

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

        //Se llama a  la ventana Factura.
        Facturar f = new Facturar();
        f.setVisible(true);

    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnMosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosEmpleadosActionPerformed
       //Se llama a la ventana mostrarPersonal
        Mostrar_Personal mPersonal = new Mostrar_Personal();
        mPersonal.setVisible(true);

    }//GEN-LAST:event_btnMosEmpleadosActionPerformed

    private void btnMosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosClientesActionPerformed
        //Se llama a la venta mostrar cleinetes
        Mostrar_Cliente mc = new Mostrar_Cliente();
        mc.setVisible(true);


    }//GEN-LAST:event_btnMosClientesActionPerformed

    private void btnMosProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosProductoActionPerformed
       //Se llama a la venta mostrar Productos
        Mostrar_Productos mp = new Mostrar_Productos();
        mp.setVisible(true);


    }//GEN-LAST:event_btnMosProductoActionPerformed

    private void btnRegisProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisProductoActionPerformed
      //Llamamos al metodo registar productos
        op.registrarProductos(catalogo);
        crearRegistros();
    }//GEN-LAST:event_btnRegisProductoActionPerformed

    private void btnValorCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorCajaActionPerformed
        cargarVentas();
    }//GEN-LAST:event_btnValorCajaActionPerformed

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
