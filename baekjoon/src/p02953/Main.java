package p02953;

// 주소: https://www.acmicpc.net/problem/2953
// 제목: 나는 요리사다
// 결과: 맞았습니다!!
// 메모리: 12916 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, sum = 0, max = 0, num = 0;
        StringTokenizer st;
        
        while (i++ < 5) {
            st = new StringTokenizer(br.readLine());
            sum = Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken());
            
            if (sum > max) {
                max = sum;
                num = i;
            }
        }
        
        br.close();
        System.out.println(num + " " + max);
    }
}
