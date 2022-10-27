import java.util.Scanner;

public class Int1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Santimetr: ");
        int L = sc.nextInt();

        int M = L / 100;
        System.out.println("Metrda: " + L + " metr");
    }
}
