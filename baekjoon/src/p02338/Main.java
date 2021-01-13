package p02338;

// 주소: https://www.acmicpc.net/problem/2338
// 제목: 긴자리 계산
// 결과: 맞았습니다!!
// 메모리: 14496 KB
// 시간: 96 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A, B;
        
        A = new BigInteger(br.readLine());
        B = new BigInteger(br.readLine());
        
        System.out.println(
                A.add(B) + "\n" + A.subtract(B) + "\n" + A.multiply(B));
    }
}
