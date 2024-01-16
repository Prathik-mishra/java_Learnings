package codewithpm;
import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1 = 0;
      int n2 = 1;
      int fib=0;
      int first =0;
      int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else if (n ==1) {
            System.out.println(1);
        } else if (n >=2) {
            for(int i=1;i<n;i++){       // 0 1 1 2 3 5 8 13   intuition for the series...
                fib = n1+n2;            // 0 1 2 3 4 5 6 7   for value of n
                n1=n2;
                n2=fib;

        }
            System.out.println(fib);
      }
    }
}
