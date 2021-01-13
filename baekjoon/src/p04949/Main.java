package p04949;

// 주소: https://www.acmicpc.net/problem/4949
// 제목: 균형잡힌 세상
// 결과: 맞았습니다!!
// 메모리: 127096 KB
// 시간: 680 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder sb = new StringBuilder();
        
        while (!(s = br.readLine()).equals(".")) {
            s = s.replaceAll("\\w|\\s", "");
            int l = s.length() / 2;
            
            while (l-- > 0) {
                s = s.replaceFirst("\\(\\)", "");
                s = s.replaceFirst("\\[\\]", "");
            }
            
            if (s.equals(".")) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        
        br.close();
        System.out.print(sb);
    }
}
