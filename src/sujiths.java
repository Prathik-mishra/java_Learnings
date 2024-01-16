import java.util.Scanner;

public class sujiths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scoreDolphine[] = new int[n];
        int scoreKolas[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            scoreDolphine[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            scoreKolas[i] = sc.nextInt();
        }
        int sumDs = 0;
        int sumKs = 0;
        for(int i = 0 ; i < n ; i++){
            sumDs = sumDs + scoreDolphine[i];
            sumKs = sumKs + scoreKolas[i];
        }
        float avgDs = sumDs/n;
        float avgKs = sumKs/n;
        if(avgDs>avgKs){
            System.out.println("Dolphins win the trophy ");
        }else if(avgKs>avgDs){
            System.out.println("Kolas win the trophy");
        }else{
            System.out.println("Both win the trophy");
        }
    }
}
