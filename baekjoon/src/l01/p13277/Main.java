package l01.p13277;

// 주소: https://www.acmicpc.net/problem/13277
// 제목: 큰 수 곱셈
// 결과: 맞았습니다!!
// 메모리: 353280 KB
// 시간: 6492 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        br.close();
        
        System.out.println(new BigInteger(st.nextToken())
                .multiply(new BigInteger(st.nextToken())));
    }
}
