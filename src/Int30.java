import java.util.Scanner;

public class Int30 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Yil kiritilsin: ");
        int y = sc.nextInt();

        int javob = (y / 100) + 1;
        System.out.println(javob + " - asr bo'ladi");
    }
}
