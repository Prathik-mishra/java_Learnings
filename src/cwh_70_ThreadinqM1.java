class Thread1 extends Thread {                            //extending class with "thread class"
    public void run() {
        int i = 0;
        while(true) {                                               //Infinite loop
            System.out.println("Hacker Bolte Chadi kholte");
            System.out.println("1111");
            i++;
        }
    }
}
    class Thread2 extends Thread{
        public void run(){
            int i = 0;
            while(true){
                System.out.println("Hacker Bolte panti kholte");
                System.out.println("2222");
                i++;
            }
        }
    }
public class cwh_70_ThreadinqM1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();                                           //To start a threading operation we must use "start()" --> funcX
        t2.start();

    }
}
