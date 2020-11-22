package l03.p01964;

// 주소: https://www.acmicpc.net/problem/1964
// 제목: 오각형, 오각형, 오각형…
// 결과: 맞았습니다!!
// 메모리: 12984 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(BigInteger.valueOf(N).add(BigInteger.valueOf(3))
                .multiply(BigInteger.valueOf(N)).divide(BigInteger.valueOf(2))
                .multiply(BigInteger.valueOf(3))
                .subtract(BigInteger.valueOf(N).multiply(BigInteger.valueOf(2)))
                .add(BigInteger.ONE).mod(BigInteger.valueOf(45678)));
    }
}
