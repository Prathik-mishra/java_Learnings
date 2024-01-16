import java.sql.SQLOutput;

class Hackathon{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setId(int x){
        id = x;
    }
    public String getName(){
        return name;
    }
    public void setName(String b){
        name = b;
    }

}
public class cwh_40_accessModifiers {
    public static void main(String[] args) {

        Hackathon HC = new Hackathon();
//        HC.getname = "prathik"                                    //This throws an error
//        HC.getId = 325



        HC.setId(325);
        System.out.println(HC.getId());
        HC.setName("Prathik Mishra");
        System.out.println(HC.getName());

    }
}
