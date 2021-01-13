package p02444;

// 주소: https://www.acmicpc.net/problem/2444
// 제목: 별 찍기 - 7
// 결과: 맞았습니다!!
// 메모리: 13212 KB
// 시간: 88 ms

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
            for (int j = 0; j < Math.abs(i - N + 1); j++) {
                sb.append(" ");
            }
            for (int j = 0; j < 2 * (N - Math.abs(N - i - 1)) - 1; j++) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}
