import java.util.Arrays;
import java.util.Scanner;

public class ipa_exam1 {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    Author[]at=new Author[a];
    Book[]bt=new Book[a];
    for(int i=0;i<at.length;i++)
    {
       int a1=sc.nextInt();sc.nextLine();
       String a2=sc.nextLine(); 
       int a3=sc.nextInt();sc.nextLine();
       String a4=sc.nextLine();
       String a5=sc.nextLine();
       double a6=sc.nextDouble();sc.nextLine();
       at[i]=new Author(a1, a2);
       bt[i]=new Book(a3,a4,a5,a6,at[i]);
    }
    String tg=sc.nextLine();
    String tf=sc.nextLine();
    double tx=sc.nextDouble();

    Book[]ans=getBooksBelongingToAGenre(bt,tg);

    if(ans!=null)
    {
        for(int i=0;i<ans.length;i++)
        {
            System.out.println("AuthorName: "+ans[i].getAuthor().getAuthorName()+", "+"Title: "+ans[i].getTitle());
        }
    }
    else{
        System.out.println("Genre is not available in the list");
    }
    Book[]ans2=calculateDiscountedPrice(bt,tf,tx);
    System.out.println("Discounted "+tf+ "Books:");
    if(ans2!=null)
    {
        for(int i=0;i<ans2.length;i++)
        {
            System.out.println("AuthorName: "+ans2[i].getAuthor().getAuthorName()+", "+"Ttitle: "+ans2[i].getTitle()+", "+"UpdatedPrice: "+ans2[i].getPrice());
        }
    }
}
public static Book[] getBooksBelongingToAGenre(Book[] bt1,String tg1)
{
    Book[] bx=new Book[0];
    for(int i=0;i<bt1.length;i++)
    {
        if(bt1[i].getGenre().equalsIgnoreCase(tg1))
        {
            bx=Arrays.copyOf(bx, bx.length+1);
            bx[bx.length-1]=bt1[i];
        }
    }
    if(bx.length>0)
    {
        return bx;
    }
    else{
        return null;
    }

}
public static Book[] calculateDiscountedPrice(Book[]bt2,String tf1,double tx)
{
   Book[] bt3 =new Book[0];
   for(int i=0;i<bt2.length;i++)
   {
    if(bt2[i].getGenre().equalsIgnoreCase(tf1))
    {
        bt3=Arrays.copyOf(bt3, bt3.length+1);
        bt3[bt3.length-1]=bt2[i];
    }
   }
   for(int i=0;i<bt3.length;i++)
   {
     double DiscountedPrice=bt3[i].getPrice()-(bt3[i].getPrice()*(tx/100));
     bt3[i].setPrice(DiscountedPrice);
   }
   if(bt3.length>0)
   {
    return bt3;
   }
   else{
    return null;
   }
}
}

class Author {
    private int authorId;
    private String authorName;

    public Author(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}

class Book {
    private int bookId;
    private String title;
    private String genre;
    private double price;
    private Author author;

    public Book(int bookId,String title, String genre,double price, Author author)
    {
        this.author=author;
        this.bookId=bookId;
        this.title=title;
        this.genre=genre;
        this.price=price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    

}

