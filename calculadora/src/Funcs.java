import java.io.PrintStream;

public class Funcs {

    public int result;

    public PrintStream suma(int a, int b){
        result = a + b;
        return System.out.printf("la suma de %d y %d es %d \n\n", a ,b , result);
    }

    public PrintStream resta(int a, int b){
        result = a - b;
        return System.out.printf("la resta de %d y %d es %d \n\n", a ,b , result);
    }

    public PrintStream multiplicion(int a, int b){
        result = a * b;
        return System.out.printf("la multiplicacion de %d y %d es %d \n\n", a ,b , result);
    }

    public PrintStream division(int a, int b){
        result = a / b;
        return System.out.printf("la divicion de %d y %d es %d \n\n ", a ,b , result);
    }


    // con flotantes..
    public PrintStream suma(double a, double b){
        double result = a + b;
        return System.out.printf("la multiplicacion de %f y %f es %.2f \n\n", a ,b , result);
    }

    public PrintStream resta(double a, double b){
        double result = a - b;
        return System.out.printf("la multiplicacion de %f y %f es %.2f \n\n", a ,b , result);
    }

    public PrintStream multiplicion(double a, double b){
        double result = a * b;
        return System.out.printf("la multiplicacion de %.2f y %f es %.2f \n\n", a ,b , result);
    }

    public PrintStream division(double a, double b){
        double result = a / b;
        return System.out.printf("la multiplicacion de %.2f y %.2f es %.2f \n\n", a ,b , result);
    }


}
