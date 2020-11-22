package l03.p16673;

// 주소: https://www.acmicpc.net/problem/16673
// 제목: 고려대학교에는 공식 와인이 있다
// 결과: 맞았습니다!!
// 메모리: 11504 KB
// 시간: 80 ms

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
        int c = Integer.parseInt(st.nextToken()),
                k = Integer.parseInt(st.nextToken()),
                p = Integer.parseInt(st.nextToken()), w = 0;
        
        for (int i = 1; i <= c; i++) {
            w += k * i + p * i * i;
        }
        
        System.out.println(w);
    }
}
