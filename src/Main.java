import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("What is your name");
       // Scanner sc= new Scanner(System.in);
//        String name= sc.next();
//        System.out.println("Hello "+name +",how are you?");

//        System.out.print("Enter the distance in kilometers: ");
//        double a= sc.nextInt();
//        double b= a/1.602;
//        System.out.println("The conversion of kilometers in miles is: " +b );

//        System.out.println("enter the input: ");
////        int a= sc.nextInt();
//        System.out.println(sc.hasNextInt());

        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int square = n*n;
//        int ans = square-n;
//        if(ans%10==0){
//            System.out.println("1");
//        }else{
//            System.out.println("0");
//        }

//        array sum
        int n = sc.nextInt();
        int[] array= new int[n];
        int i;
        for( i=0;i<n;i++){
           array[i]= sc.nextInt();
        }
        for( i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
       }
        System.out.println();
        for( i=0;i<array.length;i++){
            if(i%2==0) {
                System.out.print(array[i]+" ");
            }
        }

    }
}