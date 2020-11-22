package l02.p02530;

// 주소: https://www.acmicpc.net/problem/2530
// 제목: 인공지능 시계
// 결과: 맞았습니다!!
// 메모리: 12984 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken())
                + Integer.parseInt(br.readLine());
        br.close();
        
        while (s >= 60) {
            s -= 60;
            m++;
        }
        
        while (m >= 60) {
            m -= 60;
            h++;
        }
        
        System.out.println((h % 24) + " " + m + " " + s);
    }
}
