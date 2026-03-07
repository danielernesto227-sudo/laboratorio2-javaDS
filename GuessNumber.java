import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rm = new Random(); 
    int tried, attempts= 0, maxAttempts= 5; 

    int secretNumber= rm.nextInt(30) +1;
    System.out.println("Adivina el numero del 0 al 30");
    System.out.println("Tienes " + maxAttempts + " intentos");
 
    while (attempts < maxAttempts){
    System.out.print("Ingresa tu número: ");
    tried = sc.nextInt();
    attempts++;

if (tried ==secretNumber){
    System.out.println("Eres brujo o que? como adivinaste, es correcto!");
    System.out.println("Lo lograste en " + attempts + " intentos");
    break;}

if (attempts < maxAttempts){
    System.out.println("intentalo de nuevo");}
 
     if (attempts== maxAttempts){
        System.out.println("Se acaberon los intentos, el numero era "+ secretNumber); }
    }
    sc.close();
    }
    }
