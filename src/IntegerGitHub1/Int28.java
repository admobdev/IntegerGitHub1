import java.util.Scanner;

public class Int28 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Duyshanba1, Seyshanba2, Chorshanba3, Payshanba4, Juma5, Shanba6,Yakshanba 7");
        System.out.print("Hafta kunini kiriting: ");
        int b = sc.nextInt();
        System.out.println("K (1 -365)gacha bolgan son kiritng: ");
        int k = sc.nextInt();

        int natija = (k + b) % 7;
        System.out.println(natija + " kuniga togri keladi");
    }
}
