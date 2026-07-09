package NivelIntermedioAvanzado;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public boolean isDisponible() { return disponible; }
    public void prestar() { this.disponible = false; }
    public void devolver() { this.disponible = true; }

    public String mostrar() {
        return "Libro: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn + " | " + (disponible ? "Disponible" : "Prestado");
    }
}
