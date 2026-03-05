
import java.util.Scanner;

public class Age {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
         String repeat;
         int sum = 0; // suma de edades
         int count = 0; // número de edades ingresados

         do {
         System.out.print("Ingresa tu edad: ");
         int age = sc.nextInt();

        // Validación de entrada
        if (age < 0 || age > 120) {
          System.out.println("Edad invalida por mentir");
        } else {
        sum += age ;  //acumula la edad
        count++;     // incrementa el contador

        if (age >= 18) {

        System.out.println( "Eres ,ayor de edad. ¡Ya puedes ingresar a este club nocturno!");
        } else {
        System.out.println( "Eres menor de edad. ¡Aún eres demaciado joven disfruta tu adolescencia sanamente!");
        }
      }

        System.out.print(" \n¿Quieres ingresar otra edad? (s/n): ");
         repeat = sc.next();
       } while (repeat.equals ("s"));

     // mostrar promedio al final
     if (count > 0) {
        double promedio = (double) sum / count;
        System.out.println("\nEl promedio de las edades es: " + promedio);
     }else {
        System.out.println("\nNo se ingresaron edades");
      }

     sc.close();
    }

  }