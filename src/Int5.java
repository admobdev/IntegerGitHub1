import java.util.Scanner;

public class Int5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        int ab = a / b;
        int ab2 = b % a;
        System.out.println("A da B ni: " + ab + " marta joylash mumkin !");
        System.out.println("A da B ning joylashmagan qismi: " + ab2);
    }
}
