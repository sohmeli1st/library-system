import java.util.Objects;
import java.util.UUID;

public class Book implements Borrowable, Comparable<Book> {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed = false;
    private int publishYear;

    public Book(String title) {
        this(title, "belirtilmedi", UUID.randomUUID().toString());
    }

    public Book(String title, String author) {
        this(title, author, UUID.randomUUID().toString());
    }

    public Book(String title, String author, String isbn) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }


    @Override
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true; // isBorrowable yerine isBorrowed kullanıldı
        } else {
            throw new IllegalArgumentException("Uzgunuz, bu kitap zaten verildi...");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            throw new IllegalArgumentException("kitap zaten kutuphanede bulunuyor...");
        }
    }

    public int compareTo(Book other) {
        Integer.compare(this.publishYear, other.publishYear);
        return 0;
}
}