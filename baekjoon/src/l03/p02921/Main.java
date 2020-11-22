package l03.p02921;

// 주소: https://www.acmicpc.net/problem/2921
// 제목: 도미노
// 결과: 맞았습니다!!
// 메모리: 11492 KB
// 시간: 88 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), c = 0;
        br.close();
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i * 2; j++) {
                c += j;
            }
        }
        
        System.out.println(c);
    }
}
