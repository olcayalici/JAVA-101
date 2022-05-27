/*
Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
*/

public class Main {
    public static void main(String[] args) {

        int [] list = {1,2,3,4,5};
        double sum = 0;

        for(double i : list){
            sum += (1 / i);
        }

        double harmonik = list.length / sum;
        System.out.println(harmonik);

    }
}
