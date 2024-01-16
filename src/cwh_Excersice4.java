import java.util.Scanner;
class Library{
    String[] books;
    int no_of_books;
    String book;
    Library(){
        this.books = new String[100];
        this.no_of_books=0;

    }
//    void addBooks(){                                          //use this fun to add books directly in code use this fun
//        this.books[no_of_books]= book;
//        no_of_books++;
//        System.out.println(book+ "......has been added.");
//    }
    void addBooks(){                                           //for  adding books using console(User) use this fun
        Scanner sc = new Scanner(System.in);
        book=sc.nextLine();
        this.books[no_of_books]= book;
        no_of_books++;
        System.out.println(book+ "......has been added.");
    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("The available books are: " +book);
        }

    }
    void issueBook(){
        System.out.println("Enter the book to be issue: ");
        Scanner sc = new Scanner(System.in);
        book=sc.nextLine();
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println(book+ "...... has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exists");
    }
    void returnBook(){
        System.out.println("Enter the book to be Return: ");
        addBooks();
    }

}
public class cwh_Excersice4 {
    public static void main(String[] args) {
       Library Lib = new Library();
//        Lib.addBooks("Think and grow Rich");                              // TO add books form here use this arguments to call the functian
//        Lib.addBooks("Hacker Banne Ki Ninja Technique");
//        Lib.addBooks("Algorithms");
//        Lib.addBooks("C++");
        Lib.addBooks();
        Lib.addBooks();
        Lib.addBooks();
        Lib.addBooks();
        Lib.showAvailableBooks();
        Lib.issueBook();
        Lib.showAvailableBooks();
        Lib.returnBook();
        Lib.showAvailableBooks();
    }
}
