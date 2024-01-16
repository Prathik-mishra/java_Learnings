class Base1{
    Base1() {
        System.out.println("I am in Constructor Base1");
    }
    Base1(int a){
        System.out.println("I am in constructor with Base value of a: "+a);
    }
}

class Derived1 extends Base1{
    Derived1() {
        System.out.println("I am in Constructor Derived1");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("I am in constructor with Base value of b: "+b);
    }
}

class Child1 extends Derived1{
    Child1() {
        System.out.println("I am in Constructor Child1");
    }
    Child1(int a,int b,int c){
        super(a,b);
        System.out.println("I am in constructor with Base value of c: "+c);
    }
}
public class cwh_46_inheritanceInConstructors {
    public static void main(String[] args) {
       Base1 ac = new Base1();
       Derived1 dc = new Derived1();
       Child1 bc = new Child1(3,2,3);
        Child1 sd = new Child1();
    }
}
