package l02.p02525;

// 주소: https://www.acmicpc.net/problem/2525
// 제목: 오븐 시계
// 결과: 맞았습니다!!
// 메모리: 12996 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int h, m;
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
        br.close();
        
        while (m >= 60) {
            m -= 60;
            h++;
        }
        
        System.out.println((h % 24) + " " + m);
    }
}
