package l02.p16785;

// 주소: https://www.acmicpc.net/problem/16785
// 제목: ソーシャルゲーム
// 결과: 맞았습니다!!
// 메모리: 13220 KB
// 시간: 96 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int A = Integer.parseInt(st.nextToken()),
                B = Integer.parseInt(st.nextToken()),
                C = Integer.parseInt(st.nextToken()), D = 0, M = 0;
        
        while (M < C) {
            D++;
            M += A;
            
            if (D % 7 == 0) {
                M += B;
            }
        }
        
        System.out.println(D);
    }
}
