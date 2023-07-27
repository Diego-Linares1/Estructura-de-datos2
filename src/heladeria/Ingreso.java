
package heladeria;

import java.awt.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;

public class Ingreso extends javax.swing.JFrame {
    private MyTableModel myTableModel;
    
    // Precio helados
    double precioClasicoFresa = 5.5;
    double precioClasicoLucuma = 4.5;
    double precioClasicoChocolate = 3.5;
    // Precio postre
    double precioPieLimon = 5.0;
    double precioPieManzana = 4.0;
    double precioRedVelvet = 3.0;
    // Precio bebida 
    double precioLimonada = 2.0;
    double precioChicha = 3.5;
    double precioMaracuya = 3.0;
    // Monto total
    double montoTotal;
    
    Lista lista = new Lista();
    
    public Ingreso() {
        initComponents();
        refrescarTabla();
        txtCantidadHelado.setText(Integer.toString(0));
        txtCantidadPostre.setText(Integer.toString(0));
        txtCantidadBebida.setText(Integer.toString(0));
    }
    
    public void refrescarTabla() {
        myTableModel = new MyTableModel(lista);
        myJTable.setModel(myTableModel);
        
        // Ajustar la altura de cada fila del JTable según el contenido que se muestra
        adjustRowHeights();       
    }
    
    // Método para ajustar la altura de cada fila del JTable
    private void adjustRowHeights() {
        for (int row = 0; row < myJTable.getRowCount(); row++) {
            int rowHeight = myJTable.getRowHeight();

            for (int column = 0; column < myJTable.getColumnCount(); column++) {
                TableCellRenderer cellRenderer = myJTable.getCellRenderer(row, column);
                Component comp = myJTable.prepareRenderer(cellRenderer, row, column);
                rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
            }
            myJTable.setRowHeight(row, rowHeight);
        }
    }
    
    private int obtenerValorCantidadHelado() {
        // Obtener el valor del textField
        String cantidadHeladoStr = txtCantidadHelado.getText();
        
        // Convertir el valor a un entero
        int cantidadHelado = 0;
        try {
            cantidadHelado = Integer.parseInt(cantidadHeladoStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error, la cantidad de helado debe ser un número entero.");
            return 0;
        }
        
        return cantidadHelado;
    }
    
    private int obtenerValorCantidadPostre() {
        // Obtener el valor del textField
        String cantidadPostreStr = txtCantidadPostre.getText();
        
        // Convertir el valor a un entero
        int cantidadPostre = 0;
        try {
            cantidadPostre = Integer.parseInt(cantidadPostreStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error, la cantidad de postre debe ser un número entero.");
            return 0;
        }
        return cantidadPostre;
    }
    
    private int obtenerValorCantidadBebida() {
        // Obtener el valor del textField
        String cantidadBebidaStr = txtCantidadBebida.getText();
        
        // Convertir el valor a un entero
        int cantidadBebida = 0;
        try {
            cantidadBebida = Integer.parseInt(cantidadBebidaStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error, la cantidad de bebida debe ser un número entero.");
            return 0;
        }
        return cantidadBebida;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHelado = new javax.swing.JLabel();
        lblPostre = new javax.swing.JLabel();
        lblBebida = new javax.swing.JLabel();
        cmbHelado = new javax.swing.JComboBox<>();
        cmbPostre = new javax.swing.JComboBox<>();
        cmbBebida = new javax.swing.JComboBox<>();
        txtCantidadHelado = new javax.swing.JTextField();
        txtCantidadPostre = new javax.swing.JTextField();
        txtCantidadBebida = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPrecioHelado = new javax.swing.JLabel();
        lblPrecioPostre = new javax.swing.JLabel();
        lblPrecioBebida = new javax.swing.JLabel();
        lblMontoTotal = new javax.swing.JLabel();
        btnPrecioTotal = new javax.swing.JButton();
        lblMonto = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myJTable = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHelado.setText("HELADO");

        lblPostre.setText("POSTRE");

        lblBebida.setText("BEBIDA");

        cmbHelado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clasico de Fresa", "Clasico de Lucuma", "Clasico de Chocolate" }));
        cmbHelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHeladoActionPerformed(evt);
            }
        });

        cmbPostre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pie de Limon", "Pie de Manzana", "Red Velvet" }));

        cmbBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limonada", "Chicha", "Maracuya" }));

        txtCantidadHelado.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidadHelado.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidadHelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadHeladoActionPerformed(evt);
            }
        });

        txtCantidadPostre.setBackground(new java.awt.Color(255, 255, 255));

        txtCantidadBebida.setBackground(new java.awt.Color(255, 255, 255));

        lblCantidad.setText("CANTIDAD");

        jLabel1.setText("PRECIO");

        lblPrecioHelado.setBackground(new java.awt.Color(255, 255, 255));
        lblPrecioHelado.setText("00");

        lblPrecioPostre.setText("00");

        lblPrecioBebida.setText("00");

        lblMontoTotal.setText("00");

        btnPrecioTotal.setText("PRECIO");
        btnPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioTotalActionPerformed(evt);
            }
        });

        lblMonto.setText("MONTO:");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        myJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(myJTable);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHelado)
                    .addComponent(lblPostre)
                    .addComponent(lblBebida))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbHelado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPostre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecioPostre)
                            .addComponent(lblPrecioHelado)
                            .addComponent(lblPrecioBebida))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCantidadPostre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtCantidadHelado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidadBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMonto)
                        .addGap(18, 18, 18)
                        .addComponent(lblMontoTotal))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrecioTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrecioTotal))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtCantidadPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantidadBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMonto)
                                    .addComponent(lblMontoTotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHelado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecioHelado)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPostre)
                            .addComponent(cmbPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioPostre))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBebida)
                            .addComponent(cmbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioBebida))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHeladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHeladoActionPerformed

    private void txtCantidadHeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadHeladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadHeladoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int cantidadHelado = 0;
        int cantidadPostre = 0;
        int cantidadBebida = 0;
        
        cantidadHelado = obtenerValorCantidadHelado();
        cantidadPostre = obtenerValorCantidadPostre();
        cantidadBebida = obtenerValorCantidadBebida();
        String helado = cmbHelado.getSelectedItem().toString();
        String postre = cmbPostre.getSelectedItem().toString();
        String bebida = cmbBebida.getSelectedItem().toString();
        
        // Obtener la fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHoraActualStr = fechaHoraActual.format(formatter);
        
        Productos nuevoProducto = new Productos(cantidadHelado, cantidadPostre, cantidadBebida, helado, postre, bebida);
        
        // Asignar la fecha y hora actual al nuevo producto
        nuevoProducto.setFechaHora(fechaHoraActualStr);
        
        lista.ingreso(nuevoProducto);
        
        nuevoProducto.setMonto(montoTotal);
        
        JOptionPane.showMessageDialog(null, "Datos registrados correctamente");
        
        txtCantidadHelado.setText("0");
        txtCantidadPostre.setText("0");
        txtCantidadBebida.setText("0");                
        
        refrescarTabla();
        
        // Mostrar el precio en una etiqueta
        lblPrecioHelado.setText("0.0");
        lblPrecioPostre.setText("0.0");
        lblPrecioBebida.setText("0.0");
        lblPrecioBebida.setText("0.0");
        lblMontoTotal.setText("0.0");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioTotalActionPerformed
        int cantidadHelado = 0;
        int cantidadPostre = 0;
        int cantidadBebida = 0;
        
        cantidadHelado = obtenerValorCantidadHelado();
        cantidadPostre = obtenerValorCantidadPostre();
        cantidadBebida = obtenerValorCantidadBebida();
          
        // Obtener el precio correspondiente del producto seleccionado en el ComboBox
        String heladoSeleccionado = cmbHelado.getSelectedItem().toString();
        double precioHelado = 0.0;
        switch (heladoSeleccionado) {
            case "Clasico de Fresa":
                precioHelado = precioClasicoFresa;
                break;
            case "Clasico de Lucuma":
                precioHelado = precioClasicoLucuma;
                break;
            case "Clasico de Chocolate":
                precioHelado = precioClasicoChocolate;
                break;
            default:
                // Manejar un caso no esperado (opcional)
                break;
        }
        // Calcular el precio total para el postre seleccionado
        double precioTotalHelado = cantidadHelado * precioHelado;
        
        
        // Obtener el precio correspondiente del producto seleccionado en el ComboBox
        String postreSeleccionado = cmbPostre.getSelectedItem().toString();
        double precioPostre = 0.0;
        switch (postreSeleccionado) {
            case "Pie de Limon":
                precioPostre = precioPieLimon;
                break;
            case "Pie de Manzana":
                precioPostre = precioPieManzana;
                break;
            case "Red Velvet":
                precioPostre = precioRedVelvet;
                break;
            default:
                // Manejar un caso no esperado (opcional)
                break;
        }

        // Calcular el precio total para el postre seleccionado
        double precioTotalPostre = cantidadPostre * precioPostre;
        
        // Obtener el precio correspondiente del producto seleccionado en el ComboBox
        String bebidaSeleccionado = cmbBebida.getSelectedItem().toString();
        double precioBebida = 0.0;
        switch (bebidaSeleccionado) {
            case "Limonada":
                precioBebida = precioLimonada;
                break;
            case "Chicha":
                precioBebida = precioChicha;
                break;
            case "Maracuya":
                precioBebida = precioMaracuya;
                break;
            default:
                // Manejar un caso no esperado (opcional)
                break;
        }

        // Calcular el precio total para el postre seleccionado
        double precioTotalBebida = cantidadBebida * precioBebida;
        
        // Calcular monto total
        montoTotal = precioTotalBebida + precioTotalPostre + precioTotalHelado;
        
        // Mostrar el precio en una etiqueta
        lblPrecioHelado.setText(String.format("%.2f", precioTotalHelado));
        lblPrecioPostre.setText(String.format("%.2f", precioTotalPostre));
        lblPrecioBebida.setText(String.format("%.2f", precioTotalBebida));
        lblPrecioBebida.setText(String.format("%.2f", precioTotalBebida));
        lblMontoTotal.setText(String.format("%.2f", montoTotal));
    }//GEN-LAST:event_btnPrecioTotalActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Obtiene el índice de la fila seleccionada en la tabla
        int selectedRow = myJTable.getSelectedRow();

        // Verifica si se ha seleccionado una fila
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun producto para eliminar.");
            return;
        }

        // Obtiene el valor del monto del producto en la fila seleccionada
        double monto = (double) myJTable.getValueAt(selectedRow, 2);

        // Elimina el producto de la lista usando el código
        lista.eliminar(monto);

        // Refresca la tabla para mostrar los cambios actualizados
        refrescarTabla();

        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPrecioTotal;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbBebida;
    private javax.swing.JComboBox<String> cmbHelado;
    private javax.swing.JComboBox<String> cmbPostre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBebida;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblHelado;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblPostre;
    private javax.swing.JLabel lblPrecioBebida;
    private javax.swing.JLabel lblPrecioHelado;
    private javax.swing.JLabel lblPrecioPostre;
    private javax.swing.JTable myJTable;
    private javax.swing.JTextField txtCantidadBebida;
    private javax.swing.JTextField txtCantidadHelado;
    private javax.swing.JTextField txtCantidadPostre;
    // End of variables declaration//GEN-END:variables
}
