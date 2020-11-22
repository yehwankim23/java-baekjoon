package l01.p10757;

// 주소: https://www.acmicpc.net/problem/10757
// 제목: 큰 수 A+B
// 결과: 맞았습니다!!
// 메모리: 16440 KB
// 시간: 192 ms

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
                .add(new BigInteger(st.nextToken())));
    }
}
