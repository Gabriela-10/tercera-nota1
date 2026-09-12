package unidad01;
public class ejercicio04 {
    public static void main(String[] args) {
        final int camisa = 25;
        final int pantalon = 30;
        final double porciento = 0.15;
        double descuento = porciento * camisa;
        double preciototal = camisa - descuento;
        System.out.println("el precio de la camisa con descuento es: "+ preciototal);
        double descuento2 = porciento * pantalon;
        double preciototal2 = pantalon - descuento2;
        System.out.println("el precio del pantalon con descuento es: "+ preciototal2);
        double total_compra = preciototal + preciototal2;
        System.out.println("el precio total de la compra es: "+ total_compra);
    }
}    