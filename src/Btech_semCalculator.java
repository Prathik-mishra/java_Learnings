import java.util.Scanner;

public class Btech_semCalculator {
    public static void main(String[] args) {
        System.out.println("***********************************************************************************************************************************************************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, This program is designed by prathik Mishra with love... please enjoy your Results cgpa");
        System.out.println("Enter the semester");
        String Title = sc.nextLine();
        System.out.printf("Enter the total number of subjects in %s semester: \n",Title);
        int subjects = sc.nextInt();
        System.out.printf("Enter the marks for %s semester: ",Title);
        int subMarks[] = new int[subjects];
        int subCredit[] = new int[subjects];
        for(int i=0;i<subjects;i++){
            System.out.printf("Enter the marks in sub %d: \n",i+1);
            subMarks[i] = sc.nextInt();
            System.out.printf("Enter the Credits in sub %d: \n",i+1);
            subCredit[i] = sc.nextInt();
        }
        int credSum = 0;
        int sum = 0;
        for(int i=0;i<subjects;i++){
            credSum = credSum + subCredit[i];
            sum = sum + subMarks[i]*subCredit[i];
        }
        System.out.println("your SumxCred is: "+sum);
        float cgpa = (float) sum/credSum;
        System.out.printf("Your Cgpa is: %.2f \n",cgpa);
        System.out.println("Cgpa in percentage "+cgpa*9.5);
        System.out.println("****************************************************************************************************************************************************************************************************************************************************");
    }
}
