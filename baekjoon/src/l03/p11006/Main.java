package l03.p11006;

// 주소: https://www.acmicpc.net/problem/11006
// 제목: 남욱이의 닭장
// 결과: 맞았습니다!!
// 메모리: 11548 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()),
                    m = Integer.parseInt(st.nextToken());
            
            sb.append(2 * m - n).append(" ").append(n - m).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
