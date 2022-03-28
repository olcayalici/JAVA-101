/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    double tutar;
        System.out.print("Ucret tutari giriniz : ");
        tutar = inp.nextDouble();

        double kdvOran = tutar > 1000 ? 0.08 : 0.18;
        double kdvliFiyat = tutar * kdvOran;
        double total = tutar + kdvliFiyat;


        System.out.println("Kdv orani su kadardir :" + kdvOran);
        System.out.println("Kdv fiyati su kadardir :" + kdvliFiyat);
        System.out.println("Urunun kdv dahil fiyati :" + total);

    }
}
