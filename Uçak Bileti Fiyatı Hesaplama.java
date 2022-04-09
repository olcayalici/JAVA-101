/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

-Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
-Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
-Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
-Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
-Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, yas, yasIndirim = 1, yolculukTip, tipIndirim, top, kmBasi = 0.1;

        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextDouble();

        System.out.print("Kaç Km Gidiceksiniz:");
        km = input.nextDouble();

        System.out.print("Yolculuk Tipi Seçiniz: \n1-Tek Yön\n2-Gidiş Dönüş \n");
        yolculukTip = input.nextDouble();

        if (yas <= 0 || km < 0 || (yolculukTip != 1 && yolculukTip != 2)) {
            System.out.print("Hatalı Veri Girdiniz !");
        } else {
            if (yas < 12) {
                yasIndirim = 0.5;                  // yasIndirim = 1 - (1 * 0.5)
            }else if (yas >= 12 && yas < 24) {
                yasIndirim = 0.9;                  // yasIndirim = 1 - (1 * 0.1)
            }else if (yas > 65) {
                yasIndirim = 0.7;                  // yasIndirim = 1 - (1 * 0.3)
            }


            if (yolculukTip == 2) {
                tipIndirim = 1.6;                 // tipIndirim = 2 - (2 * 0.2)
            }else {
                tipIndirim = 1;
            }

            top = km * kmBasi * yasIndirim * tipIndirim;
            System.out.println("Toplam Tutar:" +top+"TL");

        }

    }

}
