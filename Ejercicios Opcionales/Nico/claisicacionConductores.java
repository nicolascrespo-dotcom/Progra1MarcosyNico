import java.util.Scanner;
public class claisicacionConductores {
    public static void main(String[] args) {
        final int EDAD_MINIMA = 18;
        final int MAXIMO_CONDUCTOR_NOVEL = 19;

        final int MINIMO_CONDUCTOR_EXPERIMENTADO = 27;
        final int MAXIMO_CONDUCTOR_SENIOR = 65;
        String Clasificacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es tu edad?: ");
        int edad = scanner.nextInt();
        if (edad < EDAD_MINIMA) {
            System.out.println("Eres menor de edad, no puedes conducir.");
        } else {
            System.out.println("¿Tienes Licencia de Conducir en Vigor?(true/false): ");
            boolean licencia;
            licencia = scanner.nextBoolean();
            if (licencia == false) {
                System.out.println("Sin Licencia no puedes conducir.");
            } else {
                if (edad>= EDAD_MINIMA && edad <= MAXIMO_CONDUCTOR_NOVEL) {
                    Clasificacion = "Conductor Novel";
                    System.out.println("Eres un " + Clasificacion);
                }
                if (MAXIMO_CONDUCTOR_NOVEL > edad && edad <= MINIMO_CONDUCTOR_EXPERIMENTADO) {
                    Clasificacion = "Conductor Experimentado";
                    System.out.println("Eres un " + Clasificacion);
                }

                if (MINIMO_CONDUCTOR_EXPERIMENTADO < edad && edad <= MAXIMO_CONDUCTOR_SENIOR) {
                    Clasificacion = "Conductor Senior";
                    System.out.println("Eres un " + Clasificacion);
                }

            }

        }

    }

}
