import java.util.Scanner;
public class MenuComida {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int opcion;
        double total = 0;
        boolean continuar = true;
        do{
            System.out.println("\n=====Menu Comida=====");
            System.out.println("1.Pizza personalizada - $12.25");
            System.out.println("2.Hamburguesa - $8.00");
            System.out.println("3.Ensalada - $4.15");
            System.out.println("4.Bebidas");
            System.out.println("5.Imprimir factura");
            
            System.out.println("Seleccione una opcion: ");
            opcion = key.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Pizza agregada");
                    total += 12.25;
                    total += elejirIngredientes(key);
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
                                total += elejirBebida(key);
                                break;
                                case 5 :
                                    continuar= false;
                                    break;
                                    default:
                                        System.out.println("Opcion invalida");
            }
            }while (continuar);
                                        System.out.println("\n=====factura final=====");
                                        System.out.println("Total a pagar: $"+ total);
                                        System.out.println("Gracias por su compra");

                                        key.close();

    }
    public static double elejirIngredientes(Scanner key) {
            int ingrediente;
            double more= 0;
            boolean adding = true;
            do{
                System.out.println("\n---Ingredientes---");
                System.out.println("1.Extra queso - $1.00");
                System.out.println("2.Pepperoni - $1.50");
                System.out.println("3.Champiñones - $0.75");
                System.out.println("4.Terminar");
                System.out.println("Seleccione Ingredientes: ");

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

                
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            }while(adding);
            return more;
    }
    public static double elejirBebida(Scanner key){
        int Bebida;
        double price = 0;
        System.out.println("\n---Bebida---");
         System.out.println("1.Coca-Cola - $1.50");
          System.out.println("2.Jugo-Natural - $1.25");
           System.out.println("3.Te frio - $1.00");
            System.out.println("4.Agua - $1.00");
             System.out.println("Seleccione Bebida: ");

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
               return price;
    }
}
