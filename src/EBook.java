public class EBook extends Book {
    private int fileSize;
    private String format;
    public EBook(String title, String author, String isbn, int fileSize, String format){
        super(title, author, isbn);
        setFileSize(fileSize);
        setFormat(format);
    }

    public void setFileSize(int fileSize){
        this.fileSize = fileSize;
    }

    public void  setFormat(String format){
        this.format = format;
    }

    public int getFileSize(){
        return this.fileSize;
    }
    public String getFormat(){
        return this.format;
    }

    @Override
    public String toString() {
        return super.toString() + "EBook{" +
                "fileSize=" + fileSize +
                ", format='" + format + '\'' +
                '}';
    }
}
