package l07.p09012;

// 주소: https://www.acmicpc.net/problem/9012
// 제목: 괄호
// 결과: 맞았습니다!!
// 메모리: 16532 KB
// 시간: 152 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int T, length;
        String PS;
        
        T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            PS = br.readLine();
            length = PS.length();
            
            for (int j = 0; j < length / 2; j++) {
                PS = PS.replaceFirst("\\(\\)", "");
            }
            
            if (PS.equals("")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        br.close();
    }
}
