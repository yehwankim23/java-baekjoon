package p02748;

// 주소: https://www.acmicpc.net/problem/2748
// 제목: 피보나치 수 2
// 결과: 맞았습니다!!
// 메모리: 11488 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();
        
        long a = 0, b = 1;
        
        if (n == 0) {
            System.out.println(a);
        } else {
            while (n-- > 1) {
                long temp = b;
                b += a;
                a = temp;
            }
            
            System.out.println(b);
        }
    }
}
