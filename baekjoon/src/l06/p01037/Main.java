package l06.p01037;

// 주소: https://www.acmicpc.net/problem/1037
// 제목: 약수
// 결과: 맞았습니다!!
// 메모리: 11544 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        int min = 1000001, max = 1;
        
        while (n-- > 0) {
            int temp = Integer.parseInt(st.nextToken());
            
            if (temp < min) {
                min = temp;
            }
            
            if (temp > max) {
                max = temp;
            }
        }
        
        System.out.println(min * max);
    }
}
