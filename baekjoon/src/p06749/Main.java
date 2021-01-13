package p06749;

// 주소: https://www.acmicpc.net/problem/6749
// 제목: Next in line
// 결과: 맞았습니다!!
// 메모리: 12760 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int Y = Integer.parseInt(br.readLine()),
                M = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(M + M - Y);
    }
}
