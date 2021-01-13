package p18414;

// 주소: https://www.acmicpc.net/problem/18414
// 제목: X に最も近い値
// 결과: 맞았습니다!!
// 메모리: 12972 KB
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
        int X = Integer.parseInt(st.nextToken()),
                L = Integer.parseInt(st.nextToken()),
                R = Integer.parseInt(st.nextToken());
        
        System.out.println(L <= X && X <= R ? X
                : Math.abs(X - L) < Math.abs(X - R) ? L : R);
    }
}
