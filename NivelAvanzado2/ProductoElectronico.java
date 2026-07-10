package NivelAvanzado2;

public class ProductoElectronico extends ProductoInventario {
    private int garantiaMeses;
    private String marca;

    public ProductoElectronico(String codigo, String nombre, double precio, int stock, int garantiaMeses, String marca) {
        super(codigo, nombre, precio, stock);
        this.garantiaMeses = garantiaMeses;
        this.marca = marca;
    }

    public int getGarantiaMeses() { return garantiaMeses; }
    public String getMarca() { return marca; }

    @Override
    public String mostrar() {
        return super.mostrar() + " | Marca: " + marca + " | Garantía: " + garantiaMeses + " meses";
    }
}
