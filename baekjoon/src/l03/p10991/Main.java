package l03.p10991;

// 주소: https://www.acmicpc.net/problem/10991
// 제목: 별 찍기 - 16
// 결과: 맞았습니다!!
// 메모리: 13108 KB
// 시간: 96 ms

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
            
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j % 2 == 0) {
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
