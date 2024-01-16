import java.util.Scanner;
public class problems_000 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str= sc.nextLine();
//        String str2= str.toLowerCase();
//        System.out.println(str2);
//        int[] ary= new int[5];
//        for(int i=0;i<5;i++){
//            ary[i]=sc.nextInt();
//        }
//        System.out.println(ary);
//        int a=2;
//        long equ= a**2;

//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        //Write your code here
//        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
//            System.out.println("31");
//        }else if(m==4 || m==6 || m==9 || m==11){
//            System.out.println("30");
//        }else if(m==2){
//            System.out.println("28");
//        }

//           Scanner input = new Scanner(System.in);
//             int n = input.nextInt();
////	       	 input.close();
//             long fact = n;
//              // Write your code here
//	      	 for(int i=1;i<n;i++){
//               fact = fact * (n-i);
//             }
//               System.out.println(fact);
//              Scanner input = new Scanner(System.in);

//        Scanner sc = new Scanner(System.in);
//        float ab = sc.nextInt();
//        float C = (ab-32)*(5/9f);
//        System.out.println(C);
        //Question 2 series:-
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        float fact = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            sum += (i * (i + 1)) / fact;
            fact = 1;
        }
        System.out.println(sum);


    }
}
