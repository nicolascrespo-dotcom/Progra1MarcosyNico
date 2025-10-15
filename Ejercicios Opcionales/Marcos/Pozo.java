import java.util.Scanner;

public class Pozo {
    public static void main(String[] args) {
        final int FORMA_1 = 1;
        final int FORMA_2 = 2;
        final int FORMA_3 = 3;
        final int FORMA_4 = 4;
        final int FORMA_5 = 5;
        final int NIVEL_DEL_AGUA = 18;
        final int METROS_DEL_POZO = 20;
        int forma;

        Scanner input = new Scanner(System.in);
        System.out.println("Que forma del pozo desea ver?(1, 2, 3, 4 o 5): ");
        forma = input.nextInt();

        if (forma == FORMA_1) {
            System.out.println("[__]              [__]");
            for (int i = 0; i <= METROS_DEL_POZO; i++) {
                System.out.println("  []:. :. :. :. :.[] _ __ " + i);
            }
            System.out.println("  [][][][][][][][][] ");
        }
        if (forma == FORMA_2) {
            System.out.println("[__]              [__]");
            for (int i = 0; i <= METROS_DEL_POZO; i++) {

                if (i < NIVEL_DEL_AGUA) {
                    System.out.println("  []:. :. :. :. :.[] _ __ " + i);
                } else {
                    System.out.println("  []~~~~~~~~~~~~~~[] _ __ " + i);
                }

            }
            System.out.println("  [][][][][][][][][] ");

        }
        if (forma == FORMA_3) {
            System.out.println("[__]              [__]");            
            for (int i = 0; i <= METROS_DEL_POZO; i++) {

                if (i < NIVEL_DEL_AGUA) {
                    System.out.println("  []:. :. :. :. :.[] _ __ " + i);
                    if (i == 8) {
                        System.out.println("  []    _@)_/`    [] _ __ " + i);
                    }

                } else {
                    System.out.println("  []~~~~~~~~~~~~~~[] _ __ " + i);
                }

            }
            System.out.println("  [][][][][][][][][] ");
        }
        if (forma == FORMA_4) {
            int nivelPersonalizado;
            int caracolPersonalizado;
            System.out.print("¿Cuantos metros de nivel del agua deseas?: ");
            nivelPersonalizado = (METROS_DEL_POZO - input.nextInt()) + 1;
            System.out.print("¿A cuantos metros del pozo deseas que esté el caracol?: ");
            caracolPersonalizado = input.nextInt();

            System.out.println("[__]              [__]");
            for (int i = 0; i <= METROS_DEL_POZO; i++) {
                if (i < nivelPersonalizado) {
                    if (caracolPersonalizado == i) {
                        System.out.println("  []    _@)_/`    [] _ __ " + i);
                    } else {
                        System.out.println("  []:. :. :. :. :.[] _ __ " + i);
                    }
                } else {
                    System.out.println("  []~~~~~~~~~~~~~~[] _ __ " + i);
                }
            }
            System.out.println("  [][][][][][][][][] ");
        }
        if (forma == FORMA_5) {
            int nivelPersonalizado;
            int caracolPersonalizado;
            System.out.print("¿Cuantos metros de nivel del agua deseas?: ");
            nivelPersonalizado = (METROS_DEL_POZO - input.nextInt()) + 1;
            System.out.print("¿A cuantos metros del pozo deseas que esté el caracol?: ");
            caracolPersonalizado = input.nextInt();

            System.out.println("[__]              [__]");
            for (int i = 0; i <= METROS_DEL_POZO; i++) {
                if (i < nivelPersonalizado) {
                    if (caracolPersonalizado == i) {

                        System.out.println("  []    _@)_/`    [] _ __ " + i);
                    } else {
                        System.out.println("  []:. :. :. :. :.[] _ __ " + i);
                    }
                } else {
                    if (caracolPersonalizado == i){

                        System.out.println("  []~~~~_@)_-,~~~~[] _ __ "+i);
                    }else{
                    System.out.println("  []~~~~~~~~~~~~~~[] _ __ " + i);                        
                    }
                

                }
            }
            System.out.println("  [][][][][][][][][] ");
            if(caracolPersonalizado>=nivelPersonalizado){
                System.out.println("El caracol está muerto");
            }else {
                System.out.println("El caracol está vivo");
            }
            
        }
    }
}
