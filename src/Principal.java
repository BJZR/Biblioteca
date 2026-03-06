public class Principal {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Usuario u1 = new Usuario("Brayan", "123");
        Usuario u2 = new Usuario("Ana", "456");

        biblioteca.registrarUsuario(u1);
        biblioteca.registrarUsuario(u2);

        Libro l1 = new Libro("Java Basico", "Juan Perez", 2020, "111");
        Libro l2 = new Libro("POO en Java", "Maria Lopez", 2019, "222");
        Libro l3 = new Libro("Algoritmos", "Carlos Ruiz", 2018, "333");

        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);

        System.out.println("Libros disponibles:");
        biblioteca.mostrarDisponibles();

        System.out.println("\nPrestamo de libro");

        u1.solicitarPrestamo(l1);

        System.out.println("\nLibros disponibles despues del prestamo:");
        biblioteca.mostrarDisponibles();

        System.out.println("\nDevolucion del libro");

        u1.devolverLibro(l1);

        System.out.println("\nLibros disponibles despues de devolver:");
        biblioteca.mostrarDisponibles();

    }
}