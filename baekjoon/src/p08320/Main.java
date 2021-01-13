package p08320;

// 주소: https://www.acmicpc.net/problem/8320
// 제목: 직사각형을 만드는 방법
// 결과: 맞았습니다!!
// 메모리: 12928 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), l = 1, w, count = 0;
        br.close();
        
        while (l <= n) {
            w = l;
            
            while (l * w++ <= n) {
                count++;
            }
            
            l++;
        }
        
        System.out.println(count);
    }
}
