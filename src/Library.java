public class Library {
    private static int bookCount = 0;
    public void addBook(){
        bookCount++;
    }

    public static  int getBookCount(){
        return bookCount;
    }
}
