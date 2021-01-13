package p02581;


// 주소: https://www.acmicpc.net/problem/2581
// 제목: 소수
// 결과: 맞았습니다!!
// 메모리: 13392 KB
// 시간: 276 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int M, N, sum, min;
        boolean isPrime;
        
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        br.close();
        sum = 0;
        min = 10001;
        isPrime = false;
        
        for (int i = M; i <= N; i++) {
            if (i > 1) {
                isPrime = true;
                
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
            }
            
            if (isPrime) {
                sum += i;
                
                if (i < min) {
                    min = i;
                }
            }
        }
        
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}
