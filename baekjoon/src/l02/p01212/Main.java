package l02.p01212;

// 주소: https://www.acmicpc.net/problem/1212
// 제목: 8진수 2진수
// 결과: 맞았습니다!!
// 메모리: 92644 KB
// 시간: 2196 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(new BigInteger(br.readLine(), 8).toString(2));
        br.close();
    }
}
