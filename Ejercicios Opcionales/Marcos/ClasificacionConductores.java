import java.util.Scanner;

public class ClasificacionConductores {

    public static void main(String[] args) {

        final int EDAD_MINIMA = 18;
        final int EDAD_MAXIMA_NOVEL = 19;
        final int EDAD_MAXIMA_EXPERIMENTADO = 27;
        final int EDAD_MAXIMA_SENIOR = 64;
        final int EDAD_MINIMA_JUBILADO = 65;
        final int EASTER_EGG = 120;

        boolean licencia;
        int edad;
        String conclusión = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba su edad: ");
        edad = input.nextInt();

        if (edad < EDAD_MINIMA) {
            conclusión = "Menor de edad. No puede conducir.";
        } else {
            System.out.print("¿Tiene licencia de conducir? (true/false): ");
            licencia = input.nextBoolean();
            if ((edad >= EDAD_MINIMA) && !licencia) {
                conclusión = "Mayor sin licencia. No puede conducir.";
            } else if (edad >= EDAD_MINIMA && licencia) {
                if (edad < EDAD_MAXIMA_NOVEL) {
                    conclusión = "Conductor Novel. Puede conducir.";
                } else if (edad > EDAD_MAXIMA_NOVEL && edad < EDAD_MAXIMA_EXPERIMENTADO) {
                    conclusión = "Conductor Experimentado. Puede conducir.";
                } else if (edad > EDAD_MAXIMA_EXPERIMENTADO && edad < EDAD_MAXIMA_SENIOR) {
                    conclusión = "Conductor Senior. Puede conducir.";
                } else if (edad >= EDAD_MINIMA_JUBILADO) {
                    if (edad == EASTER_EGG) {
                        conclusión = "Sigues vivo y con ganas de conducir??.... en fin, Conductor Jubilado. Puede conducir.";
                    } else {
                        conclusión = "Conductor Jubilado. Puede conducir.";
                    }
                }

            }

        }

        System.out.println("Clasificación: " + conclusión);
    }

}