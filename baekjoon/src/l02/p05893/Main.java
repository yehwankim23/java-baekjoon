package l02.p05893;

// 주소: https://www.acmicpc.net/problem/5893
// 제목: 17배
// 결과: 맞았습니다!!
// 메모리: 13084 KB
// 시간: 88 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(new BigInteger(br.readLine(), 2)
                .multiply(BigInteger.valueOf(17)).toString(2));
        br.close();
    }
}
