package p02522;

// 주소: https://www.acmicpc.net/problem/2522
// 제목: 별 찍기 - 12
// 결과: 맞았습니다!!
// 메모리: 13160 KB
// 시간: 92 ms

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
        
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (j >= Math.abs(i - N + 1)) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}
