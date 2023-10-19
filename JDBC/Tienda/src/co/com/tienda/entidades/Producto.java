
package co.com.tienda.entidades;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;
    private Fabricante fabricante;

    public Producto() {
    }

    public Producto(String nombreProducto, double precioProducto, Fabricante fabricante) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.fabricante = fabricante;
    }
    
    

    public Producto(int idProducto, String nombreProducto, double precioProducto, Fabricante fabricante) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.fabricante = fabricante;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        String string = "Producto: " + "\n" +
                "ID: " + this.idProducto + "\n" +
                "Nombre: " + this.nombreProducto + "\n" +
                "Precio: " + this.precioProducto + "\n" +
                "Fabricante: " + this.fabricante.getNombreFabricante() + "\n";
        return string;
    }
    
    
    
    
}
