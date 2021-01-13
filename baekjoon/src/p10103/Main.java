package p10103;

// 주소: https://www.acmicpc.net/problem/10103
// 제목: 주사위 게임
// 결과: 맞았습니다!!
// 메모리: 12772 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), c = 100, s = 100, a, b;
        StringTokenizer st;
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            if (a < b) {
                c -= b;
            } else if (b < a) {
                s -= a;
            }
        }
        
        br.close();
        System.out.println(c + "\n" + s);
    }
}
