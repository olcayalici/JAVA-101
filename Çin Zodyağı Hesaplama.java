/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil;
        String burc = "";
        System.out.print("Doğduğunuz Yılı Giriniz:");
        yil = input.nextInt();

        if (yil < 0) {
            System.out.print("Hatalı Giriş Yaptınız!");
        } else if (yil%12 == 0){
            burc = "Maymun";
        } else if (yil%12 == 1){
            burc = "Horoz";
        } else if (yil%12 == 2){
            burc = "Köpek";
        } else if (yil%12 == 3){
            burc = "Domuz";
        } else if (yil%12 == 4){
            burc = "Fare";
        } else if (yil%12 == 5){
            burc = "Öküz";
        } else if (yil%12 == 6){
            burc = "Kaplan";
        } else if (yil%12 == 7){
            burc = "Tavşan";
        } else if (yil%12 == 8){
            burc = "Ejderha";
        } else if (yil%12 == 9){
            burc = "Yılan";
        } else if (yil%12 == 10){
            burc = "At";
        } else if (yil%12 == 11){
            burc = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz:"+burc);

    }
}
