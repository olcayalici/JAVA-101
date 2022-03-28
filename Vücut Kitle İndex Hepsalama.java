/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double m, kg;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        m = girdi.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : ");
        kg = girdi.nextDouble();

        double index = kg/(m * m);
        System.out.println("Vucut Kitle Indeksiniz : " +index );
    }
}
