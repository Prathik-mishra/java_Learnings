import java.security.spec.RSAOtherPrimeInfo;

interface Bicycle{                                              //interface cannot be invoked by making a bicycle obj
    int a = 23;                                                 //in this the value initialised is final it cannot be modified further
    void decreaseSpeed(int decrement);                          //these are method which are empty
    void increaseSpeed(int increment);
}
//class FusionCycle implements Bicycle extends example class             //we can even abstract the class with interface
class FusionCycle implements Bicycle{
    public void decreaseSpeed(int decrement){                                               //here the methods access-modifiers must be public
        System.out.println("the speed of fusion cycle is decreased");                       //these interface-methods must be implemented in the program
    }
    public void increaseSpeed(int increment){
        System.out.println("the speed of fusion cycle is increased");
    }

}
public class cwh_55_interfaces {
    public static void main(String[] args) {
        FusionCycle pm = new FusionCycle();
        pm.decreaseSpeed(3);


    }
}
