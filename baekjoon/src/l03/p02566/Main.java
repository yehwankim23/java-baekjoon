package l03.p02566;

// 주소: https://www.acmicpc.net/problem/2566
// 제목: 최댓값
// 결과: 맞았습니다!!
// 메모리: 13028 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int curr, max = 0, row = 0, col = 0;
        
        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 1; j <= 9; j++) {
                curr = Integer.parseInt(st.nextToken());
                
                if (curr > max) {
                    max = curr;
                    row = i;
                    col = j;
                }
            }
        }
        
        br.close();
        System.out.println(max + "\n" + row + " " + col);
    }
}
