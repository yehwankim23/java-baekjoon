package l03.p03058;

// 주소: https://www.acmicpc.net/problem/3058
// 제목: 짝수를 찾아라
// 결과: 맞았습니다!!
// 메모리: 13788 KB
// 시간: 104 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), N, S, M;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            S = 0;
            M = 101;
            
            for (int i = 0; i < 7; i++) {
                if ((N = Integer.parseInt(st.nextToken())) % 2 == 0) {
                    S += N;
                    
                    if (N < M) {
                        M = N;
                    }
                }
            }
            
            sb.append(S).append(" ").append(M).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
