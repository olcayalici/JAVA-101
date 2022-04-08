/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner imput = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz: ");
        sicaklik = imput.nextInt();

        if(sicaklik < 5) {
            System.out.print("Kayak Yapabilirsin");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.print("Sinemaya Gidebilirsin");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.print("Piknik Yapabilirsin");
        } else if (sicaklik > 25) {
            System.out.print("Yuzmeye Gidebilirsin");
        }


    }
}
