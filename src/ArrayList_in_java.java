import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_in_java {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for adding elements in an arraylist: "(add) fun is used"
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);

        // for getting the element in an arraylist: "(get) fun is used in which the index of the element is passed"
        int c = list.get(3);                   //first way to print an element
        System.out.println(c);                //
        System.out.println(list.get(2));      //second way to print an element

        //to add element in an arraylist get fun is used with 2
        list.add(1,1);            // this will add the element in between of the list
        System.out.println(list);

        //to delete/remove an element in an arraylist: "(remove) fun is used "
        list.remove(3);
        System.out.println(list);

        //to change/set an element in an arraylist: "(set) fun is used"
        list.set(0,5);
        System.out.println(list);

        //to know the size of an arrayList: "(size) fun is used
        int size = list.size();
        System.out.println(size);

        //for itterating in the arraylist:
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // to sort an arraylist a fun is used: Collection an inbuilt class in java
        Collections.sort(list);
        System.out.println(list);

    }
}
