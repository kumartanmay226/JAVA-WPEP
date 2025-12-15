
import java.util.Scanner;

public class AreaCircle {

    static float area(int r){
        float result = 3.141f * r * r;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle to calculate area ->");
        int r = sc.nextInt();

        float a = area(r);
        System.out.println("The area of Circle is -> "+a);
    }
}
