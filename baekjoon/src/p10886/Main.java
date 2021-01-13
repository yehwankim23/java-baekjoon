package p10886;

// 주소: https://www.acmicpc.net/problem/10886
// 제목: 0 = not cute / 1 = cute
// 결과: 맞았습니다!!
// 메모리: 12916 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), sum = 0;
        
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        
        br.close();
        System.out.println(
                sum * 2.0 / N < 1 ? "Junhee is not cute!" : "Junhee is cute!");
    }
}
