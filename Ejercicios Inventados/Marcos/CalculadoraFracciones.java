import java.util.Scanner;

public class CalculadoraFracciones {
    public static void main(String[] args) {

        int numerador1;
        int numerador2;
        int denominador1;
        int denominador2;
        int numeradorResultante;
        int denominadorResultante;
        String operación;

        Scanner input = new Scanner(System.in);
        System.out.print("Escriba el numerador de la primera fracción: ");
        numerador1 = input.nextInt();
        System.out.print("Escriba el denominador de la primera fracción: ");
        denominador1 = input.nextInt();
        System.out.print("Escriba el numerador de la segunda fracción: ");
        numerador2 = input.nextInt();
        System.out.print("Escriba el denominador de la segunda fracción: ");
        denominador2 = input.nextInt();
        if(denominador1==0 || denominador2==0){
            System.out.print("El denominador no puede ser 0, Syntax Error.");
            return;
        }

        System.out.print("¿Que operación desea realizar(+, -, *, /)?: ");
        operación = input.next();
        if ("+".equals(operación)) {

            if (denominador1 == denominador2) {

                numeradorResultante = numerador1 + numerador2;
                denominadorResultante = denominador1;
                System.out.print("La suma de sus fracciones da como resultado: " + numeradorResultante + "/"
                        + denominadorResultante);

            } else {

                denominadorResultante = denominador1 * denominador2;
                numeradorResultante = (numerador1 * denominador2) + (numerador2 * denominador1);
                System.out.print("La suma de sus fracciones da como resultado: " + numeradorResultante + "/"
                        + denominadorResultante);
            }
        } else if ("-".equals(operación)) {

            if (denominador1 == denominador2) {

                numeradorResultante = numerador1 - numerador2;
                denominadorResultante = denominador1;
                System.out.print("La resta de sus fracciones da como resultado: " + numeradorResultante + "/"
                        + denominadorResultante);
            } else {
                denominadorResultante = denominador1 * denominador2;
                numeradorResultante = (numerador1 * denominador2) - (numerador2 * denominador1);
                System.out.print("La resta de sus fracciones da como resultado: " + numeradorResultante + "/"
                        + denominadorResultante);
            }
        } else if ("*".equals(operación)) {

            numeradorResultante = numerador1 * numerador2;
            denominadorResultante = denominador1 * denominador2;
            System.out.print("La multiplicación de sus fracciones da como resultado: " + numeradorResultante + "/"
                    + denominadorResultante);
        } else if ("/".equals(operación)) {

            numeradorResultante = numerador1 * denominador2;
            denominadorResultante = denominador1 * numerador2;
            System.out.print("La división de sus fracciones da como resultado: " + numeradorResultante + "/"
                    + denominadorResultante);
        } else {
            System.out.print("Operación no válida");
        }

    }
}