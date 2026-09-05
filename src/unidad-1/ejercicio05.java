public class ejercicio05 {
    public static void main(String[] args) {
        int cant_inicial =1000;
        int retiro = 200;
        int cant_retiros = retiro * 4;
        int cant_fin_mes = cant_inicial - cant_retiros;
        System.out.println("el dinero que queda al final del mes es: "+ cant_fin_mes);
    }
}