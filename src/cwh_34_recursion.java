import java.util.Scanner;
public class cwh_34_recursion {
    static int recursion(int n){                                    // fact by using recursion method

        if(n==0 || n==1){
            return 1;
        }else{
           return n *= recursion(n-1);

        }
    }
    static int fact_iterative(int n){                             //fact  by using iterative method
        int factorial1=1;
        if(n==0 || n==1){
            return 1;
        }else {
            for (int i = 1; i <= n; i++) {
                factorial1 *= i;
            }
            return factorial1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The factorial of n is : " +recursion(6));
        System.out.println("The factorial of n is : " +fact_iterative(6));
    }
}
