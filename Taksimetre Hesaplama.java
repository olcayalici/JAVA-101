/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km;
        double hesap, kmAcilis = 10;

        System.out.print("Mesafe Giriniz: ");

        km = input.nextInt();
        hesap = (kmAcilis) + (km * 2.20);

        System.out.println(hesap < 20 ? "Odemen gereken tutar 20 Tl" : "Odemen gereken tutar " + hesap + " Tl");

    }
}
