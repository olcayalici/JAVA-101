/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a, b, c;
        double cevre, u, alan;

        System.out.print("1.Kenari giriniz :" );
        a = inp.nextInt();

        System.out.print("2.Kenari giriniz :" );
        b = inp.nextInt();

        System.out.print("3.Kenari giriniz :" );
        c = inp.nextInt();

        cevre = (a+b+c);
        System.out.println("Ucgenin Cevresi :" +cevre);

        u = (a+b+c) / 2;                                      // Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢 ise 𝑢 = (a+b+c) / 2

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));    // Heron formulü = Alan*Alan = 𝑢*(𝑢 − 𝑎)*(𝑢 − 𝑏)*(𝑢 − 𝑐)
        System.out.println("Ucgenin Alani :" + alan);

    }
}
