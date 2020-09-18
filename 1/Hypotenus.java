import java.util.Scanner;

public class Hypotenus {
    public static void main(String args[]) {
        Scanner myInput = new Scanner(System.in);
        int a, b;
        double c;

        // Get the first number
        do {
            a = myInput.nextInt();
        } while(a <= 0 || a > 1000);

        // Get the second number
        do {
            b = myInput.nextInt();
        } while(b <= 0 || b > 1000);

        c = Math.sqrt(a*a + b*b);
        System.out.println(c);
    }   
}