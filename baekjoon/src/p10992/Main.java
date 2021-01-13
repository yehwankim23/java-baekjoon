package p10992;

// 주소: https://www.acmicpc.net/problem/10992
// 제목: 별 찍기 - 17
// 결과: 맞았습니다!!
// 메모리: 13080 KB
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
        
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                sb.append(" ");
            }
            
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            
            sb.append("\n");
        }
        
        for (int i = 0; i < 2 * N - 1; i++) {
            sb.append("*");
        }
        
        System.out.print(sb);
    }
}
