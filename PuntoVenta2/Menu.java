package PuntoVenta2;

import java.util.ArrayList;
import java.util.List;

public class Menu extends javax.swing.JFrame {

    static List<Producto> productos = new ArrayList<Producto>();

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JLabel();
        Menuopcion = new javax.swing.JTabbedPane();
        Registrar = new javax.swing.JPanel();
        Unidades1 = new javax.swing.JLabel();
        Unidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Guardar1 = new javax.swing.JButton();
        Tipos1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        Tipo = new javax.swing.JComboBox<>();
        Nombres1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Cantidades1 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Vender = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        Iva = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        Nombre1 = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        Precio1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setBackground(new java.awt.Color(0, 0, 0));
        Menu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Menu.setForeground(new java.awt.Color(0, 0, 0));
        Menu.setText("PRODUCTOS");

        Menuopcion.setBackground(new java.awt.Color(153, 153, 153));
        Menuopcion.setForeground(new java.awt.Color(0, 0, 0));
        Menuopcion.setAutoscrolls(true);

        Registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Unidades1.setText("Unidad de medida");

        Unidad.setBackground(new java.awt.Color(255, 102, 102));
        Unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio");

        Precio.setBackground(new java.awt.Color(255, 102, 102));
        Precio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setText("REGISTRAR PRODUCTO");

        Guardar1.setText("GUARDAR");
        Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar1ActionPerformed(evt);
            }
        });

        Tipos1.setText("Tipo de producto");

        list.setToolTipText("");
        list.setAlignmentX(1.0F);
        list.setAlignmentY(0.51F);
        jScrollPane4.setViewportView(list);

        Tipo.setBackground(new java.awt.Color(255, 102, 102));
        Tipo.setForeground(new java.awt.Color(0, 0, 0));
        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestibles", "Utensilios", "Oficina", "Industriales" }));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        Nombres1.setText("Nombre");

        Nombre.setBackground(new java.awt.Color(255, 102, 102));
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Cantidades1.setText("Cantidad");

        Cantidad.setBackground(new java.awt.Color(255, 102, 102));
        Cantidad.setForeground(new java.awt.Color(0, 0, 0));
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        jLabel6.setText("Listado de Productos");

        javax.swing.GroupLayout RegistrarLayout = new javax.swing.GroupLayout(Registrar);
        Registrar.setLayout(RegistrarLayout);
        RegistrarLayout.setHorizontalGroup(
            RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar1)
                .addGap(265, 265, 265))
            .addGroup(RegistrarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nombres1)
                        .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Unidades1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Unidad)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Precio))
                        .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cantidades1))
                    .addGroup(RegistrarLayout.createSequentialGroup()
                        .addComponent(Tipos1)
                        .addGap(6, 6, 6))
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2))
                    .addGroup(RegistrarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegistrarLayout.setVerticalGroup(
            RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegistrarLayout.createSequentialGroup()
                        .addComponent(Tipos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombres1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cantidades1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Unidades1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar1)
                .addContainerGap())
        );

        Menuopcion.addTab("REGISTRAR PRODUCTO", Registrar);

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel8.setText("VENTA DE PRODUCTOS");

        jLabel9.setText("Ingrese el nombre del producto o parte de el:");

        Busqueda.setBackground(new java.awt.Color(255, 102, 102));
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre");

        jLabel11.setText("Stock");

        jLabel12.setText("Precio");

        Buscar.setText("BUSCAR");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Subtotal");

        jLabel3.setText("Iva");

        jLabel4.setText("Total");

        jScrollPane2.setViewportView(list2);

        javax.swing.GroupLayout VenderLayout = new javax.swing.GroupLayout(Vender);
        Vender.setLayout(VenderLayout);
        VenderLayout.setHorizontalGroup(
            VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VenderLayout.createSequentialGroup()
                .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VenderLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel8))
                    .addGroup(VenderLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addGroup(VenderLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Iva)
                                    .addComponent(Total)
                                    .addComponent(Subtotal)))
                            .addGroup(VenderLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre1))
                            .addGroup(VenderLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Stock))
                            .addGroup(VenderLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(Precio1)
                                .addGap(168, 168, 168)
                                .addComponent(Agregar))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(VenderLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Buscar)))))
                .addGap(24, 24, 24))
        );
        VenderLayout.setVerticalGroup(
            VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VenderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(13, 13, 13)
                .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Nombre1))
                .addGap(18, 18, 18)
                .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Stock))
                .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VenderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Precio1)))
                    .addGroup(VenderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Agregar)))
                .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VenderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(Subtotal)
                        .addGap(74, 74, 74))
                    .addGroup(VenderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Iva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Total))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Menuopcion.addTab("VENDER", Vender);

        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Menuopcion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(Menu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu)
                .addGap(12, 12, 12)
                .addComponent(Menuopcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_NombreActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar1ActionPerformed
        // obtener valor de las cajas
        String tipo = "";
        tipo = tipo + Tipo.getSelectedItem().toString();
        String nombre = Nombre.getText();
        String unidad = Unidad.getText();
        int cantidad = Integer.parseInt(Cantidad.getText());
        double precio = Double.parseDouble(Precio.getText());
        //Creamos un objeto de tipo producto
        Producto producto = new Producto(tipo, nombre, unidad, cantidad, precio);
        //Agregamos el producto a nuestra lista de productos
        productos.add(producto);
        int contProducto = 0;
        contProducto = contProducto + 1;

        String[] prod = new String[productos.size()];

        // recorrer los productos de la lista productos
        int cont = 0;
        for (Producto prod2 : productos) {
            prod[cont] = String.format("%s%30s%25s%25s%25s", prod2.getTipo(), prod2.getNombre(), prod2.getUnidad_medida(), prod2.getCantidad(), prod2.getPrecio());
            cont++;
        }
        list.setListData(prod);
        limpiar();
    }//GEN-LAST:event_Guardar1ActionPerformed
    public void limpiar() {
        Nombre.setText("");
        Unidad.setText("");
        Cantidad.setText("");
        Precio.setText("");
    }
    private void UnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnidadActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        String nombre_a_buscar = Busqueda.getText();

        int cont = 0;
        for (Producto p : productos) {
            if (p.getNombre().contains(nombre_a_buscar)) {
                Nombre1.setText(p.getNombre());
                Stock.setText(String.valueOf(p.getCantidad()));
                Precio1.setText(String.valueOf(p.getPrecio()));
            }

        }


    }//GEN-LAST:event_BuscarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:

        dispose();// se cierre los formularios
    }//GEN-LAST:event_SalirActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        String nombre_a_buscar = Busqueda.getText();

        int cont = 0;
        String[] prod = new String[productos.size()];
        for (Producto p : productos) {
            if (p.getNombre().contains(nombre_a_buscar)) {
                Nombre1.setText(p.getNombre());
                Stock.setText(String.valueOf(p.getCantidad()));
                Precio1.setText(String.valueOf(p.getPrecio()));
                prod[cont] = String.format("%s%30s%25s%25s%25s", p.getTipo(), p.getNombre(), p.getUnidad_medida(), p.getCantidad(), p.getPrecio());
            }
            cont++;
        }
        list2.setListData(prod);
         limpiar();

    }//GEN-LAST:event_AgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Busqueda;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JLabel Cantidades1;
    private javax.swing.JButton Guardar1;
    private javax.swing.JLabel Iva;
    private javax.swing.JLabel Menu;
    private javax.swing.JTabbedPane Menuopcion;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombres1;
    private javax.swing.JTextField Precio;
    private javax.swing.JLabel Precio1;
    private javax.swing.JPanel Registrar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Stock;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JLabel Tipos1;
    private javax.swing.JLabel Total;
    private javax.swing.JTextField Unidad;
    private javax.swing.JLabel Unidades1;
    private javax.swing.JPanel Vender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList list;
    private javax.swing.JList<String> list2;
    // End of variables declaration//GEN-END:variables

}
