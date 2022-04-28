/*
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0, y = 1, total = 0;

        System.out.print("Eleman sayısı giriniz:");
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {

            total = x + y;
            System.out.println(x+ " + " +y+ " = " +total);

            x = y;
            y = total;

        }

    }
}
