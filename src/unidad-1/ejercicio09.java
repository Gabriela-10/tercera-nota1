import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args){
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tres numeros enteros y que sean diferentes");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int numero3 = leer.nextInt();
        int mayor;
        if (numero1 > numero2 ) {
            mayor = numero1;
        } else {
            mayor = numero2;}
        if (mayor > numero3){
            System.out.println("el numero mayor es: "+ mayor);
            } else {
            System.out.println("el numero mayor es: "+ numero3);
        }
    }
    
}
