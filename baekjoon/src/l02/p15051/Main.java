package l02.p15051;

// 주소: https://www.acmicpc.net/problem/15051
// 제목: Máquina de café
// 결과: 맞았습니다!!
// 메모리: 12932 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine()),
                a2 = Integer.parseInt(br.readLine()),
                a3 = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(Math.min(Math.min(a1 * 4 + a2 * 2, a1 * 2 + a3 * 2),
                a2 * 2 + a3 * 4));
    }
}
