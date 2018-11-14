package Trabajo_Final;

public class productoCombo {
    private int id;
    private String nombre;
    private int precio;
    
    public productoCombo(int id, String nombre, int precio){
        setId(id);
        setNombre(nombre);
        setPrecio(precio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
          
    public String toString(){
        return this.nombre;
    }

    
}
