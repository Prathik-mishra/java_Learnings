import java.util.Scanner;

public class chapter2 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        //eq1 sol:
        System.out.println("Enter The Value of Eq1");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float eq1 = (x-y)/2;
        System.out.println(eq1);
        //eq2 sol:
        System.out.println("Enter The Value of Eq2");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float eq2 = ((b*b)-4*a*c)/2*a;
        System.out.println(eq2);
        //eq3 sol:
        System.out.println("Enter The Value of Eq3");
        float v = sc.nextFloat();
        float u = sc.nextFloat();
        float eq3 = (v*v)-(u*u);
        System.out.println(eq3);
        //eq4:
        System.out.println("Enter The Value of Eq4");
        float d = sc.nextFloat();
        float eq4 = a+b-d;
        System.out.println(eq4);           */

        //Increment & Decrement Operator:

        int a = 5;
        a++;
        System.out.println(a);

        int b = 5;
        ++b;
        System.out.println(b);

        for(int i=1;i<=10;++i){
            System.out.println(i);
        }

        int y = 7;
        int x = ++y*8;
        System.out.println(x);

        char as = 'b';
        as++;
        System.out.println(as);

        String name = "TheHackerPrathik";
        String name1 = name.substring(3);
        String name2 = name.substring(3,9);
        System.out.println(name1);
        System.out.print(name2+"\n");
        System.out.println("djjajaj");
    }
}
