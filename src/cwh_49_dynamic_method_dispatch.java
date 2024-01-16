

class Phone{
    public void On(){
        System.out.println("the phone is on");
    }
    public void call(){
        System.out.println("calling rinku");
    }

}
class SmartPhone extends Phone{
    public void On(){
        System.out.println("the smartphone is on");
    }
    public void Music(){
        System.out.println("playing music");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
           Phone obj = new SmartPhone();                //we can reffer superclass to an subclass but cannot do its viceversa
//         SmartPhone obj1 = new Phone();       //this will throw an error
        obj.On();
//        obj.Music();                             // this will throw an error because we cannot call an non-exesting method in superclass
       // obj.Call();
    }
}
