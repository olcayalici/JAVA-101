/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, toplam =0, dersSayisi = 0;
        double ort ;

        Scanner imput = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        matematik = imput.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            dersSayisi++;
        }

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = imput.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Turkce Notunuzu Giriniz:");
        turkce = imput.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = imput.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Muzik Notunuzu Giriniz:");
        muzik = imput.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        ort = toplam / dersSayisi;
        System.out.println("Ortalamaniz:"+ort );

        if(ort >= 55) {
            System.out.println("Sinifi Gectiniz!");

        }else {
            System.out.println("Sinifta Kaldiniz!");
        }



    }
}
