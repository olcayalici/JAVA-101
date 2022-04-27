/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
Örnek
Basamak Sayısı : 10
 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
*/   

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Basamak Sayısı Giriniz:");
        int n = input.nextInt();

        for (int i = n; i >= 0; i--) {

            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
