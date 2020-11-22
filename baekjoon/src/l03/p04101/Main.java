package l03.p04101;

// 주소: https://www.acmicpc.net/problem/4101
// 제목: 크냐?
// 결과: 맞았습니다!!
// 메모리: 13076 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()),
                b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        while (a != 0 && b != 0) {
            sb.append(a > b ? "Yes" : "No").append("\n");
            
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
        }
        
        br.close();
        System.out.print(sb);
    }
}
