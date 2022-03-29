/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutkg = 2.14, elmakg = 3.67, domateskg = 1.11, muzkg = 0.95, patlicankg = 5.0;
        double armut, elma, domates, muz, patlican;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? :" );
        armut = inp.nextDouble();
        System.out.print("Elma Kac Kilo ? :" );
        elma = inp.nextDouble();
        System.out.print("Domates Kac Kilo ? :" );
        domates = inp.nextDouble();
        System.out.print("Muz Kac Kilo ? :" );
        muz = inp.nextDouble();
        System.out.print("Patlican Kac Kilo ? :" );
        patlican = inp.nextDouble();

        double toplam = (armutkg * armut)+(elmakg * elma)+(domateskg * domates)+(muzkg * muz)+(patlicankg * patlican);
        System.out.print("Toplam Tutar : " + toplam + " TL");
    }
}
