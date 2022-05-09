/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
*/
import java.util.Scanner;

public class Main {
    static int pattern(int n, int staticNumber, boolean state) {
        System.out.print(n + " ");

        if (n > 0 && state == true) {
            n -= 5;

        } else {
            state = false;
            n += 5;
        }

        if (n==staticNumber){
            return n;
        }
        return pattern(n, staticNumber, state);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("N sayısı:");
        n = input.nextInt();

        System.out.print(pattern(n, n, true));
    }
}
