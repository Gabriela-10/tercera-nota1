package unidad01;
import java.util.Scanner;
public class ejercicio13 {
    public  static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("ingrese numero para la tabla de mulriplicar");
        int numero = Scanner.nextInt();
        int resultado=0;
        for (int i =0; i <=10; i++){
            resultado= numero * i;
            System.out.println(numero + " x "+ i +" = "+resultado);
        }
    }
}
