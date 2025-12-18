package JAVAC;


import java.util.Scanner;

public class AreaRec {
    static float area(int b, int h) {
        float result = 0.5f * b * h;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base of Traingle to calculate area ->");
        int b = sc.nextInt();

        System.out.println("Enter height of Traingle to calculate area ->");
        int h = sc.nextInt();

        float a = area(b,h);
        System.out.println("The area of Triangle is -> " + a);
    }
}
