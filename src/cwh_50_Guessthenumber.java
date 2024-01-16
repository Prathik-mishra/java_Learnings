import java.util.Random;
import java.util.Scanner;
class Game{
    int number;
    int numberofguesses=0;
    int num;

    public int getNumberofguesses() {                           //getter for numberofguesses
        return numberofguesses;
    }

    public void setNumberofguesses(int numberofguesses) {        //setter for numberofguesses
        this.numberofguesses = numberofguesses;
    }

    void guessTheNum() {                                        //method for guessing the number
        System.out.println("Guess The Number");
        Scanner sc = new Scanner(System.in);
        this.number = sc.nextInt();

    }
    Game(){                                                     //Constructor for game
        Random rand = new Random();
         this.num = rand.nextInt(100);
    }
    boolean isCorrectNumber(){
        numberofguesses++;                                                 //numberofguesses will increment if it is false
        if(num==number){
            System.out.format("You guessed it right its was %d in %d attempts",num,numberofguesses);
        }else if(num<number){
            System.out.println("gussed number is too high");
        }else {
            System.out.println("gussed number is too low");
        }
        return false;
    }
}
public class cwh_50_Guessthenumber {
    public static void main(String[] args) {
        Game g = new Game();                                     //creating  a new object game
        boolean b= false;
        while(!b) {
            g.guessTheNum();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
