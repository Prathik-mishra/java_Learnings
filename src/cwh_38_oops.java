class Employeee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is:" +id);
        System.out.println("My name is:" +name);
        System.out.println("My salary is:" +salary);
    }
    public int getSalary(){
        return salary;
    }
}
public class cwh_38_oops {
    public static void main(String[] args) {
        System.out.println("this is custom details");
            Employeee harry = new Employeee();
            Employeee babu = new Employeee();

            harry.id=12;
            harry.name="COdewithharry";
            harry.salary=17000;

            babu.id=15;
            babu.name="COdewithbabu";
            babu.salary=18000;

            babu.printDetails();
            harry.printDetails();

            System.out.println(harry.salary);
    }
}
