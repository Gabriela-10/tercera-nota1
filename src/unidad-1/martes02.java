import java.util.Scanner;

public class martes02 {
     public static void main(String[] args)  {
        Scanner leer_Scanner =new Scanner(System.in);
        byte edad = 32;
        if (edad >= 18 || edad ==30 ){
            System.out.println("sos mayor de edad");
        }else{
            System.out.println("sos menor de edad");
     }

    float nota =4.2f;
    final float nota_exelente = 4.5f;  
    final float nota_aprobada = 3.0f;  
    if (nota >=nota_exelente){ 
        System.out.println("exelente");
    }else if (nota >=nota_aprobada ){
        System.out.println("aprobado");
    }else{
        System.out.println("reprobada");
    }
}
}
