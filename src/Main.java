import java.util.Arrays;

public class Main {
    private static Book[] books = new Book[5];
    public static void main(String[] args) {
        Author author1 = new Author("Pushkin", "Alexander");
        Author author2 = new Author("Lermontov", "Mikhail");
        Book book1 = new Book("The Tale Of The Golden Cockerel", author1, 1834);
        Book book2 = new Book("Borodino", author2, 1837);
        Book book5 = new Book("The Tale Of The Golden Cockerel", author1, 1900);
        Book book3 = new Book("dakdnkajd", author1, 19);
        Book book4 = new Book("Borodino", author2, 1837);
        Book book6 = new Book("Borodino", author2, 1837);



        System.out.println(book1);
        System.out.println(book2);
        book2.setPublicationYear(1999);
        System.out.println(book2);

        books[0] = book1;
        books[1] = book2;
        Main.addBook(book5);
        Main.addBook(book2);
       printBook();


        //System.out.println(Arrays.toString(books));

       // System.out.println(book1.equals(book5));


    }

    public static void addBook(Book book) {
        boolean a = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] =book;
                a = true;
                break;
            }
        }
        if (!a){
            System.out.println("Больше хранить книги негде...");
        }
    }
    public static void printBook(){
        for (Book bookk: books){
            if (bookk!=null){
        System.out.printf("%s", bookk);

            }
        }
    }

}