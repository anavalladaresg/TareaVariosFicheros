import java.util.Scanner;

public class Resta {
    Scanner sc = new Scanner(System.in);
    public void resta () {
        System.out.print("Introduzca el primer número a restar: ");
        int num1 = this.sc.nextInt();
        System.out.print("Introduzca el segundo número a restar: ");
        int num2 = this.sc.nextInt();
        int resta = num1 - num2;
        System.out.print(num1 + "-" + num2 + "= " + resta);
    }

}
