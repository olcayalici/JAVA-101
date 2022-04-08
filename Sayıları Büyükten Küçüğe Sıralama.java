/*
Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.print("3.Sayıyı Giriniz: ");
        c = input.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.print("a < b < c");
            } else if (b == c){
                System.out.print("a < b = c");
            } else {
                System.out.print("a < c < b");
            }

        }else if (b<a && b<c){
            if (a<c){
                System.out.print("b < a < c");
            } else if (a == c){
                System.out.print("b < a = c");
            } else {
                System.out.print("b < c < a");
            }

        }else if (c<a && c<b){
            if (b<a){
                System.out.print("c < b < a");
            } else if (b == a){
                System.out.print("c < b = a");
            } else {
                System.out.print("c < a < b");
            }

        }else if (a==b && a<c){
            System.out.print("a = b < c");
        }

        else if (a==c && a<b){
            System.out.print("a = c < b");
        }

        else if (b==c && b<a){
            System.out.print("b = c < a");
        }

        else {
            System.out.print("a = b = c");
        }

    }
}
