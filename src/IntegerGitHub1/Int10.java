import java.util.Scanner;

public class Int10 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Uch xonali son: ");
        int sum = sc.nextInt();

        int yuzliklar = sum / 100;
        int onliklar = sum / 10 % 10;
        int birliklar = sum % 10;

        System.out.println("Birliklar: " + birliklar);
        System.out.println("O'nliklar: " + onliklar);
    }
}
