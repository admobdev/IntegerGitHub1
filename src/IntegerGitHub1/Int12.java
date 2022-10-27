import java.util.Scanner;

public class Int12 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Uch xonali son: ");
        int sum = sc.nextInt();

        int yuzliklar = sum / 100;
        int onliklar = sum / 10 % 10;
        int birliklar = sum % 10;
        int temp = yuzliklar;
        int a1 = yuzliklar = birliklar;
        int a2 = birliklar = temp;
        System.out.println("Teskari tartibi: " + yuzliklar + "" + onliklar + "" + birliklar);
    }
}
