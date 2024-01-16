class Cylinder{
    private int height;
    private int radius;

    public Cylinder(int height, int radius) {                           // use "ALT+Insert" to make constructors and (getters and Setters)
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }
    public double volumeOfClyinder(){
        return 2 * 3.142 * radius * height + 2 * 3.142 * radius * radius;
    }
    public double surfaceAreaOfClyinder(){
        return  3.142 *  height  * radius * radius;                             //we can use Math.PI for more accurate value
    }
}
class Rec {
    private int height;
    private int breadth;

    public Rec(int height, int breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class cwh_44_psgetterssetters {
    public static void main(String[] args) {
            //problem1:
            Cylinder MyCylinder = new Cylinder(9, 12);                   //for constructors the arguments are passed
            MyCylinder.setRadius(12);
            MyCylinder.setHeight(9);
            System.out.println(MyCylinder.getHeight());
            System.out.println(MyCylinder.getRadius());

            //problem2:
            System.out.println(MyCylinder.volumeOfClyinder());
            System.out.println(MyCylinder.surfaceAreaOfClyinder());

            //problem3:
//        Cylinder MyCylinder = new Cylinder(9,12);

            //problem4:
            Rec r = new Rec(9,10);
            System.out.println(r.getHeight());
            System.out.println(r.getBreadth());
    }
}

