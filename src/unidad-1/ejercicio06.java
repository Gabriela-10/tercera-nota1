import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String name = leer.nextLine();
        System.out.println("ingrese su edad");
        int age = leer.nextInt();
        System.out.println("ingrese su altura");
        double height = leer.nextDouble();

        System.out.println("sus datos son: " + name + " " + age + " " + height);

    }
}
