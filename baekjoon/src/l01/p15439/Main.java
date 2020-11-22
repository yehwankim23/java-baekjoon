package l01.p15439;

// 주소: https://www.acmicpc.net/problem/15439
// 제목: Vera and Outfits
// 결과: 맞았습니다!!
// 메모리: 12948 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N;
        
        N = Integer.parseInt(br.readLine());
        
        System.out.println(N * N - N);
    }
}
