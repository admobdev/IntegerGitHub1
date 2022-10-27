import java.util.Scanner;

public class Int29 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("A ning qiymatini kiriting: ");
        int a = sc.nextInt();
        System.out.println("B ning qiymatini kiriting: ");
        int b = sc.nextInt();
        System.out.println("C ning qiymatini kiriting: ");
        int c = sc.nextInt();

        System.out.println("Tomonlari a va b bo'lgan tortburchakga tomonlari c bolgan kvadratdan: " + (a * b) / (c * c) +
                " ta sig'adi.");
        System.out.println("Kvadrat qoldiq maydon: " + (a * b) % (c * c));
    }
}
