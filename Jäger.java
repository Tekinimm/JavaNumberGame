import java.util.Random;   // Rastgele sayı üretmek için Random sınıfını ekledik
import java.util.Scanner;  // Kullanıcıdan veri almak için Scanner sınıfını ekledik

public class Jäger { 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Kullanıcı girişini okumak için Scanner nesnesi oluşturduk
        Random random = new Random();             // Rastgele sayı üretmek için Random nesnesi oluşturduk

        while (true) {  // Bu dış döngü, oyunu tekrar başlatmak için kullanılıyor

            int dogruSayi = random.nextInt(11);  
            // 0 ile 10 arasında rastgele bir sayı oluşturur (11 dahil değil)

            System.out.println("Pozitif bir sayi dusundum. Bakalim tahmin edebilecek misin? (Evet/Hayir)");
            String cevap = scanner.nextLine();  
            // Kullanıcının cevabını alır ("Evet" ya da "Hayir" gibi)

            // Kullanıcı "Hayir" derse oyun başlamadan biter
            if (cevap.equalsIgnoreCase("Hayir")) {  
                System.out.println("Oyun baslamadan bitti...");
                break; // while(true)'den çıkar → program sona erer
            }

            // Kullanıcı "Evet" derse tahmin oyununa geçilir
            else if (cevap.equalsIgnoreCase("Evet")) {  
                System.out.println("Oyleyse oyun baslasin! Haydi tahmin et.");

                int denemeSayaci = 0;      // Kullanıcının kaç deneme yaptığını tutar
                int tahmin = -1;           // Tahmin değişkeni (ilk değeri -1, çünkü 0–10 arasında olamaz)

                // Tahmin döngüsü — doğru sayı bulunana kadar devam eder
                while (tahmin != dogruSayi) {
                    System.out.print("Tahminini gir: ");
                    tahmin = scanner.nextInt();   // Kullanıcıdan sayı tahmini alınır
                    scanner.nextLine();           // Enter tuşu sonrası buffer'ı temizlemek için

                    denemeSayaci++;               // Her girişte sayaç artar

                    if (tahmin == dogruSayi) {   // Kullanıcı doğru tahmin ettiyse
                        System.out.println("Dogru tahmin! Toplam " + denemeSayaci + " denemede bildin.");
                        break;                    // Bu iç döngüden çıkar (oyun bitti)
                    } 
                    else if (tahmin < dogruSayi) {  
                        System.out.println("Daha buyuk bir sayi dene!");
                    } 
                    else {
                        System.out.println("Daha kucuk bir sayi dene!");
                    }
                }

                // Oyun bitince tekrar oynama seçeneği
                System.out.println("Tekrar oynamak ister misin? (Evet/Hayir)");
                String tekrar = scanner.nextLine();

                if (tekrar.equalsIgnoreCase("Hayir")) {  
                    System.out.println("Oyun bitti! Güle güle.");
                    break;  // dış while(true)’den çıkar → program sona erer
                }
                // Eğer “Evet” derse while(true) döngüsü yeniden başlar → yeni bir sayı seçilir
            }

            // Kullanıcı saçma bir şey yazarsa (“blabla” gibi)
            else {  
                System.out.println("Ne dedigini anlamadim :( Evet ya da Hayir demelisin...");
                continue; // Döngünün başına döner, tekrar “Evet/Hayir” sorar
            }
        }

        scanner.close();  // Scanner kapatılır (kaynak serbest bırakılır)
    }
}