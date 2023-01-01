package CloneTest;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Book book1 = new Book("War and Peace", "Leo Tolstoy");
        Book book2 = book1.clone();
        book2.setAuthor("Ivan Turgenev");
        System.out.println(book1.getAuthor());

    }

}
