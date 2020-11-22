package l03.p09316;

// 주소: https://www.acmicpc.net/problem/9316
// 제목: Hello Judge
// 결과: 맞았습니다!!
// 메모리: 12816 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= N; i++) {
            sb.append("Hello World, Judge ").append(i).append("!\n");
        }
        
        System.out.print(sb);
    }
}
