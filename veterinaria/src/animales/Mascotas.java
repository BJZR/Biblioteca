package animales;

public class Mascotas {
    private String  nombre;
    private int edad;
    private String raza;

    public Mascotas(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void mostrarInfo() {
        System.out.printf("[ Mascota: %s | Edad: %d años | Especie: %s ]",
                nombre, edad, raza);
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setRaza(String raza) { this.raza = raza; }

}
