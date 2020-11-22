package l05.p01032;

// 주소: https://www.acmicpc.net/problem/1032
// 제목: 명령 프롬프트
// 결과: 맞았습니다!!
// 메모리: 13052 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];
        boolean isSame;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            s[i] = br.readLine();
        }
        
        for (int i = 0; i < s[0].length(); i++) {
            isSame = true;
            
            for (int j = 0; j < N - 1; j++) {
                if (s[j].charAt(i) != s[j + 1].charAt(i)) {
                    isSame = false;
                    break;
                }
            }
            
            if (isSame) {
                sb.append(s[0].charAt(i));
            } else {
                sb.append("?");
            }
        }
        
        br.close();
        System.out.print(sb);
    }
}
