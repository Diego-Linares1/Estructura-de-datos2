
package heladeria;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
    private Lista data;
   
    public MyTableModel(Lista data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.getTamanio();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Nodo actual = data.getInicio();
        
        for (int i = 0; i < rowIndex && actual != null; i++) {
            actual = actual.getEnlace();
        }
        
        if(actual != null) {
            Productos producto = actual.getInformacion();
            if (columnIndex == 0) {
                return producto.getFechaHora();
            }
            else if (columnIndex == 1) {
                return "<html>" + producto.getCantidadHelado() + " " + producto.getHelado() + "<br>" +
                       producto.getCantidadPostre() + " " + producto.getPostre() + "<br>" +
                       producto.getCantidadBebida() + " " + producto.getBebida() + "</html>";
            }
            else if (columnIndex == 2) {
                return producto.getMonto();
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Fecha";
        }
        else if (columnIndex == 1) {
            return "Productos";
        }
        else if (columnIndex == 2) {
            return "Monto";
        }
        return "";
    }

    // Aquí puedes implementar métodos para modificar los datos según tus necesidades.
}
