package JAVAC;


import java.util.Scanner;

public class DolltoRup {

    static float convert(float rupees){
        double dollars = rupees / 85;  
        return (float)dollars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount in rupees, I will convert it to dollars -> ");
        float rupees = sc.nextFloat();

        float result = convert(rupees);
        System.out.println("After converting -> " + result + " dollars");

    }
}