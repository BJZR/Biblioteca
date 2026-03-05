import java.util.Scanner;

public class UI {
    public int a;
    public int b;
    Scanner sc = new Scanner(System.in);
    Funcs funcs = new Funcs();

    public void menu() {
        System.out.println("-- menu -- \n" +
                "1.suma \n" +
                "2.resta \n" +
                "3.multiplicacion \n" +
                "4.division \n" +
                "5.salir \n"
        );
    }

    public int opcion(int numero) {
        if (numero == 1) {
            operar();
            funcs.suma(a, b);
            run();
        } else if (numero == 2){
            operar();
            funcs.resta(a, b);
            run();
        } else if (numero == 3) {
            operar();
            funcs.multiplicion(a, b);
            run();
        } else if (numero == 4) {
            operar();
            funcs.division(a, b);
            run();
        } else {
            System.out.println("hasta luego...");
        }
        return numero;
    }

    public void operar(){
        System.out.print("Introduce primer un número: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
        }
        System.out.print("Introduce segundo un número: ");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else if (sc.hasNextDouble()) {
            double b = sc.nextDouble();
        }

    }

    public void run(){
        menu();
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        opcion(numero);
    }

}


