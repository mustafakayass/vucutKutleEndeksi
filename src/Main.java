import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double boy, kilo;
        System.out.println("Lütfen Boyunuzu Giriniz(metre, virgül kullanınız) : ");
        System.out.println("Lütfen Kilonuzu Giriniz(kg) : ");
        Scanner input = new Scanner(System.in);
        boy = input.nextDouble();
        kilo = input.nextDouble();

        double VKE = kilo / (boy * boy);
        System.out.println("Vucut kitle Endeksiniz : " + VKE);

    }
}
