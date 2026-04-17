package NivelIntermedio;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void aumentarCantidad(int extra) {
        this.cantidad += extra;
    }

    public double subtotal() {
        return precio * cantidad;
    }

    public String mostrar() {
        return nombre + " | Precio: " + precio + " | Cantidad: " + cantidad + " | Subtotal: " + subtotal();
    }
}

