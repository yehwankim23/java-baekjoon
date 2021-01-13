package p15740;

// 주소: https://www.acmicpc.net/problem/15740
// 제목: A+B - 9
// 결과: 100점
// 메모리: 16452 KB
// 시간: 196 ms

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
        BigInteger A, B;
        
        st = new StringTokenizer(br.readLine());
        br.close();
        A = new BigInteger(st.nextToken());
        B = new BigInteger(st.nextToken());
        
        System.out.println(A.add(B));
    }
}
