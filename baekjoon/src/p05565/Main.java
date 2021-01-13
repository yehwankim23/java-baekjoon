package p05565;

// 주소: https://www.acmicpc.net/problem/5565
// 제목: 영수증
// 결과: 맞았습니다!!
// 메모리: 12920 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine()), i = 9;
        
        while (i-- > 0) {
            p -= Integer.parseInt(br.readLine());
        }
        
        br.close();
        System.out.println(p);
    }
}
