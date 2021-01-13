package p08437;

// 주소: https://www.acmicpc.net/problem/8437
// 제목: Julka
// 결과: 맞았습니다!!
// 메모리: 13124 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BigInteger small, diff;
        
        small = new BigInteger(br.readLine());
        diff = new BigInteger(br.readLine());
        small = small.subtract(diff).divide(new BigInteger("2"));
        br.close();
        
        System.out.println(small.add(diff) + "\n" + small);
    }
}
