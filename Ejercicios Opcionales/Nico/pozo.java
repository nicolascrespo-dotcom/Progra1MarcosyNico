import java.util.Scanner;
public class pozo {
    public static void main(String[] args) {
        final int PROFUNDIDAD_POZO = 20;
        final String BORDE_SUPERIOR = "[__]              [__]";
        final String BORDE_INFERIOR = "[][][][][][][][][]";
        final String PARED_POZO = "[]:. :. :. :. :.[]";
        final String SEPARADOR = "_ __ ";
        System.out.println("¿Profundidad del agua");
        Scanner sc = new Scanner(System.in);
        final int PROFUNDIDAD_AGUA = sc.nextInt();
        final String AGUA = "[]~~~~~~~~~~~~~~[]";
         System.out.println("¿Profundidad del caracol?");
        final int PROFUNDIDAD_CARACOL = sc.nextInt();
        System.out.println(BORDE_SUPERIOR);
        for( int profundidad=0; profundidad <= PROFUNDIDAD_POZO; profundidad = profundidad + 1){
   if (profundidad <=  PROFUNDIDAD_POZO - PROFUNDIDAD_AGUA )
   {
    System.out.print(PARED_POZO );
   }
   else
   {
    System.out.print(AGUA);
   }
           System.out.println( SEPARADOR + profundidad);
        }
        System.out.println(BORDE_INFERIOR);
    }
}
