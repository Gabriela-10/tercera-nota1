package unidad01;

public class ejercicio11 {
    public static void main(String[] args){
        int cantidad = 0;
        for (int i=0; i<=100; i++){
            if (i % 2== 0 ){
                cantidad ++ ;
            }
        }
        System.out.println("La cantidad de numeros pares de 0 a 100 son "+ cantidad);
    }
}
