package l02.p14623;

// 주소: https://www.acmicpc.net/problem/14623
// 제목: 감정이입
// 결과: 맞았습니다!!
// 메모리: 13080 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(new BigInteger(br.readLine(), 2)
                .multiply(new BigInteger(br.readLine(), 2)).toString(2));
        br.close();
    }
}
