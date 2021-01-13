package p10569;

// 주소: https://www.acmicpc.net/problem/10569
// 제목: 다면체
// 결과: 맞았습니다!!
// 메모리: 12944 KB
// 시간: 76 ms

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
        
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            sb.append(2 - Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
