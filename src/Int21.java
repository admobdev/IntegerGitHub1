import java.util.Scanner;

public class Int21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sekund: ");
        int s = sc.nextInt();

        int m = s / 60;
        System.out.println( "Kun boshidan beri: " + m + " minut va " + s + " sekund o'tdi");
    }
}
