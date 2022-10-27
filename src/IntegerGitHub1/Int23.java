import java.util.Scanner;

public class Int23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sekund: ");
        int s = sc.nextInt();

        int m = s / 3600;
        int m1 = s / 60;
        System.out.println( "Kun boshidan beri: " + m + " soat " + m1 +  " minut va " + s + " sekund o'tdi");
    }
}
