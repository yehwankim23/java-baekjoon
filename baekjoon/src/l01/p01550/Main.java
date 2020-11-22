package l01.p01550;

// 주소: https://www.acmicpc.net/problem/1550
// 제목: 16진수
// 결과: 맞았습니다!!
// 메모리: 12960 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(Integer.parseInt(br.readLine(), 16));
        br.close();
    }
}
