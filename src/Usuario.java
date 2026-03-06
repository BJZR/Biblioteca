import java.util.ArrayList;

public class Usuario {

    String nombre;
    String identificacion;
    ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        librosPrestados = new ArrayList<>();
    }

    public boolean solicitarPrestamo(Libro libro) {

        if(librosPrestados.size() >= 3){
            System.out.println("No puede tener mas de 3 libros");
            return false;
        }

        if(!libro.disponible){
            System.out.println("El libro ya esta prestado");
            return false;
        }

        libro.prestar();
        librosPrestados.add(libro);

        return true;
    }

    public void devolverLibro(Libro libro){

        if(librosPrestados.contains(libro)){
            libro.devolver();
            librosPrestados.remove(libro);
        }

    }

}