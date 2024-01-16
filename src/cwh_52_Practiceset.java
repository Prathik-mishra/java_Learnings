class Circle{
    int radius;
    Circle(int r){
        System.out.println("I am in Constructor Circle");
        this.radius= r;
    }
    public double Area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder2 extends Circle{
    int height;
    Cylinder2(int r,int h){
        super(r);
        System.out.println("I am in Constructor Cylinder");
        this.height = h;
    }
    public double volume(){
        return Math.PI * this.radius * this.radius*this.height;
    }
}
public class cwh_52_Practiceset {
    public static void main(String[] args) {
        //Program1
        Circle C = new Circle(3);
//        Cylinder2 CL = new Cylinder2(2,3);
//        double vol = CL.volume();
//        System.out.println(vol);
        double A = C.Area();
        System.out.println(A);
    }
}
