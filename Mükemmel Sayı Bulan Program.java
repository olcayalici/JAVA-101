/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0){
                total += i;
            }

        }

        if (total == sayi){
            System.out.println(sayi+" sayısı MÜKEMMEL sayıdır.");
        }else {
            System.out.println(sayi+" sayısı MÜKEMMEL sayı değildir.");
        }

    }
}
