package unidad01;
import java.util.Arrays;
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
    //for para que el menu se repita hasta que el usuario desee salir
    for (int j=0; j<1 ;){

        //menu para elegir la opcion requerida 

        System.out.println("elegir opcion deseada");
        System.out.println("1. registrar inventario de 5 productos");
        System.out.println("2. Modificar cantidad de un producto");
        System.out.println("3. Registrar inventario de n productos");
        System.out.println("4. Agregar un producto al inventario");
        System.out.println("5. Salir");

        int valor =scanner.nextInt();
        
        //los casos dependiendo del valor

        switch (valor) {
            case 1://registrar inventario de 5 productos    

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

                System.out.println("Reporte: ");
                 ValorTotal=0;
                for (int i= 0; i< longitudProductos ;i++){
                    PrecioTotal[i]= cantidades[i] * PrecioUnitario[i];
                    System.out.println("Productos      Cantidades    Precio unitario   Precio total");
                    System.out.println(productos[i]+"              "+ cantidades[i]+"                "+ PrecioUnitario[i]+"                 "+ PrecioTotal[i]);
                    ValorTotal= ValorTotal+PrecioTotal[i];
                }

                //total inventario
                System.out.println("El valor total del inventario es: "+ ValorTotal);

            break;

            case 2://modificar cantidades
                
                scanner.nextLine();
                
                //se pide el nombre para buscarse el producto a modificar

                System.out.println("ingrese el nombre del producto que se desea modificar la cantidad");
                ProductoModificar= scanner.nextLine();

                //se busca el producto

                for (int i =0; i<longitudProductos; i++){
                    if (productos[i].equals(ProductoModificar)){
                        System.out.println("ingrese la cantidad nueva");
                        cantidades[i]= scanner.nextInt();
                    } 

                }
                //segundo for para calcular los precios totales y datos de salida

                ValorTotal=0;
                System.out.println("Reporte: ");
                for (int i= 0; i< longitudProductos ;i++){
                    PrecioTotal[i]= cantidades[i] * PrecioUnitario[i];
                    System.out.println("Productos      Cantidades    Precio unitario   Precio total");
                    System.out.println(productos[i]+"              "+ cantidades[i]+"                "+ PrecioUnitario[i]+"                 "+ PrecioTotal[i]);
                    ValorTotal= ValorTotal+PrecioTotal[i];
                }

                //total inventario
                System.out.println("El valor total del inventario es: "+ ValorTotal);
            
            break;
                
            case 3://registrar inventario de n productos
                
                scanner.nextLine();

                //se pide la cantidad de productos que se desea registrar
                System.out.println("ingrese la nueva cantidad de productos");
                longitudProductos= scanner.nextInt();

                //se crean los arrays con la nueva longitud de productos
                productos= new String[longitudProductos];
                cantidades= new int[longitudProductos];
                PrecioUnitario= new double[longitudProductos];
                PrecioTotal = new double[longitudProductos];

                scanner.nextLine();
                //primer for para ingresar datos del inventario por teclado
                for (int i= 0; i< longitudProductos ;i++){
                    System.out.println("Ingrese el nombre del producto "+(i+1));
                    productos[i] = scanner.nextLine();
                    System.out.println("ingrese cantidad del producto "+ productos[i] +" y su precio por unidad");
                    cantidades[i] = scanner.nextInt();
                    PrecioUnitario[i]= scanner.nextDouble();
                    scanner.nextLine();
                }
                //segundo for para calcular los precios totales y datos de salida

                System.out.println("Reporte: ");
                ValorTotal=0;
                for (int i= 0; i< longitudProductos ;i++){
                    PrecioTotal[i]= cantidades[i] * PrecioUnitario[i];
                    System.out.println("Productos      Cantidades    Precio unitario   Precio total");
                    System.out.println(productos[i]+"              "+ cantidades[i]+"                "+ PrecioUnitario[i]+"                 "+ PrecioTotal[i]);
                    ValorTotal= ValorTotal+PrecioTotal[i];
                }

                //total inventario
                System.out.println("El valor total del inventario es: "+ ValorTotal);
                    
            break;
                
            case 4://agregar un producto

                //aumentar el tamaño de los arrays para agregar un producto
                longitudProductos= longitudProductos+1;

                //se copia los arrays ya existentes para que queden con el nuevo tamaño de arrays 

                productos= Arrays.copyOf(productos, longitudProductos);
                cantidades= Arrays.copyOf(cantidades, longitudProductos);
                PrecioUnitario= Arrays.copyOf(PrecioUnitario, longitudProductos);
                PrecioTotal= Arrays.copyOf(PrecioTotal, longitudProductos);

                scanner.nextLine();

                //ingresar nuevos valores por teclado 
                System.out.println("ingrese el nombre del producto a agregar");
                productos[longitudProductos-1]= scanner.nextLine();
                System.out.println("ingrese la cantidad y precio unitario del producto a agregar");
                cantidades[longitudProductos-1]= scanner.nextInt();
                PrecioUnitario[longitudProductos-1]= scanner.nextDouble();


                //inventario resultado 
                System.out.println("Reporte: ");
                ValorTotal=0;
                for (int i= 0; i< longitudProductos ;i++){
                    PrecioTotal[i]= cantidades[i] * PrecioUnitario[i];
                    System.out.println("Productos      Cantidades    Precio unitario   Precio total");
                    System.out.println(productos[i]+"              "+ cantidades[i]+"                "+ PrecioUnitario[i]+"                 "+ PrecioTotal[i]);
                    ValorTotal= ValorTotal+PrecioTotal[i];
                }

                //total inventario
                System.out.println("El valor total del inventario es: "+ ValorTotal);

            break;

            case 5://salir del programa
                
            //se cambia el valor de j para salir del for y terminar el proceso con el menu 
                j=1;

            default:
               
            break;
        }
        
    }

        //ultimo for para el reporte final del inventario antes de salir del programa

        System.out.println("Reporte final: ");
        ValorTotal=0;
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
