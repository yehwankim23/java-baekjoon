package l03.p02935;

// 주소: https://www.acmicpc.net/problem/2935
// 제목: 소음
// 결과: 맞았습니다!!
// 메모리: 13028 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine()), B;
        String O = br.readLine();
        B = new BigInteger(br.readLine());
        br.close();
        
        System.out.println(O.equals("+") ? A.add(B) : A.multiply(B));
    }
}
