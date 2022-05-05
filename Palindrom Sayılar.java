/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
*/
import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int sayı){

        int yedek = sayı, sonSayı, tersSayı = 0;

        while (yedek != 0){
            sonSayı = yedek % 10;
            tersSayı = (tersSayı * 10) + sonSayı;
            yedek /= 10;
        }

        if (sayı == tersSayı) {
            System.out.println(sayı+ "sı Palindrom Sayıdır");
            return true;
        } else {
            System.out.println(sayı+ "sı Palindrom Sayı Değildir");
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayı = input.nextInt();
        System.out.println(isPalindrom(sayı));
       
    }
}