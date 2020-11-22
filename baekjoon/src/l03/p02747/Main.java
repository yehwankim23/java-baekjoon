package l03.p02747;

// 주소: https://www.acmicpc.net/problem/2747
// 제목: 피보나치 수
// 결과: 맞았습니다!!
// 메모리: 12940 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), o = 0, p = 1, t;
        br.close();
        
        if (n == 0) {
            System.out.println(o);
        }
        
        while (n-- > 1) {
            t = p;
            p += o;
            o = t;
        }
        
        System.out.println(p);
    }
}
