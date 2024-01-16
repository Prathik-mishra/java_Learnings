package codewithpm;
class Meth1{
    public int a =2;
    protected int b = 3;
    int c = 4;
    private int e = 5;
    public void Math(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
    }
}
public class first_program{
    public static void main(String[] args) {
          Meth1 ME = new Meth1();
          ME.Math();

        System.out.println(ME.a);
        System.out.println(ME.b);
        System.out.println(ME.c);
//        System.out.println(ME.e);   //this throws because of private access modifiers



    }
}