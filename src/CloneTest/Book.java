package CloneTest;

public class Book implements Cloneable {

    private String name;
    private Author author;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author.getName();
    }
    public void setAuthor(String author){
        this.author.setName(author);
    }

    public Book(String name, String author){
        this.name = name;
        this.author = new Author(author);
    }

    public String toString(){
        return "Книга '" + name + "' (автор " + author + ")";
    }

    public Book clone() throws CloneNotSupportedException{
        Book mBook = (Book) super.clone();
        mBook.author = author.clone();
        return mBook;
    }

}
