package l01.p11382;

// 주소: https://www.acmicpc.net/problem/11382
// 제목: 꼬마 정민
// 결과: 맞았습니다!!
// 메모리: 12940 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        br.close();
        
        System.out.println(
                Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken())
                        + Long.parseLong(st.nextToken()));
    }
}
