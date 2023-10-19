
package co.com.tienda.entidades;

public class Fabricante {
    private int idFabricante;
    private String nombreFabricante;

    public Fabricante() {
    }

    public Fabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    
    

    public Fabricante(int idFabricante, String nombreFabricante) {
        this.idFabricante = idFabricante;
        this.nombreFabricante = nombreFabricante;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        String string = "Fabricante:" + "\n" +
                "ID: " + this.idFabricante + "\n" + 
                "Nombre: " + this.nombreFabricante + "\n";
        return string;
    }
    
    
}
