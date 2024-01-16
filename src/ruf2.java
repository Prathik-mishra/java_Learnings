import java.util.Scanner;

public class ruf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;
        String S = "y";
        int n;
        while(S.equals("y")){
            n = sc.nextInt();
            if(n > maxEle){  // for the max element:
                maxEle = n;
            }
            if(n < minEle){  // for the min element:
                minEle = n;
            }
            S = sc.next();	// --> Taking a char to move to the next char
        }
        System.out.println("Largest number: "+maxEle);
        System.out.println("Smallest number: "+minEle);

    }
}
























//        int n = sc.nextInt();
//        int m = sc.nextInt();
//       int arr[][] = new int[n][m];
//       for(int i = 0 ; i < n ; i++){
//           for(int j = 0 ; j < m ; j++){
//               arr[i][j] = sc.nextInt();
//           }
//       }
       // sum starts from here: Write for here in function:
//        int index = -1;
//        int count;
//        int maxCount = 0;
//        for(int i = 0 ; i < n ; i++){
//            count = 0;
//            for(int j = 0 ; j < m ; j++){
//               if(arr[i][j] == 1){
//                   count++;
//               }
//            }
//            if(count > maxCount){
//                index = i;
//                maxCount = count;
//            }
//        }
//        System.out.println(index);  // return index;  (keep this dont print)


//        for(int i = 0 ; i < n ; i++){
//            // O(N)
//        }
//        for(int i = 0 ; i < n ; i++){
//            // time complex : O(N)
//            for(int j = 0 ; j < n ; j/=2) {
//                // O(N2)
//            }
//        }
//        for(int i = 0 ; i < n ; i++){
//            // O(N)
//        }

//        long n = 100;
//        long m = (long) Math.pow(n,100);
//        System.out.println(m);


//    }
//}
