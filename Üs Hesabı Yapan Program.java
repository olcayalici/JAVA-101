/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
*/
import java.util.Scanner;

public class Main {

    static int power(int taban, int üs){
        if (üs == 0){
            return 1;
        }
        int result = taban * power(taban,üs - 1);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değerini Giriniz:");
        int taban = input.nextInt();
        System.out.print("Üs Değerini Giriniz:");
        int üs = input.nextInt();

        System.out.println("Sonuç:"+power(taban,üs));

    }
}
