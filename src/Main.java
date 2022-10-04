import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Pushkin", "Alexander");
        Author author2 = new Author("Lermontov", "Mikhail");
        Book book1 = new Book("The Tale Of The Golden Cockerel", author1, 1834);
        Book book2 = new Book("Borodino", author2, 1837);
        Book book5 = new Book("The Tale Of The Golden Cockerel", author1, 1900);
        System.out.println(book1);
        System.out.println(book2);
        book2.setPublicationYear(1999);
        System.out.println(book2);

        Book[] books = new Book[7];
        books[0] = book1;
        books[1] = book2;
        Main.addBook(books);
        Main.addBook(books);
        Main.addBook(books);
        Main.addBook(books);
        Main.addBook(books);
        Main.addBook(books);

        System.out.println(Arrays.toString(books));

        System.out.println(book1.equals(book5));


    }

    public static void addBook(Book[]books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = createBook();
                break;
            }
        }

    }

    public static Book createBook() {
        Author author5 = new Author("lkmkl", "njkkl");
        Book book3 = new Book("asnkdjkjasdn", author5, 1923);
        return book3;
    }
}