package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10951 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String[] split = in.readLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            System.out.println(A + B);
        }

    }
}
