/*
Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.print("Üssü alınacak sayıyı giriniz:");
        a = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz:");
        b = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.println("Cevap:"+ total);
    }
}

