public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, String author, int minutes, int seconds){
        super(title, author);
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public void setSeconds(int seconds){
        this.seconds=seconds;
    }
    
    public void display(){
        System.out.println("Tytul: "+super.getTitle()+", Autor: "+super.getAuthor()+", Dlugosc: minuty: "+minutes+", sekundy: "+seconds);
    }
    
    public static void main(String[] args){
        Book book3 = new Book("Harry Potter","JK Rowling");
        book3.display();
        Audiobook ab1 = new Audiobook("How to speak louder", "John M.", 21, 13);
        Book book4 = new Ebook("America", "Christopher A.", "america.epub");
        book4.display();
    }
    
}
