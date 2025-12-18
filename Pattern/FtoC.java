package JAVAC;


import java.util.Scanner;

public class FtoC {

    static float convert(float f){
        double c = (5.0/9.0) * (f - 32);
        return (float)c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temp in Farnhite to convert in Celcius -> ");
        float f = sc.nextFloat();

        float result = convert(f);
        System.out.println("After converting from Faranhite to Celcius is ->"+result);

    }
}
