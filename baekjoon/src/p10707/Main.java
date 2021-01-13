package p10707;

// 주소: https://www.acmicpc.net/problem/10707
// 제목: 수도요금
// 결과: 맞았습니다!!
// 메모리: 12924 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        br.close();
        
        X *= P;
        
        if (P <= C) {
            Y = B;
        } else {
            Y = (P - C) * Y + B;
        }
        
        System.out.println(Math.min(X, Y));
    }
}
