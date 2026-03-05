import java.util.Scanner;

public class Star_Counter {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("=== Contador de Estrellas ===");
        System.out.print("Ingresa un número: ");

        // Leer el número ingresado
        if (scanner.hasNextInt()) { 
            int cantidad = scanner.nextInt();

            // Usar un bucle para imprimir estrellas
            for (int i = 0; i < cantidad; i++) {
                System.out.print("*");
            }
            System.out.println(); // salto de línea al final
            System.out.println("¡Listo! Se mostraron tus estrellas.");
        } else {
            System.out.println("Por favor ingresa un número válido.");
        }
        String repeat;

    do{
        System.out.println("Welcome to Andromeda\n¿How many stars do you want?: ");
       int number= sc.nextInt();

        for (int i = 1; i <= number; i++) {
                System.out.println("*");
        }

        System.out.print( "*"); 
        System.out.print("\nDo you want more stars?(s/n): ");
        repeat = sc.next();

         if(repeat.equals("s")){
            System.out.println("We'll find you some more");       
        }else{
            System.out.println("Thank you,you save us stars,jajaja");
        }

    } while (repeat.Equals("s"));
       
        sc.close();
    }
}
