package org.example;

public class Main {
    public static void main(String[] args) {
        // BaseKrediManager'dan türetilmiş veya BaseKrediManager arayüzünü uygulamış sınıfların örneklerini oluşturun
        BaseKrediManager[] krediManagers = new BaseKrediManager[] {
                new OgretmenKrediManager(), // Örnek 1: OgretmenKrediManager sınıfı
                new TarimKrediManager(),    // Örnek 2: TarimKrediManager sınıfı
                new OgretmenKrediManager()  // Örnek 3: Bir kez daha OgretmenKrediManager sınıfı
        };

        double tutar = 1000; // Kredi tutarını belirleyin (örneğin 1000 TL)

        // krediManagers dizisi üzerinde dönerek her bir kredi yöneticisinin hesapla metodunu çağırın
        for (BaseKrediManager krediManager : krediManagers) {
            double hesaplananTutar = krediManager.hesapla(tutar); // Hesapla metodunu çağırarak tutarı geçirin
            System.out.println("Kredi tutarı: " + tutar + ", Hesaplanan tutar: " + hesaplananTutar);
        }
    }
}
