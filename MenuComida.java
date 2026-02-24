import java.util.Scanner; //Importamos Scanner para leer datos del usuario
public class MenuComida {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);  // Objeto para capturar datos del teclado
        int opcion;         // Variable para guardar la opción del menú principal
        double total = 0;   // Variable acumuladora del total a pagar
        boolean continuar = true; // Controla el ciclo del menú

        // Ciclo principal del menú
        do{
            System.out.println("\n=====Menu Comida=====");  // \n hace un salto de línea
            System.out.println("1.Pizza personalizada - $12.25\n2.Hamburguesa - $8.00"+
            "\n3.Ensalada - $4.15 \n4.Bebidas \n5.Imprimir factura \n Seleccione una opcion: ");
           /*System.out.println("2.Hamburguesa - $8.00");
            System.out.println("3.Ensalada - $4.15");
            System.out.println("4.Bebidas");
            System.out.println("5.Imprimir factura");
             
            System.out.println("Seleccione una opcion: ");
            */
            opcion = key.nextInt();    // Capturamos la opción elegida

            // Evaluamos la opción seleccionada
            switch (opcion){
                case 1:
                    System.out.println("Pizza agregada");
                    total += 12.25; // Sumamos precio base
                    total += elejirIngredientes(key); // Sumamos ingredientes extra
                    break;
                case 2 :
                     System.out.println("Hamburguesa agregada");
                     total +=8.00;
                     break;
                 case 3:
                     System.out.println("Ensalada agregada");
                     total +=4.15;
                     break;
                 case 4 :
                     System.out.println("Bebida agregada");
                     total += elejirBebida(key);     // Llamamos método bebida
                     break;
                 case 5 :
                     continuar= false;   // Finaliza el ciclo
                     break;
                 default:
                    System.out.println("Opcion invalida");
            }
            }while (continuar);     // Se repite mientras continuar sea true
                                        
                                                // Factura final

                     System.out.println("\n=====factura final=====");
                     System.out.println("Total a pagar: $"+ total);
                     System.out.println("Gracias por su compra");

                     key.close();       // Cerramos el Scanner

    }
     /*
     * Método que permite agregar ingredientes extra a la pizza.
     * Retorna el costo adicional seleccionado.
     */
    public static double elejirIngredientes(Scanner key) {
            int ingrediente;    // Guarda la opción elegida
            double more= 0;      // Acumula el costo extra   
            boolean adding = true;  // Controla el ciclo de ingredientes
            do{
                System.out.println("\n---Ingredientes---");
                System.out.println("1.Extra queso - $1.00 \n2.Pepperoni - $1.50"+
                "\n3.Champiñones - $0.75\n4.Terminar\nSeleccione Ingredientes: ");
               /* System.out.println("2.Pepperoni - $1.50");
                System.out.println("3.Champiñones - $0.75");
                System.out.println("4.Terminar");
                System.out.println("Seleccione Ingredientes: ");
               */
                ingrediente= key.nextInt();
                switch (ingrediente) {
                    case 1:
                        more +=1.00;
                        break;
                    case 2 :
                         more += 1.50;
                         break;
                    case 3:
                         more += 0.75;
                         break;
                     case 4:
                         adding = false;
                         break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                 /*
     * Método que permite seleccionar una bebida.
     * Retorna el precio de la bebida seleccionada.
     */

            }while(adding);
            return more;        // Devuelve el total adicional
    }
    public static double elejirBebida(Scanner key){
        int Bebida;     // Guarda la opción elegida
        double price = 0;   // Precio de la bebida
        System.out.println("\n---Bebida---");
        System.out.println("1.Coca-Cola - $1.50\n2.Jugo-Natural - $1.25"+
        "\n3.Te frio - $1.00\nSeleccione Bebida: ");
        /*System.out.println("2.Jugo-Natural - $1.25");
        System.out.println("3.Te frio - $1.00");
        System.out.println("4.Agua - $1.00");
        System.out.println("Seleccione Bebida: ");
        */
            Bebida= key.nextInt();
            switch (Bebida){
                case 1:
                    price=1.50;
                    break;
                case 2:
                    price=1.25;
                    break;
                case 3:
                    price=1.00;
                    break;
                case 4 :
                    price=1.00;
                     break;

                default:
                    System.out.println("Opcion invalida");
                                    
            } 
               return price;  // Retorna el precio seleccionado
    }
}
