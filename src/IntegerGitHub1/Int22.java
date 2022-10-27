import java.util.Scanner;

public class Int22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sekund: ");
        int s = sc.nextInt();

        int m = s / 3600;
        System.out.println( "Kun boshidan beri: " + m + " soat va " + s + " sekund o'tdi");
    }
}
