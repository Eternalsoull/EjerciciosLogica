package NivelIntermedioAvanzado;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public int getCantidadPrestados() { return librosPrestados.size(); }
    public ArrayList<Libro> getLibrosPrestados() { return librosPrestados; }

    public boolean puedePedirPrestado() {
        return librosPrestados.size() < 3;
    }

    public void agregarPrestamo(Libro libro) {
        librosPrestados.add(libro);
    }

    public boolean devolverLibro(String isbn) {
        for (int i = 0; i < librosPrestados.size(); i++) {
            if (librosPrestados.get(i).getIsbn().equals(isbn)) {
                librosPrestados.remove(i);
                return true;
            }
        }
        return false;
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario: ").append(nombre).append(" | Libros prestados: ").append(librosPrestados.size()).append("/3\n");
        if (librosPrestados.isEmpty()) {
            sb.append("  (sin libros prestados)");
        } else {
            for (Libro l : librosPrestados) {
                sb.append("  - ").append(l.getTitulo()).append("\n");
            }
        }
        return sb.toString();
    }
}
