package p01009;

// 주소: https://www.acmicpc.net/problem/1009
// 제목: 분산처리
// 결과: 맞았습니다!!
// 메모리: 14992 KB
// 시간: 1016 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), a, b, r;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            r = a = Integer.parseInt(st.nextToken()) % 10;
            b = Integer.parseInt(st.nextToken()) - 1;
            
            while (b-- > 0) {
                r = r * a % 10;
            }
            
            sb.append(r == 0 ? 10 : r).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
