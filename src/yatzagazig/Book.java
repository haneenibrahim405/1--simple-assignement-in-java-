package yatzagazig;

public class Book {
    public String title;
    public String author;
    public int page;
    // attributes
    String publisherName;
    String coverURL;
    int publishYear;
    int [] pageArr;


    public void saveBook(String title, String author, int page)
    {
       this.title = title;
       this.author = author;
       this.page = page;

    }
    public void showBook()
    {
       String bookData ="Title :"+ this.title + "\n" +"Author :"+ this.author + "\n" +"Page :"+ this.page+
               "\n"+"publisherName :"+ this.publisherName + "\n" +"PublishYear :"+ this.publishYear;
       System.out.println(bookData);
    }
    public void deleteBook ()
    {

    }
}
