package p16600;

// 주소: https://www.acmicpc.net/problem/16600
// 제목: Contemporary Art
// 결과: 맞았습니다!!
// 메모리: 13068 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out
                .println(Math.pow(Double.parseDouble(br.readLine()), 0.5) * 4);
        br.close();
    }
}
