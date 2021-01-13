package p09550;

// 주소: https://www.acmicpc.net/problem/9550
// 제목: 아이들은 사탕을 좋아해
// 결과: 맞았습니다!!
// 메모리: 12088 KB
// 시간: 180 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()),
                    k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int count = 0;
            
            while (n-- > 0) {
                count += Integer.parseInt(st.nextToken()) / k;
            }
            
            sb.append(count).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
