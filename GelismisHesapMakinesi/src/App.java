import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "0- Çıkış Yap";

          do {
            
            System.out.println("İlk rakamı giriniz: ");
            int a = sc.nextInt();
            System.out.println("İkinci rakamı giriniz: ");
            int b = sc.nextInt();
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = sc.nextInt();

            switch (select) {
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
                
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);        

    }

    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Toplam: " + result);
        return result;
    }

      static float divided(float a, int b) {
        float result = a / b;
        System.out.println("Toplam: " + result);
        return result;
    }

      static int power(int a, int b) {
        int result = 1;
        for(int i = 1; i<=b; i++) {
            result *= a;
        }
        System.out.println("Üs : " + result);
        return result;
    }

      static int factorial(int a) {
        int result = 1;
        for(int i = 1; i<=a; i++){
            result *= i;
        }
        System.out.println("A Faktoriyel: " + result);
        return result;
    }
    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod: " + result);
        return result;
        

    }
}
