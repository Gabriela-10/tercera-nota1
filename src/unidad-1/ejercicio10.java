import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("       MENU        ");
        System.out.println("1.            Sumar");
        System.out.println("2.           Restar");
        System.out.println("3.      Multiplicar");
        System.out.println("4.          Dividir");
        System.out.println("ingrese el numero de la operacioln deseada");
        int opcion = leer.nextInt();
        System.out.println("ingrese dos numeros enteros");
        int numero1 = leer.nextInt();  
        int numero2 = leer.nextInt();
        switch (opcion){
            case 1:
                int suma = numero1 + numero2;
                System.out.println("la suma es: "+ suma);
                break;
            case 2:
                int resta = numero1 - numero2;
                System.out.println("la resta es: "+ resta);
                break;
            case 3:
                int multiplicacion = numero1 * numero2;
                System.out.println("la multiplicacion es: "+ multiplicacion);
                break;
            case 4:
                double division = numero1 / numero2;
                System.out.println("la division es: "+ division);
                break;
                default:
                System.out.println("la opcion ingresada no es valida");
                break;
        }
    }
    
}
