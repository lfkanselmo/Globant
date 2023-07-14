package entities;

/**
 *
 * @author Krausser
 */
public class Phone {

    private String marca;
    private String modelo;
    private double precio;
    private int ram;
    private int almacenamiento;
    private int[] codigo = new int[7];

    //constructores
    public Phone() {
    }

    public Phone(String marca, String modelo, double precio, int ram, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Phone{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
    }

}
