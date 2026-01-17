 package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        
        // 코드1 수행 횟수
        System.out.println(n);
        
        // 최고차항 차수 (Θ(n))
        System.out.println(1);
    }
}
