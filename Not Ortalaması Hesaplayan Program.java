/* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak... 
*/

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz : ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunu Giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunu Giriniz : ");
        muzik = inp.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamaniz : " + ortalama);

        String sonuc = (ortalama>60) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(sonuc);
    }
}
