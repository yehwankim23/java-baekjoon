package l03.p02863;

// 주소: https://www.acmicpc.net/problem/2863
// 제목: 이게 분수?
// 결과: 맞았습니다!!
// 메모리: 11540 KB
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
        double a = Double.parseDouble(st.nextToken()),
                b = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        double c = Double.parseDouble(st.nextToken()),
                d = Double.parseDouble(st.nextToken()), max = a / c + b / d;
        int count = 0;
        
        if (c / d + a / b > max) {
            max = c / d + a / b;
            count = 1;
        }
        
        if (d / b + c / a > max) {
            max = d / b + c / a;
            count = 2;
        }
        
        if (b / a + d / c > max) {
            max = b / a + d / c;
            count = 3;
        }
        
        System.out.println(count);
    }
}
