package p02355;

// 주소: https://www.acmicpc.net/problem/2355
// 제목: 시그마
// 결과: 맞았습니다!!
// 메모리: 11500 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        long a = Long.parseLong(st.nextToken()), aSign = a < 0 ? -1 : 1,
                b = Long.parseLong(st.nextToken()), bSign = b < 0 ? -1 : 1;
        
        a *= aSign;
        b *= bSign;
        
        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
            
            temp = aSign;
            aSign = bSign;
            bSign = temp;
        }
        
        long aSum = a * (a + 1) / 2 * aSign, bSum = b * (b + 1) / 2 * bSign;
        
        System.out.println(
                aSign == bSign ? bSum - aSum * aSign * bSign + a * aSign
                        : bSum - aSum * aSign * bSign);
    }
}
