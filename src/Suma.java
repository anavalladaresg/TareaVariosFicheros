import java.util.Scanner;

public class Suma {

    Scanner sc = new Scanner(System.in);
    public void suma () {
        //Pedir datos por pantalla
        System.out.println("Introduzca el primer número a sumar: ");
        int num1 = this.sc.nextInt();
        System.out.println("Introduzca el segundo número a sumar: ");
        int num2 = this.sc.nextInt();

        //Operación suma
        int suma = num1 + num2;
        System.out.println(num1 + "+" + num2 + "= " + suma);
    }

    public void multiplicar () {
        //Pedir datos por pantalla
        System.out.println("Introduzca el primer número a multiplicar: ");
        int num1 = this.sc.nextInt();
        System.out.println("Introduzca el segundo número a multiplicar: ");
        int num2 = this.sc.nextInt();

        //Operación multiplicar
        int multiplicacion = num1 * num2;
        System.out.println(num1 + "*" + num2 + "= " + multiplicacion);
    }

}
