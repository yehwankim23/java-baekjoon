package l01.p18301;

// 주소: https://www.acmicpc.net/problem/18301
// 제목: Rats
// 결과: 맞았습니다!!
// 메모리: 12968 KB
// 시간: 88 ms

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
        
        System.out
                .println((int) Math.floor((Integer.parseInt(st.nextToken()) + 1)
                        * (Integer.parseInt(st.nextToken()) + 1)
                        / (Integer.parseInt(st.nextToken()) + 1) - 1));
    }
}
