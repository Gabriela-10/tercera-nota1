package ejerciciosclase;
import java.util.Scanner;
public class Sabado02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Llenar la matriz con valores ingresados por el usuario
        int longitud_filas = matriz.length;
        int longitud_columnas = matriz[0].length;
        for (int filas = 0; filas < longitud_filas; filas++) {
            for (int columnas = 0; columnas < longitud_columnas; columnas++) {
                System.out.print("Ingrese el valor para la posición [" + filas + "][" + columnas + "]: ");
                matriz[filas][columnas] = scanner.nextInt();    
            }
        }
         for (int filas = 0; filas < longitud_filas; filas++) {
            for (int columnas = 0; columnas < longitud_columnas; columnas++) {
                System.out.print(matriz[filas][columnas] + " ");
            }
            System.out.println();

        }
    }
}
