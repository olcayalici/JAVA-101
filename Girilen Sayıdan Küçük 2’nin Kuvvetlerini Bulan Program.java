/*
Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Bir Sayı Giriniz:");
        n = scan.nextInt();

        for (int a = 1; a <= n; a *= 4){
            System.out.println("4'ün Kuvvetleri:"+a);
        }

        System.out.println("--------------------");

        for (int b = 1; b <= n; b *= 5){
            System.out.println("5'in Kuvvetleri:"+b);
        }
        
    }
}
