import java.util.Scanner;
public class ClasificacionEdad {
    public static void main(String[] args) {
        System.out.println("Cual es tu edad?");
        int edad = Scanner.nextInt();
        final int primeraINfancia=5
        final int infancia=11
        final int adolescencia=18
        final int juventud=25
        final int adultez=59
        final int personaMayor=100
        System.out.println("Cual es tu edad?");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        if (edad<=primeraINfancia){
            System.out.println("Primera infancia");
        } else if (edad<=infancia){
            System.out.println("Infancia");
        } else if (edad<=adolescencia){
            System.out.println("Adolescencia");
        } else if (edad<=juventud){
            System.out.println("Juventud");
        } else if (edad<=adultez){
            System.out.println("Adultez");
        } else if (edad<=personaMayor){
            System.out.println("Persona mayor");
        } else {
            System.out.println("Edad no valida");
        }
    }
    
}
