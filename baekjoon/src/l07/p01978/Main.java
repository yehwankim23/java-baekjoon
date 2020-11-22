package l07.p01978;

// 주소: https://www.acmicpc.net/problem/1978
// 제목: 소수 찾기
// 결과: 맞았습니다!!
// 메모리: 13012 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N, num, count;
        boolean isPrime;
        
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        count = 0;
        
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            isPrime = true;
            
            if (num > 1) {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                    }
                }
                
                if (isPrime) {
                    count++;
                }
            }
        }
        
        br.close();
        System.out.println(count);
    }
}
