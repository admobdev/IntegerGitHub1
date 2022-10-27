import java.util.Scanner;

public class Int24 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("K (1 -365)gacha bolgan son kiritng: ");
        int K = sc.nextInt();

        System.out.println("Yakshanba 0, Duyshanba 1, Seyshanba 2, Chorshanba 3, Payshanba 4, Juma 5, Shanba 6 ");
        System.out.println(K % 7);
    }
}
