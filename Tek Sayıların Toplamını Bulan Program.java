/*
Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, total = 0;


        do {
            System.out.print("Sayı Giriniz:");
            i = input.nextInt();

            if ((i % 4 == 0) && (i > 0)){
                total += i;
            }
        } while (i % 2 == 0);

        System.out.print("Toplam:"+total);

    }
}
