/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n, r;
        int totalN = 1, totalR = 1, totalFark = 1;

        System.out.print("Eleman sayisini giriniz:");
        n = scan.nextInt();
        System.out.print("Seçim sayisini giriniz:");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            totalN *= i;
        }
        for (int i = 1; i <= r; i++) {
            totalR *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            totalFark *= i;
        }
        int sonuc = totalN / (totalR * totalFark);
        System.out.println("Kombinasyon Hesabı:"+sonuc);


    }
}
