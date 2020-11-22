package l03.p02440;

// 주소: https://www.acmicpc.net/problem/2440
// 제목: 별 찍기 - 3
// 결과: 맞았습니다!!
// 메모리: 13024 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), M;
        br.close();
        StringBuilder sb = new StringBuilder();
        
        while (N > 0) {
            M = N--;
            
            while (M-- > 0) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}
