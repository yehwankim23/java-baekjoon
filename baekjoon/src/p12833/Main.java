package p12833;

// 주소: https://www.acmicpc.net/problem/12833
// 제목: XORXORXOR
// 결과: 맞았습니다!!
// 메모리: 13204 KB
// 시간: 380 ms

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
        
        while (C-- > 0) {
            A ^= B;
        }
        
        System.out.println(A);
    }
}
