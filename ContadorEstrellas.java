
    import java.util.Scanner;

public class ContadorEstrellas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas estrellas quieres? ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }

        sc.close();
    }
}
