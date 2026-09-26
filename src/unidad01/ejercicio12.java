package unidad01;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("ingrese el numero deseado para factorial");
        int numero = Scanner.nextInt();
        int i = 1;
        int factorial= 1;
        while (i <= numero){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
    }
}
