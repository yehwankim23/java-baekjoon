package p14652;

// 주소: https://www.acmicpc.net/problem/14652
// 제목: 나는 행복합니다~
// 결과: 맞았습니다!!
// 메모리: 13012 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int M, K;
        
        st = new StringTokenizer(br.readLine());
        br.close();
        Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        System.out.println((K / M) + " " + (K % M));
    }
}
