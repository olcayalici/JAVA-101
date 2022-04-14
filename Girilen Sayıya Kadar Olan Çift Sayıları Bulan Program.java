/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k, sayim = 0, toplam = 0;
        System.out.print("Bir sayı giriniz:");
        k = input.nextInt();

        for (int i = 0; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                sayim++;
                toplam += i;
                System.out.println(" "+i);
            }
        }
        double ort = toplam / sayim;
        System.out.print("Ortalama:"+ ort);

    }
}
