import java.util.Scanner;
import java.util.Random;
public class R_P_S_game {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissor
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper,2 for scissor: ");
        int ui = sc.nextInt();

        Random random = new Random();
        int si= random.nextInt(3);

        if (ui == si ) {
            System.out.println("The match is Draw");
        } else if ( ui==0 && si==2 || ui==1 && si==0 || ui==2 && si==1) {
            System.out.println("you win this match");
        } else {
            System.out.println("you lose this match");
        }
        System.out.println("the si input is: " +si);
        if (si == 0) {
            System.out.println("si selected rock");
        } else if (si==1) {
            System.out.println("si selected paper");
        } else if (si==2) {
            System.out.println("si selected scissor");
      }
//        problem2
//
//
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the Temp of city: ");
//        int C= sc.nextInt();
//        int F= (C*9/5)+32;
//        System.out.println(F);
//
//
//        prbm3
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.print("* ");
//        }
//        System.out.print("\n");
//        for(int i=0;i<n;i++){
////            System.out.println("*");
//
////        prbm4
//        Scanner sc = new Scanner(System.in);
//        int a,b,c,d=0;
//        a = sc.nextInt();
//        b= sc.nextInt();
//        c= sc.nextInt();
//        if(a>b && a>c){
//            d= a*a*2;
//        }else if(b>c && a<b){
//             d= b*b*2;
//        }else if(a<c && b<c) {
//             d= c*c*2;
//        }
//        System.out.println(d);
//        if(d<((a*a)+(b*b)+(c*c))){
//            System.out.println("1");
//        }else if(d==((a*a)+(b*b)+(c*c))){
//            System.out.println("2");
//        }else if(d>((a*a)+(b*b)+(c*c))){
//            System.out.println("3");
//        }
//
////        }
    }
}
