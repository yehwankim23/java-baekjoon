package p18005;

// 주소: https://www.acmicpc.net/problem/18005
// 제목: Even or Odd?
// 결과: 맞았습니다!!
// 메모리: 12972 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(n % 2 == 1 ? 0 : n / 2 % 2 == 1 ? 1 : 2);
    }
}
