import yatzagazig.Book;
import yatzagazig.Tshirt;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Book book1 = new Book();
     Book book2 = new Book();
//     book1.title = "Fundemetals of database system" ;
//     book1.author ="Elamsri";
//     book2.title ="Clean Code Architecture" ;
//     book2.author ="James Bond" ;
//     book1.page= 2000;
//     book2.page =1000;
//     book1.saveBook("Fundemetals of database system","Elamsri",2000);
//     book2.saveBook("Clean Code Architecture","James Bond",1000);
//   System.out.println("Book 1 title: " + book1.title +"      "+"Book 1 author: " + book1.author + "Book 1 page: " + book1.page );
//     System.out.println("Book2 title: " + book2.title +"      "+"Book 2 author: " + book2.author );
     book1.title="al ayam";
     book2.title="Fundmentals";
     book1=book2;
     book1.showBook();
     book2.showBook();



     Tshirt tshirt1 = new Tshirt();
     Tshirt tshirt2 = new Tshirt();

     tshirt1.saveTshirt("Blue", "Large", "LC", "casual");
     tshirt2.saveTshirt("Red", "Medium", "Nike", "sport");

     tshirt1.showTshirt();
     tshirt2.showTshirt();



    }
}
