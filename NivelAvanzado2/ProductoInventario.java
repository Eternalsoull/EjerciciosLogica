package NivelAvanzado2;

public class ProductoInventario {
    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int stock;
    protected int vendidos;

    public ProductoInventario(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.vendidos = 0;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public int getVendidos() { return vendidos; }

    public void vender(int cantidad) {
        if (cantidad > stock) {
            System.out.println("Stock insuficiente.");
            return;
        }
        stock -= cantidad;
        vendidos += cantidad;
    }

    public boolean stockBajo() {
        return stock < 5;
    }

    public String mostrar() {
        return codigo + " | " + nombre + " | $" + precio + " | Stock: " + stock + " | Vendidos: " + vendidos;
    }
}
