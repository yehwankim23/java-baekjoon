package l03.p02163;

// 주소: https://www.acmicpc.net/problem/2163
// 제목: 초콜릿 자르기
// 결과: 맞았습니다!!
// 메모리: 12960 KB
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
        
        System.out.println(Integer.parseInt(st.nextToken())
                * Integer.parseInt(st.nextToken()) - 1);
    }
}
