import java.util.*;


public class Library {
    List<Book> books = new ArrayList<Book>();
    private Map<String, Book> bookMap = new HashMap<String, Book>();

    public void addBook(Book b) {

        books.add(b);
        bookMap.put(b.getIsbn(), b);
    }

    public void removeBooksByAuthor(String author) {
        books.removeIf(b -> b.getAuthor().equals(author));
    }

    public List<Book> getAllBooks() {
        return List.copyOf(books);
    }

    public Set<Book> getUniqueBooksCatalog(){
        Set<Book> uniqueBooks = new HashSet<>(books);
        // uniqueBooks.addAll(books);
        return uniqueBooks;
    }

    public Book findBookByIsbn(String isbn){
        return bookMap.get(isbn);
    }

    public Set<String> getSortedAuthors(){
        Set<String> sortedAuthors = new TreeSet<>();
        for(Book b : books){
            sortedAuthors.add(b.getAuthor());
        }
        return sortedAuthors;
    }

    public List<Book> getBookSortedByTitle() {
        List.copyOf(books);
    }
}
