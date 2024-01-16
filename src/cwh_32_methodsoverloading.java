public class cwh_32_methodsoverloading {
    static void muu(){                                              //int this the name of the function can be repeated
        System.out.println("hello mama kyse hy kaama");             //for more than one time but the parameters should be
    }                                                               //changed for example like this given beside
    static void muu(int a){                                         //here in brackets we give parameters
        System.out.println("hello mama kyse hy kaama " +a);         //void is used for non-int return type value
    }
    static void muu(int a,int  b){
        System.out.println("hello mama kyse hy kaama " +a);
        System.out.println("hello mama kyse hy kaama " +b);
    }
    static int integer(int a){
        a=98;
        return(a);
    }
    static int integer1(int [] array){
        array[0]=0;
        return(array[0]);
    }
    public static void main(String[] args) {
        muu();                                                     //here in brackets we give arguments
        muu(3000);                                              //"arguments are actual"
        muu(4000,5000);
        //Case1: for changing an integer
        int x = 45;
        integer(x);
        System.out.println("The value of x after changing is:" +x);     //the int value will not change because it just copies x value

        //Case2: for changing an element in an array
        int [] array = {45,65,4534,45,65,63,4,554};
        integer1(array);
        System.out.println("The value of x after changing is:" +array[0]);  //Here the change of 1st element will take place because it copy the address of array but not its element i.e. there is change in element
    }
}
