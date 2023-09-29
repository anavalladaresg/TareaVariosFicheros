import java.util.Scanner;

public class Suma {

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    public void suma () {
        int suma = this.num1 + this.num2;
        System.out.println(this.num1 + "+" + this.num2 + "= " + suma);
    }


}
