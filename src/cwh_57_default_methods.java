interface Camera{                                                               //First interface
    void takeSNap();
    void recordVideo();
//    private void Greet(){
//        System.out.println("Good morning");
//   }
    default void record4KVideo(){                                               //making it default means we can access it directly or can use and modify it in main class
        System.out.println("Recording video in 4K...by default");
    }
}
interface MobileNetwork{                                                       //Second Interface
    String[] networks();
//  void getNetwork(String network);
//  void getNetwork();
}
class MyPhone{                                                              //creating an superclass(Base) for derive class

    void Call(int number){
        System.out.println("calling " +number);
    }
    void acceptCall(int number){
        System.out.println("accepting " +number);
    }
}
class MySmartPhone extends MyPhone implements MobileNetwork,Camera{
    public void takeSNap(){
        System.out.println("Taking snaps...");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public String[] networks(){
        System.out.println("Getting network Lists");
        String[] networks= {"Prathik","Vijay","Sahafath"};
        return networks;

//    public void getNetwork(String network){
//            System.out.println("Connecting to:" +network);
//        }
//    public void getNetwork(){
//            System.out.println("getting networks");
//        }
//        public void record4KVideo(){
//            System.out.println("Recording video in 4K...by default in new class");
//        }
    }

}
public class cwh_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();                       //Creating object
        ms.recordVideo();
        ms.record4KVideo();
        ms.Call(939070);
        ms.acceptCall(939070);
        String[] ar = ms.networks();
        for (String item:ar) {                                        //foreach loop for accessing the elements in String array.
            System.out.println(item);
        }
    }
}
