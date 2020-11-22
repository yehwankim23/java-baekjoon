package l03.p11024;

// 주소: https://www.acmicpc.net/problem/11024
// 제목: 더하기 4
// 결과: 맞았습니다!!
// 메모리: 13608 KB
// 시간: 112 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), sum;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            sum = 0;
            
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            
            sb.append(sum).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
