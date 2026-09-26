package ejerciciosclase;

public class sabado01 {
    public static void main(String[] args){
        int[][] matriz={
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        }
        ;
//for it
        int longitud = matriz.length;
        for (int i=0; i<longitud; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }   
//for each
        for (int[]filas : matriz){
            for (int columna : filas){
                System.out.print(columna + " ");
            }
            System.out.println();
        }


    }
    
}
