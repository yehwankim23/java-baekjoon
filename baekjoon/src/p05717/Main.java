package p05717;

// 주소: https://www.acmicpc.net/problem/5717
// 제목: 상근이의 친구들
// 결과: 맞았습니다!!
// 메모리: 12940 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (!(input = br.readLine()).equals("0 0")) {
            st = new StringTokenizer(input);
            
            sb.append(Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
