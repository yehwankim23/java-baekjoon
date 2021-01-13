package p10214;

// 주소: https://www.acmicpc.net/problem/10214
// 제목: Baseball
// 결과: 맞았습니다!!
// 메모리: 13396 KB
// 시간: 96 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), Y, K;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            Y = K = 0;
            
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                Y += Integer.parseInt(st.nextToken());
                K += Integer.parseInt(st.nextToken());
            }
            
            sb.append(Y > K ? "Yonsei" : K > Y ? "Korea" : "Draw").append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
