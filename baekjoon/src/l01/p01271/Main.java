package l01.p01271;

// 주소: https://www.acmicpc.net/problem/1271
// 제목: 엄청난 부자2
// 결과: 맞았습니다!!
// 메모리: 13288 KB
// 시간: 88 ms

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
        BigInteger n, m;
        
        st = new StringTokenizer(br.readLine());
        br.close();
        n = new BigInteger(st.nextToken());
        m = new BigInteger(st.nextToken());
        
        System.out.println(n.divide(m) + "\n" + n.remainder(m));
    }
}
