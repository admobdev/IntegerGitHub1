import java.util.Scanner;

public class Int16 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Uch xonali son : ");
        int s = sc.nextInt();

        int yuzliklar = s /100;
        int onliklar = s % 100/10;
        int birliklar = s % 10;
        int temp = onliklar;
        int a1 = onliklar = birliklar;
        int a2 = birliklar = temp;
        System.out.println("Natija: " + yuzliklar + "" + onliklar + "" + birliklar);
    }
}
