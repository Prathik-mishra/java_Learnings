interface class11{
    void meth1();
    void meth2();
}
interface class12 extends class11{
    void meth3();
    void meth4();
}
class Cla implements class12{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public  void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class cwh_58_inheritance_in_interface {
    public static void main(String[] args) {
         Cla c = new Cla();
         c.meth1();
         c.meth2();
         c.meth3();
         c.meth4();
    }
}
