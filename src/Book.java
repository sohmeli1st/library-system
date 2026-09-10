import java.util.Objects;

public class Book {
        private String title;
        private String author;
        private String isbn;

        public Book(String title){
            this(title, "belirtilmedi", "belirtilmedi");
        }

        public Book(String title, String author){
            this(title, author, "belirtilmedi");
        }

        public Book(String title, String author, String isbn){
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public String getTitle(){
            return this.title;
        }

        public void setAuthor(String author){
            this.author = author;
        }

        public String getAuthor(){
            return this.author;
        }

        public void setIsbn(String isbn){
            this.isbn = isbn;
        }

        public String getIsbn(){
            return this.isbn;
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
    
    public void getBookName(){
        System.out.println("Kitap adı : " + this.title + "\n");
    }
}
