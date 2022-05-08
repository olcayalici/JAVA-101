/*
Ödev
Aynı projeye mod almak ve dikdörtgen alan çevre hesabını yapan metotları yazıp menüde işlevsel hale getiriniz.
*/
import java.util.Scanner;

public class Main {

    static void plus(int a, int b){
        int result = (a + b);
        System.out.println("Toplama İşlemi Sonucu:"+result);
    }

    static void minus(int a, int b){
        int result = (a - b);
        System.out.println("Çıkartma İşlemi Sonucu:"+result);
    }

    static void times(int a, int b){
        int result = (a * b);
        System.out.println("Çarpma İşlemi Sonucu:"+result);
    }

    static void divided(int a, int b){
        if(b == 0){
            System.out.println("Bölen sayı 0 olamaz.");
            return;
        }
        int result = (a / b);
        System.out.println("Bölme İşlemi Sonucu:"+result);
    }

    static void power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println("Üs İşlemi Sonucu:"+result);
    }

    static void factorial(int a){
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        System.out.println("Faktöriyel İşlemi Sonucu:"+result);
    }

    static void mod(int a, int b){
        int result = (a % b);
        System.out.println("Mod Alma İşlemi Sonucu:"+result);
    }

    static void rectangle(int a, int b){
        int çevre = 2 * (a+b);
        int alan = (a * b);
        System.out.println("Dikdörtgen Alanı:"+alan);
        System.out.println("Dikdörtgen Çevre:"+çevre);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while (true){
            System.out.print("Lütfen Bir İşlem Seçiniz:");
            select = scan.nextInt();
            if (select == 0){
                System.out.println("BY BY");
                break;
            }

            System.out.print("1.Sayıyı Giriniz:");
            int a = scan.nextInt();
            System.out.print("2.Sayıyı Giriniz:");
            int b = scan.nextInt();

            switch (select){
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    rectangle(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Geçersiz İşlem Yaptınız.");
            }


        }


    }
}
