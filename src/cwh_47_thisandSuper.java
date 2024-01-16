class Ek{
   int a;
   public int getA(){
       return a;
   }
    Ek(int a){
        this.a= a;
    }
    public int returnClass(){
        return 1;
    }
}
class Eke extends Ek{
    int b;

    Eke(int b){
        super(b);
        System.out.println("I am in constructor");
    }


}

public class cwh_47_thisandSuper {
    public static void main(String[] args) {
        Ek e = new Ek(3);
        System.out.println(e.getA());
        Eke f = new Eke(6);
        System.out.println();
    }
}
