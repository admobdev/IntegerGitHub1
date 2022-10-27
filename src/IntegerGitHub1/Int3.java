import java.util.Scanner;

public class Int3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bayt: ");
        int B = sc.nextInt();

        int K = B / 1024;
        System.out.println("Kilobayt: " + K + " Kb");
    }
}
