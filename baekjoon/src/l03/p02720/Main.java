package l03.p02720;

// 주소: https://www.acmicpc.net/problem/2720
// 제목: 세탁소 사장 동혁
// 결과: 맞았습니다!!
// 메모리: 11684 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int c = Integer.parseInt(br.readLine()), q = 0, d = 0, n = 0, p = 0;
            
            while (c >= 25) {
                c -= 25;
                q++;
            }
            
            while (c >= 10) {
                c -= 10;
                d++;
            }
            
            while (c >= 5) {
                c -= 5;
                n++;
            }
            
            while (c >= 1) {
                c -= 1;
                p++;
            }
            
            sb.append(q).append(" ").append(d).append(" ").append(n).append(" ")
                    .append(p).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
