package p09295;

// 주소: https://www.acmicpc.net/problem/9295
// 제목: 주사위
// 결과: 맞았습니다!!
// 메모리: 13548 KB
// 시간: 100 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            
            sb.append("Case ").append(i).append(": ")
                    .append(Integer.parseInt(st.nextToken())
                            + Integer.parseInt(st.nextToken()))
                    .append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
