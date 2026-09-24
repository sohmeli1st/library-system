import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book kitap_A = new Book("Kitap-A", "Zehra", "864358");
        Book kitap_A1 = new Book("Kitap-A1", "Hasim", "864358");
        Book kitap_A2 = new Book("Kitap-A2", "Metin", "864358");
        Book kitap_B = new Book("Kitap-B", "Buse", "785120");
        try {
            Library library = new Library();
            library.addBook(kitap_A);
            library.addBook(kitap_A1);
            library.addBook(kitap_A2);
            library.addBook(kitap_B);
            System.out.println(library.getSortedAuthors());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}