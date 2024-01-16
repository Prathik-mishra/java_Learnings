abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Changing the Refill...");
    }
    void nib(){
        System.out.println("nib...");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class cwh_60_practiceSet {
    public static void main(String[] args) {
//        //problem1 + problem2:-
        FountainPen p = new FountainPen();
        p.nib();
        p.refill();
        p.write();

//        //problem3:-
        Human h = new Human();
        h.eat();
        h.bite();
        h.sleep();
        h.jump();

        Monkey m = new Human();
//        m.sleep();  ------> this throws an error                   //cause monkeys Class does not have sleep fun
        m.jump();
        m.bite();

        BasicAnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();
//        lovish.bite();  ------> this throws an error                   //cause lovish does not have bite fun in BasicAnimal i.e., its is Polymorphism.
    }
}
