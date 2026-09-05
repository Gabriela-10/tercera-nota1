import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese primer numero: ");
    int numero1 = scanner.nextInt();
    System.out.print("Ingrese segundo numero: ");
    int numero2 = scanner.nextInt();

    int suma = numero1 + numero2;
    int resta = numero1 - numero2 ;
    int multi = numero1 * numero2 ;
    int divicion = numero1/numero2;
    int modulo = numero1% numero2;
     
    System.out.println("suma: "+ suma);
    System.out.println("Resta: "+ resta);
    System.out.println("Multiplicacion: "+ multi);
    System.out.println("Divicion: "+ divicion);
    System.out.println("Modulo: "+ modulo);
    }
}