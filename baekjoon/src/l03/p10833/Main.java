package l03.p10833;

// 주소: https://www.acmicpc.net/problem/10833
// 제목: 사과
// 결과: 맞았습니다!!
// 메모리: 13144 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), s, a, count = 0;
        StringTokenizer st;
        
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            count += a % s;
        }
        
        br.close();
        System.out.println(count);
    }
}
