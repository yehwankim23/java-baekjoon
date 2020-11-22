package l03.p01547;

// 주소: https://www.acmicpc.net/problem/1547
// 제목: 공
// 결과: 맞았습니다!!
// 메모리: 13020 KB
// 시간: 88 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()), x, y, i = 0, j = 0;
        int[] cups = { -1, 1, 2, 3 };
        StringTokenizer st;
        
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            
            for (int c = 1; c < cups.length; c++) {
                if (cups[c] == x) {
                    i = c;
                }
                if (cups[c] == y) {
                    j = c;
                }
            }
            
            cups[0] = cups[i];
            cups[i] = cups[j];
            cups[j] = cups[0];
        }
        
        br.close();
        System.out.println(cups[1]);
    }
}
