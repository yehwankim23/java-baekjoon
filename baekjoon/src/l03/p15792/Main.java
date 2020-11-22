package l03.p15792;

// 주소: https://www.acmicpc.net/problem/15792
// 제목: A/B - 2
// 결과: 2000점
// 메모리: 11848 KB
// 시간: 116 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        BigDecimal a = new BigDecimal(st.nextToken()),
                b = new BigDecimal(st.nextToken());
        
        System.out.println(a.divide(b, 1024, BigDecimal.ROUND_HALF_UP));
    }
}
