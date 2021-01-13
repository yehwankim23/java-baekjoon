package p03460;

// 주소: https://www.acmicpc.net/problem/3460
// 제목: 이진수
// 결과: 맞았습니다!!
// 메모리: 12792 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), n;
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            n = Integer.parseInt(br.readLine());
            
            for (int i = 0; n > 0; i++) {
                if (n % 2 == 1) {
                    sb.append(i).append(" ");
                }
                
                n /= 2;
            }
        }
        
        br.close();
        System.out.print(sb);
    }
}
