package l04.p11721;

// 주소: https://www.acmicpc.net/problem/11721
// 제목: 열 개씩 끊어 출력하기
// 결과: 맞았습니다!!
// 메모리: 11472 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length() / 10 + 1; i++) {
            sb.append(s.substring(i * 10, Math.min((i + 1) * 10, s.length())))
                    .append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
