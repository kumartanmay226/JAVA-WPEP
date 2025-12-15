import java.util.Scanner;

public class GratestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number -> ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number -> ");
        int n2 = sc.nextInt();
        System.out.print("Enter tird number -> ");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println("Gretest num is -> "+n1);
        } else if(n2>n1 && n2>n3){
            System.out.println("Gretest num is -> "+n2);
        }else{
            System.out.println("Gretest num is -> "+n3);
        }
    }
}
