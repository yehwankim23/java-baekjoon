package l03.p02965;

// 주소: https://www.acmicpc.net/problem/2965
// 제목: 캥거루 세마리
// 결과: 맞았습니다!!
// 메모리: 12904 KB
// 시간: 88 ms

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
        int A = Integer.parseInt(st.nextToken()),
                B = Integer.parseInt(st.nextToken()),
                C = Integer.parseInt(st.nextToken());
        
        System.out.println(Math.max(B - A, C - B) - 1);
    }
}
