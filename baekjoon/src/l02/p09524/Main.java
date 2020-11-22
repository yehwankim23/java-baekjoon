package l02.p09524;

// 주소: https://www.acmicpc.net/problem/9524
// 제목: Beautiful Yekaterinburg
// 결과: 맞았습니다!!
// 메모리: 12840 KB
// 시간: 88 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(br.readLine());
        
        System.out.println(D == 1 ? 1 : D == 2 ? 7 : D == 3 ? 2 : 3);
        br.close();
    }
}
