class A {
    int a;

    public int Harry() {
        return 4;
    }
        public void Meth2 () {                                                      //here we can name method name same in different class
            System.out.println("KYA bolti public class A ki meth 2 me");            //that is called as method-overriding.
        }
}
class B{
    int b;
    public void Meth2(){
        System.out.println("KYA bolti public class B ki meth 2 me");
    }
    public void Meth3(){
        System.out.println("KYA bolti public class B ki meth 3 me");
    }

}
public class cwh_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.Meth2();
        B b = new B();
        b.Meth2();

    }
}
