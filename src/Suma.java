import java.util.Scanner;

public class Suma {

    Scanner sc = new Scanner(System.in);
    public void suma () {
        //Pedir datos por pantalla
        System.out.println("Introduzca el primer número a sumar: ");
        int num1 = this.sc.nextInt();
        System.out.println("Introduzca el segundo número a sumar: ");
        int num2 = this.sc.nextInt();

        //Operación
        int suma = num1 + num2;
        System.out.println(num1 + "+" + num2 + "= " + suma);
    }

}
