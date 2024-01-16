import java.util.Scanner;

public class Cbse_calculator_Excercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of The Student: ");
        String name = sc.nextLine();
        System.out.println("Enter the marks of the student in following subjects");
        System.out.println("Hindi: ");
        int s1= sc.nextInt();
        System.out.println("English: ");
        int s2= sc.nextInt();
        System.out.println("Maths: ");
        int s3= sc.nextInt();
        System.out.println("Science: ");
        int s4= sc.nextInt();
        System.out.println("Social studies: ");
        int s5= sc.nextInt();
        float Total = s1+s2+s3+s4+s5;
        float TotalMarks = 500.0f;
        float Percentage = (Total/TotalMarks)*100;
        System.out.printf("The percentage of %s in CBSE Board Exams is: %.2f",name,Percentage);
    }
}

