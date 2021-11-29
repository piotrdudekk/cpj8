public class Ebook extends Book
{
    private String fileName;
    
    public Ebook(String title, String author, String fileName){
        super(title, author);
        this.fileName=fileName;
    }
    
    public String getFileName(){
        return fileName;
    }
    
    public void setFileName(String fileName){
        this.fileName=fileName;
    }
    
    public void display(){
        System.out.println("Tytul: "+super.getTitle()+", Autor: "+super.getAuthor()+", Nazwa pliku: "+fileName);
    }
    
    public static void main(String[] args){
        Book book2 = new Book("Hobbit","JRR Tolkien");
        book2.display();
        Ebook eb1 = new Ebook("America", "Christopher A.", "america.epub");
        eb1.display();
    }
    
}
