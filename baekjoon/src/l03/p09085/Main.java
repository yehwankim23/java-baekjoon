package l03.p09085;

// 주소: https://www.acmicpc.net/problem/9085
// 제목: 더하기
// 결과: 맞았습니다!!
// 메모리: 12868 KB
// 시간: 72 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), N, sum;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            sum = 0;
            
            while (N-- > 0) {
                sum += Integer.parseInt(st.nextToken());
            }
            
            sb.append(sum).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
