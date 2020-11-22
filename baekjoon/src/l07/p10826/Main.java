package l07.p10826;

// 주소: https://www.acmicpc.net/problem/10826
// 제목: 피보나치 수 4
// 결과: 맞았습니다!!
// 메모리: 18708 KB
// 시간: 140 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        br.close();
        
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        
        if (n.equals(BigInteger.ZERO)) {
            System.out.println(0);
        } else {
            while (n.compareTo(BigInteger.ONE) == 1) {
                BigInteger temp = b;
                b = b.add(a);
                a = temp;
                n = n.subtract(BigInteger.ONE);
            }
            
            System.out.println(b);
        }
    }
}
