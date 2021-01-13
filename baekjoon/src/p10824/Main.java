package p10824;

// 주소: https://www.acmicpc.net/problem/10824
// 제목: 네 수
// 결과: 맞았습니다!!
// 메모리: 12984 KB
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
        
        System.out.println(Long.parseLong(st.nextToken() + st.nextToken())
                + Long.parseLong(st.nextToken() + st.nextToken()));
        br.close();
    }
}
