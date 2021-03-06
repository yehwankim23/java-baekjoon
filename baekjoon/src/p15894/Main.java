package p15894;

// 주소: https://www.acmicpc.net/problem/15894
// 제목: 수학은 체육과목 입니다
// 결과: 맞았습니다!!
// 메모리: 13084 KB
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
                new BigInteger(br.readLine()).multiply(new BigInteger("4")));
        br.close();
    }
}
