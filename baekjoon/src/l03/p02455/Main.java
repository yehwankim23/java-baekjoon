package l03.p02455;

// 주소: https://www.acmicpc.net/problem/2455
// 제목: 지능형 기차
// 결과: 맞았습니다!!
// 메모리: 12868 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int i = 4, count = 0, max = 0;
        StringTokenizer st;
        
        while (i-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            count = count - Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken());
            
            if (count > 10000) {
                count = 10000;
            }
            if (count > max) {
                max = count;
            }
        }
        
        br.close();
        System.out.println(max);
    }
}
