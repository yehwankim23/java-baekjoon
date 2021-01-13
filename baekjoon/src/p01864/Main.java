package p01864;

// 주소: https://www.acmicpc.net/problem/1864
// 제목: 문어 숫자
// 결과: 맞았습니다!!
// 메모리: 11340 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder sb = new StringBuilder();
        
        while (!(s = br.readLine()).equals("#")) {
            int l = s.length();
            int n = 0;
            
            for (int i = 0; i < l; i++) {
                n *= 8;
                
                switch (s.charAt(i)) {
                    case '-':
                        //
                        break;
                    case '\\':
                        n += 1;
                        break;
                    case '(':
                        n += 2;
                        break;
                    case '@':
                        n += 3;
                        break;
                    case '?':
                        n += 4;
                        break;
                    case '>':
                        n += 5;
                        break;
                    case '&':
                        n += 6;
                        break;
                    case '%':
                        n += 7;
                        break;
                    case '/':
                        n += -1;
                        break;
                    default:
                        System.exit(-1);
                }
            }
            
            sb.append(n).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
