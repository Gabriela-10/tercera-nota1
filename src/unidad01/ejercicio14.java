package unidad01;
import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
     Scanner Scanner = new Scanner(System.in);
     int[] numeros = new int[5];
     System.out.println("ingrese numeros para el arreglo");
     numeros[0]= Scanner.nextInt();
     numeros[1]= Scanner.nextInt();
     numeros[2]= Scanner.nextInt();
     numeros[3]= Scanner.nextInt();
     numeros[4]= Scanner.nextInt();
     int contador =0;
     int longitud =numeros.length;
     for (int i =0; i< longitud; i++){
        contador +=numeros[i];
     }
     double resultado = contador/longitud;
     System.out.println("el promedio es: "+ resultado);
} 
}