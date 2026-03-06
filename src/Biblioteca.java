import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libro> libros;
    ArrayList<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public Libro buscarPorTitulo(String titulo){

        for(Libro l : libros){
            if(l.titulo.equalsIgnoreCase(titulo)){
                return l;
            }
        }

        return null;
    }

    public void buscarPorAutor(String autor){

        for(Libro l : libros){
            if(l.autor.equalsIgnoreCase(autor)){
                System.out.println(l.titulo);
            }
        }

    }

    public void mostrarDisponibles(){

        for(Libro l : libros){
            if(l.disponible){
                System.out.println(l.titulo + " - " + l.autor);
            }
        }

    }

}