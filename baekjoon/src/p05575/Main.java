package p05575;

// 주소: https://www.acmicpc.net/problem/5575
// 제목: 타임 카드
// 결과: 맞았습니다!!
// 메모리: 12904 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int h, m, s;
        
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken()) - h;
            m = Integer.parseInt(st.nextToken()) - m;
            s = Integer.parseInt(st.nextToken()) - s;
            
            if (s < 0) {
                m--;
                s += 60;
            }
            if (m < 0) {
                h--;
                m += 60;
            }
            
            System.out.println(h + " " + m + " " + s);
        }
        br.close();
    }
}
