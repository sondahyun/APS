package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B25314 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());

        for (int i = 1; i <= T/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
