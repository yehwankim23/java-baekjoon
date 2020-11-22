package l02.p16428;

// 주소: https://www.acmicpc.net/problem/16428
// 제목: A/B - 3
// 결과: 630점
// 메모리: 16540 KB
// 시간: 200 ms

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
        br.close();
        BigInteger A = new BigInteger(st.nextToken()),
                B = new BigInteger(st.nextToken());
        
        System.out.println(
                A.subtract(A.mod(B.abs())).divide(B) + "\n" + A.mod(B.abs()));
    }
}
