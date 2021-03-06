package p02420;

// 주소: https://www.acmicpc.net/problem/2420
// 제목: 사파리월드
// 결과: 맞았습니다!!
// 메모리: 13104 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        System.out.println(new BigInteger(st.nextToken())
                .subtract(new BigInteger(st.nextToken())).abs());
        br.close();
    }
}
