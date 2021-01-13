package p10156;

// 주소: https://www.acmicpc.net/problem/10156
// 제목: 과자
// 결과: 맞았습니다!!
// 메모리: 12956 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken())
                * Integer.parseInt(st.nextToken())
                - Integer.parseInt(st.nextToken());
        br.close();
        
        if (m > 0) {
            System.out.println(m);
        } else {
            System.out.println(0);
        }
    }
}
