package NivelIntermedio;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (producto.getCantidad() <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
            return;
        }
        if (producto.getPrecio() < 0) {
            System.out.println("El precio no puede ser negativo.");
            return;
        }

        // Si ya existe el producto por nombre, sumamos cantidades
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(producto.getNombre())) {
                p.aumentarCantidad(producto.getCantidad());
                return;
            }
        }
        productos.add(producto);
    }

    public boolean eliminarProducto(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(i);
                return true;
            }
        }
        return false;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.subtotal();
        }
        return total;
    }

    public double aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("El descuento debe estar entre 0 y 100.");
            return calcularTotal();
        }
        double total = calcularTotal();
        return total - (total * (porcentaje / 100.0));
    }

    public ArrayList<Producto> listarProductos() {
        return productos;
    }
}

