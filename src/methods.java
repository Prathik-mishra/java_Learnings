import java.util.Scanner;
public class methods {
    static int logic(int x,int y){              //making a method
        int z;
        if(x>y){
            z = x*y;
        }else {
            z = x*x;
        }
        return z;
    }
    int logics(int x,int y){                     //for method without "static"
        int z;
        if(x>y){
            z = x*y;
        }else {
            z = x*x;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = logic(a,b);
        System.out.println(c);                          // calling the logic for c
        int p= sc.nextInt();
        int q= sc.nextInt();
        int r= logic(p,q);
        System.out.println(r);                           // calling the logic for r

        //invocation by creating an object
        methods obj= new methods();
        int g= sc.nextInt();
        int h= sc.nextInt();
        int i= obj.logics(g,h);                          // calling the logic for i by obj creation


    }
}
