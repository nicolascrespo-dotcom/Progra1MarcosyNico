import java.util.Scanner;

class RetoForIf {

    public static void main(String[] args) {

        int ejercicio;
        Scanner input = new Scanner(System.in);
        System.out.println("Que ejercicio desea ver? (1-22): ");
        ejercicio = input.nextInt();

        int dimension = 21;
        if (ejercicio == 1) {
            for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i == 2 && j == 2
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }

        }
        if (ejercicio== 2){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i == 2
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio==3){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    j == 20
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 4){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i >=8 && i<15
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 5){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i == 11 && j == 11
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 6){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i == 11 || j == 11
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 7){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i == j
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 8){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i== (1+21-j)
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 9){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i == j || i == (1+21-j)
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 10){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i!=0
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 11){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    (i>0 || j>0) && !(i==11 && j == 11)
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 12){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    (i>0 || j>0) && !(i==11 || j == 11)
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 13){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i == j+1 || i == j-1
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 14){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    (i== 2) || (i == 20) || (j == 2) || (j == 20)
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 15){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    (i>=2 && i<=5) || (j>=2 && j<=5)
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 16){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    (i>1 && i<21) && (j>1 && j<21)
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 17){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    ((i>1 && i<21) && (j>1 && j<21)) && ((i == 2)||(i==20) || (j==2)||(j==20))
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 18){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    !((i>5) || (j>5))
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 19){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    ((i%2) == 1 && ((j%2)==1)) || ((i%2) == 0 && ((j%2)==0))
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 20){
             for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    (i==21 || j== 21) || ((i+1)/2 + (j+1)/2)%2== 0
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        if (ejercicio== 21){
            for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (
                    // El código desde aqui *********************************
                    i==1
                    // El código hasta aquí *********************************
                    ) {
                        System.out.print("(*)");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }

        }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
}