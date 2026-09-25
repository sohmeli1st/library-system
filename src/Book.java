import java.util.Objects;
import java.util.UUID;

public class Book implements Borrowable, Comparable<Book> {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed = false;
    private int publishYear;

    public Book(String title) {
        this(title, "belirtilmedi", UUID.randomUUID().toString(), 0);
    }

    public Book(String title, String author) {
        this(title, author, UUID.randomUUID().toString(), 0);
    }

    public Book(String title, String author, String isbn, int publishYear) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPublishYear(publishYear);
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
                ", publishYear=" + publishYear +
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
        return Integer.compare(this.publishYear, other.publishYear);
}
}