import java.util.*;

public class Main {
    public static void main(String[] args) {

        Library L1 = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== ŞÖHMELİOĞLU KÜTÜPHANESİNE HOŞ GELDİNİZ ===\n" +
                    "1- Yeni Kitap Ekle\n" +
                    "2- Tüm Kitapları Listele (Savunmacı Liste)\n" +
                    "3- ISBN ile Kitap Bul (Hızlı Arama - HashMap)\n" +
                    "4- Kitapları İsme Göre Sıralı Listele (Comparator)\n" +
                    "5- Yazarları Alfabetik Listele (TreeSet)\n" +
                    "0- Çıkış\n" +
                    "Seçiminiz: _");
            int number;
            number = sc.nextInt();
            if(number == 1){
                System.out.println("Sirasi ile kitap ad - yazar - isbn - yılını gir : ");
                String ad = sc.next();
                String yazar = sc.next();
                String isbn = sc.next();
                int yil = sc.nextInt();
                Book yeniKitap = new Book(ad, yazar, isbn, yil);
                System.out.println("Kitap Eklendi : " + yeniKitap.toString());
                L1.addBook(yeniKitap);
            } else if(number == 2){
                L1.getAllBooks();
            } else if(number == 3){
                System.out.println("Aranacak isbn : ");
                String isbn = sc.next();
                System.out.println(L1.findBookByIsbn(isbn));
            } else if(number == 4){
                System.out.println(L1.getBookSortedByTitle());
            }
            else if(number == 5){
                System.out.println(L1.getSortedAuthors());
            } else {
                return;
            }
        }

    }
}