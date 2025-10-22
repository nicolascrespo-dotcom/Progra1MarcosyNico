import java.util.Scanner;

public class RetoForIfFixed {
    public static void main(String[] args) {
        int ejercicio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿que ejercicio desea ver?");
        ejercicio = scanner.nextInt();
        if (ejercicio == 1) {
            int dimension = 21;

            for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {
                    if (i == 2 && j == 2) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
