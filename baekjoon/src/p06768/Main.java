package p06768;

// 주소: https://www.acmicpc.net/problem/6768
// 제목: Don’t pass me the ball!
// 결과: 맞았습니다!!
// 메모리: 11372 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(br.readLine()), count = 0;
        br.close();
        
        for (int i = 1; i < j - 2; i++) {
            for (int k = i + 1; k < j - 1; k++) {
                count += j - 1 - k;
            }
        }
        
        System.out.println(count);
    }
}
