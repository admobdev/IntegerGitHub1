import java.util.Scanner;

public class Int7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Ikki xonali son: ");
        int sum = sc.nextInt();

        int onliklar = sum / 10;
        int birliklar = sum % 10;
        int sum1 = onliklar + birliklar;
        System.out.println("O'nliklar: " + onliklar);
        System.out.println("Birliklar: " + birliklar);
        System.out.println("Raqamlari yigindisi: " + sum1);
    }
}
