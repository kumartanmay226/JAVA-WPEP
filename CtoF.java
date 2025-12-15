

import java.util.Scanner;

public class CtoF {
    
    static float convert(float c){
        double f = (9.0/5.0) * c + 32;
        return (float)f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temp in Celcius to Farhanhit convert in  -> ");
        float f = sc.nextFloat();

        float result = convert(f);
        System.out.println("After converting from Celcius  to Franhite is ->"+result);

    }
}
