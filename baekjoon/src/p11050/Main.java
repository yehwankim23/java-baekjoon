package p11050;

// 주소: https://www.acmicpc.net/problem/11050
// 제목: 이항 계수 1
// 결과: 맞았습니다!!
// 메모리: 12968 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N, K;
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        System.out.println(factorial(N) / factorial(K) / factorial(N - K));
    }
    
    private static int factorial(int N) {
        int value;
        
        value = 1;
        
        if (N > 1) {
            value = N * factorial(N - 1);
        }
        
        return value;
    }
}
