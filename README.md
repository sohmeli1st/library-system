# 📚 Java Kütüphane Yönetim Sistemi (OOP Temelleri)

Bu proje, Java'da Nesne Yönelimli Programlama (OOP) temellerini öğrenmek ve pratik etmek amacıyla geliştirilmiş bir Kütüphane Yönetim Sistemi simülasyonudur.

## 🚀 Öğrenilen ve Uygulanan Teknolojiler
* **Dil:** Java
* **Versiyon Kontrolü:** Git & GitHub
* **Geliştirme Ortamı:** IntelliJ IDEA

## 🧠 Kavranan OOP Prensipleri
Hafta 1 boyunca adım adım şu konseptler kodlanarak uygulanmıştır:

1. **Encapsulation (Kapsülleme):** `private` değişkenler ve `getter/setter` metotları ile veri güvenliği. Validasyon kuralları ile hatalı veri girişinin (Örn: Boş isim) engellenmesi.
2. **Constructors (Yapıcı Metotlar):**
    * Nesne yaratılırken başlangıç durumlarının atanması.
    * **Constructor Overloading:** Farklı senaryolara göre nesne üretme esnekliği.
    * **Constructor Chaining (`this()`):** Kod tekrarını önlemek için yapıcı metotların birbirine bağlanması.
3. **Static vs Instance:** `Library` sınıfında sınıfa ait ortak sayaç (`static`) ile nesneye ait (`instance`) değişkenlerin mimari farkı.
4. **Gizli Miras (Object Class):** `toString()`, `equals()` ve `hashCode()` metotlarının ezilerek (override) referans (RAM) adresleri yerine içerik (Örn: ISBN numarası) kıyaslamasının yapılması.

## 📂 Sınıf Yapıları
* `Book`: Kitap nesnelerini temsil eder. Overloading, equals/hashCode ve toString içerir.
* `Member`: Kütüphane üyelerini temsil eder. Constructor içinde setter kullanılarak validasyon uygulanmıştır.
* `Library`: Kütüphaneyi temsil eder. Ortak (`static`) değişkenler ve metotlar ile kütüphane istatistiklerini tutar.
* `Main`: Tüm bu OOP konseptlerinin çalıştırılıp test edildiği ana sınıftır.