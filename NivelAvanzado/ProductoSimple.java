package NivelAvanzado;

public class ProductoSimple {
    private String nombre;
    private double precio;

    public ProductoSimple(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    public String mostrar() {
        return nombre + " - $" + precio;
    }
}
