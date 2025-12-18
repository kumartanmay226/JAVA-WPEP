package JAVAC;
import java.util.Scanner;

public class LeapY {

    static boolean check(int y){
    boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);       
    return leap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year as your choice i will check it is a leapyear or not -> ");
        int y = sc.nextInt();

        boolean a = check(y);
        if(a){
            System.out.println("Yes it is a leap year");
        }else
            System.out.println("No , it is not");
    }
}
