package NivelAvanzado;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarLibro(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public Usuario buscarUsuario(String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(nombre)) return u;
        }
        return null;
    }

    public String prestarLibro(String nombreUsuario, String isbn) {
        Usuario usuario = buscarUsuario(nombreUsuario);
        if (usuario == null) return "Usuario no encontrado.";
        if (!usuario.puedePedirPrestado()) return "El usuario ya tiene 3 libros prestados.";

        Libro libro = buscarLibro(isbn);
        if (libro == null) return "Libro no encontrado.";
        if (!libro.isDisponible()) return "El libro ya está prestado.";

        libro.prestar();
        usuario.agregarPrestamo(libro);
        return "Libro prestado exitosamente.";
    }

    public String devolverLibro(String nombreUsuario, String isbn) {
        Usuario usuario = buscarUsuario(nombreUsuario);
        if (usuario == null) return "Usuario no encontrado.";

        if (!usuario.devolverLibro(isbn)) return "El usuario no tiene ese libro.";

        Libro libro = buscarLibro(isbn);
        if (libro != null) libro.devolver();
        return "Libro devuelto exitosamente.";
    }

    public ArrayList<Libro> listarLibros() { return libros; }
    public ArrayList<Usuario> listarUsuarios() { return usuarios; }
}
