/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
*/

import java.util.Scanner;

public class Main {

    static int asal(int sayı, int i){
        if (i>1){
            if(sayı % i == 0){
                return 0;
            }
        } else if (i < 1) {
            return 0;
        } else if (i == 1){
            return 1;
        }
        return asal(sayı,--i);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz:");
        int sayı = input.nextInt();
        int i = sayı-1;

        if (asal(sayı,i) == 1) {
            System.out.println(sayı+" Sayısı Asaldır");
        } else {
            System.out.println(sayı+" Sayısı Asal Değildir");
        }

    }
}
