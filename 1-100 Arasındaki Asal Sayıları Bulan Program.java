/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
*/
public class Main {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            int sayı = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    sayı++;
                }
            }

            if (sayı == 0) {
                System.out.print(i+ " ");
            }

        }

    }
}
