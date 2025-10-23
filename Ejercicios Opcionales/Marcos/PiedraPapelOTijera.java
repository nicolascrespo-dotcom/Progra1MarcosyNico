import java.util.Scanner;

class PiedraPapelOTijera {

    public static void main(String[] args) {

        final String PIEDRA = "piedra";
        final String PAPEL = "papel";
        final String TIJERA = "tijera";
        String eleccionUsuario= "";
        int eleccionIAnum;
        String eleccionIAfinal = null;

        eleccionIAnum = (int) (Math.random() * 3)+1;

        if (eleccionIAnum == 1) {
            eleccionIAfinal = PIEDRA;
        }
        if (eleccionIAnum == 2) {
            eleccionIAfinal = PAPEL;
        }
        if (eleccionIAnum == 3) {
            eleccionIAfinal = TIJERA;
        }
        System.out.println(eleccionIAfinal);
        while((!eleccionUsuario.equals(PIEDRA)) && (!eleccionUsuario.equals(PAPEL)) && (!eleccionUsuario.equals(TIJERA))){
            Scanner input = new Scanner(System.in);
            System.err.println("Qué desea sacar(piedra/papel/tijera)");
            eleccionUsuario = input.next().trim().toLowerCase();

            if (eleccionUsuario.equals("piedra")) {
                eleccionUsuario = PIEDRA;
            } else if (eleccionUsuario.equals("papel")) {
                eleccionUsuario = PAPEL;
            } else if (eleccionUsuario.equals("tijera")) {
                eleccionUsuario = TIJERA;
            } else {
                System.out.print("Entrada no válida, escoja piedra papel o tijera: ");
            }

        }         
            
        if (eleccionUsuario.equals(eleccionIAfinal)) {
            System.out.print("La IA ha escogido " + eleccionIAfinal + ", habéis empatado!!");
        } else if (eleccionUsuario.equals(PIEDRA) && eleccionIAfinal.equals(TIJERA)) {
            System.out.println("La IA ha escogido " + eleccionIAfinal + ", has ganado!!");
        } else if (eleccionUsuario.equals(PIEDRA) && eleccionIAfinal.equals(PAPEL)) {
            System.out.println("La IA ha escogido " + eleccionIAfinal + ", has perdido!!");
        } else if (eleccionUsuario.equals(PAPEL) && eleccionIAfinal.equals(PIEDRA)) {
            System.out.println("La IA ha escogido " + eleccionIAfinal + ", has ganado!!");
        } else if (eleccionUsuario.equals(PAPEL) && eleccionIAfinal.equals(TIJERA)) {
            System.out.println("La IA ha escogido " + eleccionIAfinal + ", has perdido!!");
        } else if (eleccionUsuario.equals(TIJERA) && eleccionIAfinal.equals(PAPEL)) {
            System.out.println("La IA ha escogido " + eleccionIAfinal + ", has ganado!!");
        } else if (eleccionUsuario.equals(TIJERA) && eleccionIAfinal.equals(PIEDRA)) {
            System.out.println("La IA ha escogido " + eleccionIAfinal + ", has perdido!!");
        }

    }

}
