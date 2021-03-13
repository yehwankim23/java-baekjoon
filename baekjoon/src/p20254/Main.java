package p20254;

// 주소: https://www.acmicpc.net/problem/20254
// 제목: Site Score
// 결과: 맞았습니다!!
// 메모리: 11540 KB
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
        
        System.out.println(56 * Integer.parseInt(st.nextToken())
                + 24 * Integer.parseInt(st.nextToken())
                + 14 * Integer.parseInt(st.nextToken())
                + 6 * Integer.parseInt(st.nextToken()));
    }
}
