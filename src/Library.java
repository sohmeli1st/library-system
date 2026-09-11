import java.util.ArrayList;

public class Library {

    private static int bookCount = 0;
    // HATA DÜZELTİLDİ: Liste hafızada oluşturuldu
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        bookCount++;
    }

    // HATA DÜZELTİLDİ: Parantezler eklendi
    public void showAllBooks() {
        System.out.println("\n--- Kütüphane Listesi ---");
        for(int i = 0; i < books.size(); i++){
            System.out.println("Kitap Bilgileri : " + books.get(i));
        }
        // Döngünün dışında yazdırmak çıktıyı daha temiz yapar
        System.out.println("Toplam Kitap Sayısı : " + getBookCount());
    }

    public static int getBookCount(){
        return bookCount;
    }
}