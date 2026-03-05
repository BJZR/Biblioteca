package ejecucion;

import animales.Mascotas;

public class Principal {
    public static void main(String[] args) {
        Mascotas animal = Mascotas();
        animal.setNombre("perro");
        animal.mostrarInfo();
        System.out.println("run..");
    }
}