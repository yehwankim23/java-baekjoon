package l03.p03034;

// 주소: https://www.acmicpc.net/problem/3034
// 제목: 앵그리 창영
// 결과: 맞았습니다!!
// 메모리: 11448 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        double l = Math.sqrt(Math.pow(Integer.parseInt(st.nextToken()), 2)
                + Math.pow(Integer.parseInt(st.nextToken()), 2));
        StringBuilder sb = new StringBuilder();
        
        while (n-- > 0) {
            if (Integer.parseInt(br.readLine()) <= l) {
                sb.append("DA\n");
            } else {
                sb.append("NE\n");
            }
        }
        
        br.close();
        System.out.print(sb);
    }
}
