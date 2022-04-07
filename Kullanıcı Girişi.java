import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adi Giriniz: ");
        userName = input.nextLine();

        System.out.print("Sifre Giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giris Yaptiniz !");

        } else if(!userName.equals("patika")) {
            System.out.println("Kullanici Adinizi Hatali Girdiniz!");

        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Sifreniz Yanlis! ");
            System.out.println("Sifrenizi Sifirlamak Ister Misiniz? : \n1-Evet \n2-Hayir ");

           secim = input.nextInt();

            switch (secim){

                case 1:
                    System.out.print("Yeni Sifrenizi Giriniz: "+input.nextLine());
                    newPassword = input.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.println("Sifreniz Eski Sifre ile Ayni Olamaz!");
                    } else {
                        System.out.println("Yeni Sifreniz Olusturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Lutfen Sifrenizi Kontrol Edip Tekrar Deneyiniz.");
                    break;
            }
            
        }
        
    }
}
