package p15236;

// 주소: https://www.acmicpc.net/problem/15236
// 제목: Dominos
// 결과: 맞았습니다!!
// 메모리: 13208 KB
// 시간: 88 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), spots = 0;
        br.close();
        
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                spots += i + j;
            }
        }
        
        System.out.println(spots);
    }
}
