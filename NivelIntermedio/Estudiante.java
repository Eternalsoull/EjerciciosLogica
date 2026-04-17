package NivelIntermedio;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int edad;
    private ArrayList<Double> calificaciones;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 5) {
            System.out.println("La calificación debe estar entre 0 y 5.");
            return;
        }
        this.calificaciones.add(calificacion);
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (double c : calificaciones) {
            suma += c;
        }
        return suma / calificaciones.size();
    }

    public boolean aprobo() {
        // Regla simple: promedio >= 3.0
        return calcularPromedio() >= 3.0;
    }

    public String mostrarInformacionCompleta() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Calificaciones: ");
        if (calificaciones.isEmpty()) {
            sb.append("(sin calificaciones)");
        } else {
            for (int i = 0; i < calificaciones.size(); i++) {
                sb.append(calificaciones.get(i));
                if (i < calificaciones.size() - 1) sb.append(", ");
            }
        }
        sb.append("\n");
        sb.append("Promedio: ").append(calcularPromedio()).append("\n");
        sb.append("Estado: ").append(aprobo() ? "Aprobado" : "Reprobado");
        return sb.toString();
    }
}

