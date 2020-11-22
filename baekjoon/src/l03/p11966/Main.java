package l03.p11966;

// 주소: https://www.acmicpc.net/problem/11966
// 제목: 2의 제곱인가?
// 결과: 맞았습니다!!
// 메모리: 11540 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println((n & (n - 1)) == 0 ? 1 : 0);
    }
}
