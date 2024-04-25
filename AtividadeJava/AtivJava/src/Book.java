public class Book extends Document{

    private Author author;

    public Book (Author author, int id, String title){
        super(id,title);
        this.author = author;
    }

    public Author getAuthor(){
        return author;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    
}
