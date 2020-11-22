package l04.p10102;

// 주소: https://www.acmicpc.net/problem/10102
// 제목: 개표
// 결과: 맞았습니다!!
// 메모리: 11424 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine()), a = 0;
        
        for (int i = 0; i < v; i++) {
            if (br.read() == 'A') {
                a++;
            }
        }
        
        a *= 2;
        
        br.close();
        System.out.println(a > v ? "A" : a < v ? "B" : "Tie");
    }
}
