import java.util.Scanner;
public class martes01 {
        public static void main(String[] args) throws Exception {
                Scanner leer = new Scanner(System.in);
                System.out.println("ingrese primer numero");
                double numero1 = leer.nextDouble();
                System.out.println("ingrese segundo numero");
                double numero2 = leer.nextDouble();

                 System.out.println("ingrese su nombre");
               String name = leer.nextLine();
               System.out.println("hola, "+ name );

                double suma = numero1 + numero2;
                System.out.println("la suma es: "+ suma);

            
                
        }
}
