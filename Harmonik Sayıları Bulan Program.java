/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double toplam = 0;

        System.out.print("Bir sayi giriniz:");
        sayi = input.nextInt();

        for (double i = 1; i <= sayi; i++) {
            toplam += (1/i);
        }
        System.out.print(toplam);

    }
}
