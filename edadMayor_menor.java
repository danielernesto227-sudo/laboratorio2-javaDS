
    import java.util.Scanner;

public class edadMayor_menor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int age  = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        sc.close();
    }
}

