import java.util.Scanner;

public class Int2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilogramm: ");
        int M = sc.nextInt();

        int T =  M / 1000;
        System.out.println("Tonnada: " + T + " tonna");
    }
}
