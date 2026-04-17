package NivelIntermedio;

public class Empleado {
    private String nombre;
    private String id;
    private double salario;
    private String departamento;

    public Empleado(String nombre, String id, double salario, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getId() {
        return id;
    }

    public double salarioAnual() {
        return salario * 12;
    }

    public void aplicarAumentoPorcentual(double porcentaje) {
        if (porcentaje <= 0) {
            System.out.println("El aumento debe ser mayor que 0.");
            return;
        }
        salario += salario * (porcentaje / 100.0);
    }

    public String mostrar() {
        return "Nombre: " + nombre +
                " | ID: " + id +
                " | Salario: " + salario +
                " | Departamento: " + departamento;
    }
}

