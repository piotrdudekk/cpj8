
public class Book
{
    private static String title;
    private static String author;
    
   public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    
    public static String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public static String getAuthor(){
        return author;
    }
    
    public void setAuthor(String gauthor){
        this.author=author;
    }
    
    public void display(){
        System.out.println("Tytul: "+title+", Autor: "+author);
    }
    
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter","JK Rowling");
        book1.display();
    }
    
}
