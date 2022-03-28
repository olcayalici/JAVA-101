/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14, cevre, alan, daireDilim;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yari capini giriniz: ");
        r = inp.nextInt();

        System.out.print("Dairenin acisini giriniz: ");
        a = inp.nextInt();

        cevre = (2 * r * pi);
        alan = pi * r * r;
        daireDilim = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin Cevresi: " +cevre );
        System.out.println("Dairenin Alani: " +alan );
        System.out.println("a Acisi Verilmis Olan Daire Diliminin Alani: " +daireDilim );

    }
}
