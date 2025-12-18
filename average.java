package JAVAC;


import java.util.Scanner;

public class average {

    static int calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3;  
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter first number ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        System.out.println("Enter third number");
        int n3 = sc.nextInt();

        int ave = calculateAverage(n1, n2, n3);
        System.out.println("The average of above three numbers is -> " + ave);
    }
}