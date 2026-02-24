
    import java.util.Scanner;

public class ContadorEstrellas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String repeat;
        do{
        System.out.println("Welcome to Andromeda ");
        System.out.println("¿How many stars do you want?: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }

        System.out.print("\nDo you want more stars?(s/n): ");
        repeat = sc.next();
         if(repeat.equals("s")){
            System.out.println("We'll find you some more");       
        }else{
            System.out.println("Thank you,you save us stars,jajaja");
        }

        }while (repeat.contentEquals("s"));
       
        sc.close();
        
    }
}
