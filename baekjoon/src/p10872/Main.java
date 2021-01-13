package p10872;

// 주소: https://www.acmicpc.net/problem/10872
// 제목: 팩토리얼
// 결과: 맞았습니다!!
// 메모리: 12928 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N;
        
        N = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(factorial(N));
    }
    
    private static int factorial(int N) {
        int value;
        
        value = 1;
        
        if (N > 0) {
            value = N * factorial(N - 1);
        }
        
        return value;
    }
}
