package JAVAC;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num i will check it is Even or Odd-> ");
        
        int num = sc.nextInt();
        if(num%2 ==0 ){
            System.out.println("The number is even");
        }else
            System.out.println("The number is Odd");
    }
}
