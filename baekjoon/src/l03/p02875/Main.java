package l03.p02875;

// 주소: https://www.acmicpc.net/problem/2875
// 제목: 대회 or 인턴
// 결과: 맞았습니다!!
// 메모리: 11496 KB
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
        int n = Integer.parseInt(st.nextToken()),
                m = Integer.parseInt(st.nextToken()),
                k = Integer.parseInt(st.nextToken());
        
        while (k-- > 0) {
            if (n > 2 * m) {
                n--;
            } else if (n < 2 * m) {
                m--;
            } else {
                if (k % 3 == 0) {
                    m--;
                } else {
                    n--;
                }
            }
        }
        
        System.out.println((int) Math.min(n / 2., m));
    }
}
