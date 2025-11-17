package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2738 {
    public static int[][] A;
    public static int[][] B;
    public static int[][] C;
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        A = new int[N][M];
        B = new int[N][M];
        C = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] s = in.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            String[] s = in.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
