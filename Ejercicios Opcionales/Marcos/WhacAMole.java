import java.util.Scanner;

public class WhacAMole {

    public static void main(String[] args) {

        final int maxIntentos = 15;
        int intentos = 0;

        final int dimensión = 7;
        int casillaMarcadax;
        int casillaMarcaday;
        int monigote1x;
        int monigote1y;
        int aciertos = 0;

        Scanner input = new Scanner(System.in);

        while (intentos < maxIntentos) {
            intentos++;
            monigote1x = (int) (Math.random() * 7) + 1;
            monigote1y = (int) (Math.random() * 7) + 1;
            System.out.println("tienes la sensación de que va a salir en la casilla:" + monigote1x + ", " + monigote1y);

            System.out.println("Que casilla desea golpear(x)?: ");
            casillaMarcadax = input.nextInt();
            System.out.println("Que casilla desea golpear(y)?: ");
            casillaMarcaday = input.nextInt();

            for (int y = 1; y <= dimensión; y = y + 1) {

                for (int x = 1; x <= dimensión; x = x + 1) {

                    if ((monigote1x == x && monigote1y == y)
                            && (monigote1x == casillaMarcadax && monigote1y == casillaMarcaday)) {

                        System.out.print("[**]");
                        aciertos++;
                    }

                    else if (casillaMarcadax == x && casillaMarcaday == y) {

                        System.out.print("[[]]");
                    }

                    else if (monigote1x == x && monigote1y == y) {

                        System.out.print("(``)");

                    } else {
                        System.out.print("(  )");
                    }

                }
                System.out.println();
            }
        }
        System.out.println("Has acertado " + aciertos + " veces de " + maxIntentos + " intentos.");

    }

}
