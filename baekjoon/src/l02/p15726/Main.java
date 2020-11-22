package l02.p15726;

// 주소: https://www.acmicpc.net/problem/15726
// 제목: 이칙연산
// 결과: 맞았습니다!!
// 메모리: 12844 KB
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
        double A = Integer.parseInt(st.nextToken()),
                B = Integer.parseInt(st.nextToken()),
                C = Integer.parseInt(st.nextToken());
        
        System.out.println((int) Math.max(A * B / C, A / B * C));
    }
}
