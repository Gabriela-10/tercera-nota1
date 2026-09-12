import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println ("ingrese tres numeros enteros");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int numero3 = leer.nextInt();
        int suma = numero1 + numero2 + numero3;
        double media = suma / 3;
        System.out.println ("la media de los tres numeros es: " + media );  
    }
    
}
