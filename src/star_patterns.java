import java.util.Scanner;
public class star_patterns {
    public static void main(String[] args) {
        System.out.println("increasing triangle");
       int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


//        for decreasing triangle:
        System.out.println("for decreasing triangle");
        int o=5;
        for(int i=1;i<=o;i++){
            for(int j=i;j<=o;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        for right sided traingle star incrementing:
        System.out.println("for right sided traingle star incrementing:");
        int p=5;
        for(int i=1;i<=p;i++){
            for(int j=i;j<=p;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        for right sided triangle star decrementing:
        System.out.println("for right sided triangle star decrementing:");
        int q=5;
        for(int i=1;i<=q;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=q;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        for uphill pattern
        System.out.println("for uphill pattern");
        int r=5;
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        for downhill pattern
        System.out.println("for downhill pattern");
        int s=5;
        for(int i=1;i<=s;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<s;j++){
                System.out.print("* ");
            }
            for(int j=i;j<=s;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        for dimaond pattern:
        System.out.println("for dimaond pattern:");
        int t=5;
        for(int i=1;i<t;i++){
            for(int j=i;j<=t;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=t;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<t;j++){
                System.out.print("* ");
            }
            for(int j=i;j<=t;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        //question 1 triangle star pattern
        Scanner sc= new Scanner(System.in);
        int u=sc.nextInt();
        for(int i=1;i<=u;i++){
            for(int j=i;j<=u;j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }

            System.out.println();
        }




    }
}
