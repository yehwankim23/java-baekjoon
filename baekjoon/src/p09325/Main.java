package p09325;

// 주소: https://www.acmicpc.net/problem/9325
// 제목: 얼마?
// 결과: 맞았습니다!!
// 메모리: 27228 KB
// 시간: 240 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), price, n;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            price = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                price += Integer.parseInt(st.nextToken())
                        * Integer.parseInt(st.nextToken());
            }
            
            sb.append(price).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
