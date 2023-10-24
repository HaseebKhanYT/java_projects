package edu.neu.mgen;

public class HWtoCh7 {
    public static void main(String[] args) {
        int A[][] = { { 2, 3, 4 }, { 3, 4, 5 } }, B[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        int Arows, Brows, Acols, Bcols;

        Arows = A.length;
        Brows = B.length;
        Acols = A[0].length;
        Bcols = B[0].length;

        if (Acols != Brows) {
            System.out.println("The matrix cannot be multiplied");
            return;
        } else {
            int C[][] = new int[Arows][Bcols];

            // print Matrix A
            System.out.println("A: ");
            for (int i = 0; i < Arows; i++) {
                for (int j = 0; j < Acols; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            // print Matrix B
            System.out.println("B: ");
            for (int i = 0; i < Brows; i++) {
                for (int j = 0; j < Bcols; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            // calculate AxB
            for (int i = 0; i < Arows; i++) {
                for (int j = 0; j < Bcols; j++) {
                    for (int k = 0; k < Acols; k++) {

                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // print Matrix AxB
            System.out.println("A X B: ");

            for (int i = 0; i < Arows; i++) {
                for (int j = 0; j < Bcols; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
