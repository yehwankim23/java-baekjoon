package p02442;

// 주소: https://www.acmicpc.net/problem/2442
// 제목: 별 찍기 - 5
// 결과: 맞았습니다!!
// 메모리: 13052 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}
