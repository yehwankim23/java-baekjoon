package p14924;

// 주소: https://www.acmicpc.net/problem/14924
// 제목: 폰 노이만과 파리
// 결과: 맞았습니다!!
// 메모리: 12800 KB
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
        int S = Integer.parseInt(st.nextToken());
        
        System.out.println(Integer.parseInt(st.nextToken())
                * Integer.parseInt(st.nextToken()) / (2 * S));
    }
}
