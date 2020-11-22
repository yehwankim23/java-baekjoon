package l02.p16204;

// 주소: https://www.acmicpc.net/problem/16204
// 제목: 카드 뽑기
// 결과: 맞았습니다!!
// 메모리: 12984 KB
// 시간: 84 ms

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
        int N = Integer.parseInt(st.nextToken()),
                M = Integer.parseInt(st.nextToken()),
                K = Integer.parseInt(st.nextToken());
        
        System.out.println(Math.min(M, K) + Math.min(N - M, N - K));
    }
}
