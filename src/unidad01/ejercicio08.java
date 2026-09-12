package unidad01;
import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tres numeros enteros y que sean diferentes");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int numero3 = leer.nextInt();
        boolean comparacion = (numero1 > numero2 && numero1 < numero3);
        System.out.println("¿el numero 1 es mayor que el 2 pero menor que el 3? " + comparacion);
    }
    
}
