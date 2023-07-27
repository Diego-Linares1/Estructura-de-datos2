
package heladeria;

public class Productos {
    private double monto;
    private int cantidadHelado;
    private int cantidadPostre;
    private int cantidadBebida;
    private String helado;
    private String postre;
    private String bebida;
    private String fechaHora;

    
    public Productos(int cantidadHelado, int cantidadPostre, int cantidadBebida, String helado, String postre, String bebida) {
        this.cantidadHelado = cantidadHelado;
        this.cantidadPostre = cantidadPostre;
        this.cantidadBebida = cantidadBebida;
        this.helado = helado;
        this.postre = postre;
        this.bebida = bebida;
    }
    
    public Productos(double monto) {
        this.monto = monto;
    }
    
    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    public String getFechaHora() {
        return fechaHora;
    }
    
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantidadHelado() {
        return cantidadHelado;
    }

    public void setCantidadHelado(int cantidadHelado) {
        this.cantidadHelado = cantidadHelado;
    }

    public int getCantidadPostre() {
        return cantidadPostre;
    }

    public void setCantidadPostre(int cantidadPostre) {
        this.cantidadPostre = cantidadPostre;
    }

    public int getCantidadBebida() {
        return cantidadBebida;
    }

    public void setCantidadBebida(int cantidadBebida) {
        this.cantidadBebida = cantidadBebida;
    }

    public String getHelado() {
        return helado;
    }

    public void setHelado(String helado) {
        this.helado = helado;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
    
    public void calcularMonto(int helado, int bebida, int postre) {
        /*
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
        
        if (helado > 0) {
            this.monto = helado * 
        }
        */
    }
}
