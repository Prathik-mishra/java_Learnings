import java.util.Scanner;
public class to_print_numbers_inreverseorder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();

        for(int i=n;i>0;i--) {
            System.out.print(i);
        }
    }
}
