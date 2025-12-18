package JAVAC;
import java.util.Scanner;

public class sumtwo {

    static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int numOne = sc.nextInt();
        System.out.println("Enter second number");
        int numTwo = sc.nextInt();
        
        int result = sum(numOne, numTwo);
        System.out.println("Sum: " + result);
    }

}
