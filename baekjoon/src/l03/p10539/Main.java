package l03.p10539;

// 주소: https://www.acmicpc.net/problem/10539
// 제목: 수빈이와 수열
// 결과: 맞았습니다!!
// 메모리: 13060 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), b, s = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            b = Integer.parseInt(st.nextToken());
            
            sb.append(b * i - s).append(" ");
            s = b * i;
        }
        
        System.out.print(sb);
    }
}
