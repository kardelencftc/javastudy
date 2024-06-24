package org.example;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj); // Sonuç: Bu

        int sayi = topla(5, 7);
        System.out.println(sayi); // Sonuç: 12

        int toplam = topla2(2, 3, 4, 5, 6, 10); // Doğru parametre geçişi
        System.out.println(toplam); // Çoklu toplama sonucu

        // Diğer metodları çağırma
        ekle();
        sil();
        güncelle();

        // 'sehirVer' metodu çağrısı
        String sehir = sehirVer();
        System.out.println(sehir); // Beklenen sonuç: Ankara
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2; // Doğru toplama işlemi
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam; // Toplam sonucu döndür
    }

    public static String sehirVer() {
        return "Ankara"; // Geri dönüş değeri eklenmeli
    }
}
