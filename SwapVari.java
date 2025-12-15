
import java.util.Scanner;

public class SwapVari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number -> ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number -> ");
        int n2 = sc.nextInt();

        int sum = n1+n2;
        System.out.println("Number after swapping are ->\n");
        System.out.println("Fist number -> "+(sum-n1));
        System.out.println("Second number-> "+(sum-n2));
    }
}
