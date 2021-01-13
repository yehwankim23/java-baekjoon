package p05354;

// 주소: https://www.acmicpc.net/problem/5354
// 제목: J박스
// 결과: 맞았습니다!!
// 메모리: 11312 KB
// 시간: 72 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        sb.append("#");
                    } else {
                        sb.append("J");
                    }
                }
                
                sb.append("\n");
            }
            
            sb.append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
