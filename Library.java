import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books;
    
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        
        Book b1 = new Book("Harry Potter", "JKR");
        books.add(b1);
        
        Ebook eb1 = new Ebook("Cosy Cat", "Julia K", "cosy_cat.epub");
        books.add(eb1);
        Ebook eb2 = new Ebook("Cosy Dog", "Amelia K", "cosy_dog.epub");
        books.add(eb2);
        
        Audiobook ab1 = new Audiobook("How to read faster", "John M.", 180, 55);
        books.add(ab1);
        Audiobook ab2 = new Audiobook("How to speak louder", "John M.", 180, 55);
        books.add(ab2);
        
        for (Book book : books) {
            System.out.println("\n____________________");
            book.display();
            System.out.println("____________________");
            
        }
    }
}