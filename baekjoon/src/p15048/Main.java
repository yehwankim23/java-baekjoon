package p15048;

// 주소: https://www.acmicpc.net/problem/15048
// 제목: Jogo de Boca
// 결과: 맞았습니다!!
// 메모리: 13060 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(
                new BigInteger(br.readLine()).mod(BigInteger.valueOf(3)));
        br.close();
    }
}
