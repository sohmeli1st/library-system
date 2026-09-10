public class PrintedBook extends Book{
    private int pageCount;

    public PrintedBook(String title, String author, String isbn, int pageCount){
        super(title, author, isbn);
        setPageCount(pageCount);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return super.toString() + "PrintedBook{" +
                "pageCount=" + pageCount +
                '}';
    }
}
