import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Pushkin", "Alexander");
        Author author2 = new Author("Lermontov", "Mikhail");
        Book book1 = new Book("TheTaleOfTheGoldenCockerel", author1, 1834);
        Book book2 = new Book("Borodino", author2, 1837);
        System.out.println(book1);
        System.out.println(book2);
        book2.setPublicationYear(1999);
        System.out.println(book2);
    }
}