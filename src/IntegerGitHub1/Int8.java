import java.util.Scanner;

public class Int8 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Ikki xonali son: ");
        int sum = sc.nextInt();

        int onliklar = sum / 10;
        int birliklar = sum % 10;

        int temp = onliklar;
        int a1 = onliklar = birliklar;
        int a2 = birliklar = temp;

        System.out.println("O'nliklar: " + onliklar);
        System.out.println("Birliklar: " + birliklar);
    }
}
