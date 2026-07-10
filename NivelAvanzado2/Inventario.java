package NivelAvanzado2;

import java.util.ArrayList;
import java.util.Comparator;

public class Inventario {
    private ArrayList<ProductoInventario> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoInventario producto) {
        productos.add(producto);
    }

    public ProductoInventario buscarPorCodigo(String codigo) {
        for (ProductoInventario p : productos) {
            if (p.getCodigo().equals(codigo)) return p;
        }
        return null;
    }

    public String alertasStockBajo() {
        StringBuilder sb = new StringBuilder();
        for (ProductoInventario p : productos) {
            if (p.stockBajo()) {
                sb.append("ALERTA: ").append(p.getNombre()).append(" - Stock: ").append(p.getStock()).append("\n");
            }
        }
        return sb.isEmpty() ? "Sin alertas." : sb.toString();
    }

    public String reporteMasVendidos() {
        ArrayList<ProductoInventario> copia = new ArrayList<>(productos);
        copia.sort(Comparator.comparingInt(ProductoInventario::getVendidos).reversed());
        StringBuilder sb = new StringBuilder("--- Productos más vendidos ---\n");
        int limite = Math.min(5, copia.size());
        for (int i = 0; i < limite; i++) {
            ProductoInventario p = copia.get(i);
            sb.append((i + 1)).append(". ").append(p.getNombre()).append(" - Vendidos: ").append(p.getVendidos()).append("\n");
        }
        return sb.toString();
    }

    public String listarProductos() {
        if (productos.isEmpty()) return "Sin productos.";
        StringBuilder sb = new StringBuilder();
        for (ProductoInventario p : productos) {
            sb.append(p.mostrar()).append("\n");
        }
        return sb.toString();
    }
}
