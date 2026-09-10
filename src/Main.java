public class Main {
    public static void main(String[] args) {
        Book kitap1 = new Book("Dune", "Frank Herbert", "12345");
        Book kitap2 = new Book("Dune - Özel Basım", "Frank Herbert", "12345");
        Book kitap3 = new Book("Yüzüklerin Efendisi", "J.R.R. Tolkien", "98765");
        System.out.println(kitap1);
        System.out.println(kitap2);
        System.out.println(kitap3 + "\n");

        System.out.println("--------------------\n");
        System.out.println("Kitap1 == kitap 2 mi? = " + kitap1.equals(kitap2));
        System.out.println("Kitap1 == kitap 2 mi? = " + kitap2.equals(kitap2));

        EBook E1 = new EBook("Kırmızı Araba","Ali A.","486479",12,"pb");
        PrintedBook E2 = new PrintedBook("100 Yıl","Ricardo Q","987621",12);
        E1.getBookName();

        System.out.println(E1);
        System.out.println(E2);


    }
}
