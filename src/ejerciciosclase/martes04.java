package ejerciciosclase;
import java.util.Scanner;
public class martes04 {
    public static void main(String[] args) {
  int[] numeros= {10,20,30,40};
  int sumatotal=0;
  int longitud = numeros.length;
  for (int i=0; i<longitud; i++){
    sumatotal += numeros[i];
  }
  System.out.println("La suma total es: " + sumatotal);

  //o con for-each

int sumatotal2=0;
  for (int numero : numeros){
    sumatotal2 += numero;
  }
  System.out.println("La suma total es: " + sumatotal2);

  //otro ejemplo
    int[] numeros2= {12,45,8,21,91,33,11};
    int mayor = numeros2[0];
    int longitud2 = numeros2.length;
    int posicionmayor = 0;
    int buscar=21;
    boolean encontrado = false;
    for (int i=1; i<longitud2; i++){
        if (numeros2[i] > mayor){
            mayor = numeros2[i];
            posicionmayor = i;
        }
        if (numeros2[i] == buscar){
            encontrado = true;
            break; // Salir del bucle si se encuentra el número
        }
       
    }
    System.out.println("El número " + buscar + " se encuentra en el arreglo: " + encontrado);
    System.out.println("El número mayor es: " + mayor);
    System.out.println("La posición del número mayor es: " + posicionmayor);

    //o con for-each

    for (int numero : numeros2){
        if (numero > mayor){
            mayor = numero; 
            posicionmayor = java.util.Arrays.asList(numeros2).indexOf(numero);
        }
    }
    System.out.println("El número mayor es: " + mayor);
    System.out.println("La posición del número mayor es: " + posicionmayor);
    
}
}
