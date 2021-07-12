package p01436;

// 주소: https://www.acmicpc.net/problem/1436
// 제목: 영화감독 숌
// 결과: 맞았습니다!!
// 메모리: 85204 KB
// 시간: 280 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int number = 666;

        while (n > 0) {
            if (Integer.toString(number).contains("666")) {
                n--;
            }

            number++;
        }

        System.out.println(--number);
    }
}
