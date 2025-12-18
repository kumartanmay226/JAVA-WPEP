package JAVAC;
import java.util.Scanner;

public class Class11P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,3,7,6,8,12};
        // int arr[] = {5,3,6,1,12};

        System.out.println("choose a number between 2,3,7,6,8,12 ");
        int num = sc.nextInt();

        if(num==2 ||num==3||num==7||num==6||num==8||num==12){
            for(int i =1;i<12;i++){
                int result = num*2; 
                if(result==2||num==3||num==7||num==6||num==8||num==12){
                    result = result*2;
                }else{
                    System.out.println(result);
                }
            }
        }else{
            System.out.println("Enter a valid number");
        }
    }
}


