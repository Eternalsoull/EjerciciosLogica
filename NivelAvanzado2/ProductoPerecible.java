package NivelAvanzado2;

import java.time.LocalDate;

public class ProductoPerecible extends ProductoInventario {
    private LocalDate fechaVencimiento;

    public ProductoPerecible(String codigo, String nombre, double precio, int stock, LocalDate fechaVencimiento) {
        super(codigo, nombre, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() { return fechaVencimiento; }

    public double calcularDescuento() {
        long diasParaVencer = LocalDate.now().until(fechaVencimiento).getDays();
        if (diasParaVencer <= 0) return 100;
        if (diasParaVencer <= 3) return 50;
        if (diasParaVencer <= 7) return 20;
        return 0;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " | Vence: " + fechaVencimiento + " | Descuento: " + calcularDescuento() + "%";
    }
}
