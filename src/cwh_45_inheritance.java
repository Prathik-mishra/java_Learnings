class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{                     //here this class consists everything of Base class due ro use of inheritance
    int y;                                      //inheritance can be invoked by "extends" keyword

    public int getY() {                         //accessing of element(properties) depends on the access-modifiers
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(9);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(8);
        System.out.println(d.getX());
        d.setY(15);
        System.out.println(d.getY());
    }
}
