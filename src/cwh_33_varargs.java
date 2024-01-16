public class cwh_33_varargs {
//    static int sum(int x){
//        return x;
//    }
//    static int sum(int x,int y){
//        return x+y;
//    }
//    static int sum(int x, int y, int z){
//        return x+y+z;
//    }
//    static int sum(int x,int y,int z, int o){
//        return x+y+z+o;
//    }
//    static int sum(int ...arr){                                                 //this is a method for "varargs"
//        int result=0;
//        for(int i: arr){
//            result=result+i;
//        }
//        return result;
//    }
    static int sum(int x,int ...arr){                                               // now i have made an int x which means i cannot leave any argument blank
        int result=0;
        for(int i: arr){
            result=result+i;
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println("The sum of a is:" +sum(3));                                 //this is for normal way of addition of  variables
//        System.out.println("The sum of a + b is:" +sum(3,2));
//        System.out.println("The sum of a + b + c is:" +sum(3,2,3));
//        System.out.println("The sum of a + b + c + d is:" +sum(3,2,34,4));
        System.out.println("The sum of int nothing in arr is:" +sum(2,3,3,3));                     //if the argument here is nothing then it will take an empty array as input and return sum as zero(o)


    }
}
