/**
 * Created by shekhars on 2/15/2017.
 */
public class MaxSizeMatrixWithAllOne {
    public static void main(String[] args) {
        int M[][] = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        printMaxSubSquare(M);
    }

    private static void printMaxSubSquare(int[][] M) {
        int i, j;
        int R = M.length;
        int C = M[0].length;
        int S[][] = new int[M.length][M[0].length];
        int max_of_s, max_i, max_j;

        for (i = 0; i < R; i++) {
            S[i][0] = M[i][0];
        }

        for (j = 0; j < C; j++) {
            S[0][j] = M[0][j];
        }

        for (i = 1; i < R; i++) {
            for (j = 1; j < C; j++) {
                if (M[i][j] == 1) {
                    S[i][j] = min(S[i][j - 1], S[i - 1][j - 1], S[i - 1][j]) + 1;
                } else {
                    S[i][j] = 0;
                }
            }
        }

        max_of_s = S[0][0];
        max_i = 0;
        max_j = 0;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (max_of_s < S[i][j]) {
                    max_of_s = S[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        for (i = max_i; i > max_i - max_of_s; i--) {
            for (j = max_j; j > max_j - max_of_s; j--) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else
            return c;
    }
}
