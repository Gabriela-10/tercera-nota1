package unidad01;
import java.util.Scanner;

public class inventarioC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //se crea las variables definidas junto a sus arrays

        String[] productos= new String[5];
        int[] cantidades= new int[5];
        double[] PrecioUnitario= new double[5];
        double[] PrecioTotal = new double[5];
        int longitudProductos = productos.length;
        double ValorTotal= 0;
        String ProductoModificar;
        boolean BuscarProducto;
        int CantidadProductos;
    for (int j=0; j<1 ;){
        //menu para elegir la opcion requerida 

        System.out.println("elegir opcion deseada");
        System.out.println("1. registrar inventario de 5 productos");
        System.out.println("2. Modificar cantidad de un producto");
        System.out.println("3. Modificar cantidad de productos");
        int valor =scanner.nextInt();
        
        //los casos dependiendo del valor

        switch (valor) {
            case 1:

                //primer for para ingresar datos del inventario por teclado
                scanner.nextLine();
                for (int i= 0; i< longitudProductos ;i++){
                    System.out.println("Ingrese el nombre del producto "+(i+1));
                    productos[i] = scanner.nextLine();
                    System.out.println("ingrese cantidad del producto "+productos[i]+" y su precio por unidad");
                    cantidades[i] = scanner.nextInt();
                    PrecioUnitario[i]= scanner.nextDouble();
                    scanner.nextLine();
                }

                 //segundo for para calcular los precios totales y datos de salida

                System.out.println("Reporte final: ");
                for (int i= 0; i< longitudProductos ;i++){
                    PrecioTotal[i]= cantidades[i] * PrecioUnitario[i];
                    System.out.println("Productos      Cantidades    Precio unitario   Precio total");
                    System.out.println(productos[i]+"              "+ cantidades[i]+"                "+ PrecioUnitario[i]+"                 "+ PrecioTotal[i]);
                    ValorTotal= ValorTotal+PrecioTotal[i];
                }

                //total inventario
                System.out.println("El valor total del inventario es: "+ ValorTotal);

                break;
            case 2:

                //modificar cantidades
                scanner.nextLine();
                System.out.println("ingrese el nombre del producto que se desea modificar la cantidad");
                ProductoModificar= scanner.nextLine();

                //encontrar producto

                for (int i =0; i<longitudProductos; i++){
                    if (productos[i].equals(ProductoModificar)){
                        System.out.println("ingrese la cantidad nueva");
                        cantidades[i]= scanner.nextInt();
                    } 

                }
                //segundo for para calcular los precios totales y datos de salida

                System.out.println("Reporte final: ");
                for (int i= 0; i< longitudProductos ;i++){
                    PrecioTotal[i]= cantidades[i] * PrecioUnitario[i];
                    System.out.println("Productos      Cantidades    Precio unitario   Precio total");
                    System.out.println(productos[i]+"              "+ cantidades[i]+"                "+ PrecioUnitario[i]+"                 "+ PrecioTotal[i]);
                    ValorTotal= ValorTotal+PrecioTotal[i];
                }

                //total inventario
                System.out.println("El valor total del inventario es: "+ ValorTotal);
            
                break;
                
            case 3:

                //modificar productos
                scanner.nextLine();
                System.out.println("ingrese la nueva cantidad de productos");
                CantidadProductos= scanner.nextInt();
                productos= new String[CantidadProductos];
                cantidades= new int[CantidadProductos];
                PrecioUnitario= new double[CantidadProductos];
                PrecioTotal = new double[CantidadProductos];

                for (int i= 0; i< CantidadProductos ;i++){
                    System.out.println("Ingrese el nombre del producto "+(i+1));
                    productos[i] = scanner.nextLine();
                    System.out.println("ingrese cantidad del producto "+productos[i]+" y su precio por unidad");
                    cantidades[i] = scanner.nextInt();
                    PrecioUnitario[i]= scanner.nextDouble();
                    scanner.nextLine();
                }
                break;
            default:
                break;
        }
        System.out.println("si quiere elegir otra opcion del menu ingrese 0, sino ingrese 1");
        j =scanner.nextInt();
    }

        //segundo for para calcular los precios totales y datos de salida

        System.out.println("Reporte final: ");
         for (int i= 0; i< longitudProductos ;i++){
            PrecioTotal[i]= cantidades[i] * PrecioUnitario[i];
            System.out.println("Productos      Cantidades    Precio unitario   Precio total");
            System.out.println(productos[i]+"              "+ cantidades[i]+"                "+ PrecioUnitario[i]+"                 "+ PrecioTotal[i]);
            ValorTotal= ValorTotal+PrecioTotal[i];
         }

         //total inventario
         System.out.println("El valor total del inventario es: "+ ValorTotal);
    }
}
