package p01075;

// 주소: https://www.acmicpc.net/problem/1075
// 제목: 나누기
// 결과: 맞았습니다!!
// 메모리: 13184 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) / 100 * 100,
                F = Integer.parseInt(br.readLine());
        br.close();
        
        for (int i = 0; i < 100; i++) {
            if ((N + i) % F == 0) {
                System.out.printf("%02d", i);
                break;
            }
        }
    }
}
