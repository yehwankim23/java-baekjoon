package l02.p03004;

// 주소: https://www.acmicpc.net/problem/3004
// 제목: 체스판 조각
// 결과: 맞았습니다!!
// 메모리: 12932 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) + 3;
        br.close();
        
        System.out
                .println((N % 2 == 0) ? N / 2 * (N / 2 - 1) : N / 2 * (N / 2));
    }
}
