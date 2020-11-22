package l03.p10474;

// 주소: https://www.acmicpc.net/problem/10474
// 제목: 분수좋아해?
// 결과: 맞았습니다!!
// 메모리: 13756 KB
// 시간: 108 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()),
                d = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        while (n + d != 0) {
            sb.append(n / d).append(" ").append(n % d).append(" / ").append(d)
                    .append("\n");
            
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
        }
        
        br.close();
        System.out.print(sb);
    }
}
