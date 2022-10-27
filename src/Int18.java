import java.util.Scanner;

public class Int18 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("To'rt xonali son: ");
        int sum = sc.nextInt();

        int mingliklar = sum / 1000;
        int yuzliklar = sum / 100 % 10;
        int onliklar = sum / 10 % 10;
        int birliklar = sum % 10;

        System.out.println("Mingliklar xonasi: " + mingliklar);
    }
}
