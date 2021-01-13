package p02441;

// 주소: https://www.acmicpc.net/problem/2441
// 제목: 별 찍기 - 4
// 결과: 맞았습니다!!
// 메모리: 13016 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), I = N, P, T;
        br.close();
        StringBuilder sb = new StringBuilder();
        
        while (I > 0) {
            P = N - I;
            T = I--;
            
            while (P-- > 0) {
                sb.append(" ");
            }
            while (T-- > 0) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}
