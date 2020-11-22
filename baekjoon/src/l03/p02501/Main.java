package l03.p02501;

// 주소: https://www.acmicpc.net/problem/2501
// 제목: 약수 구하기
// 결과: 맞았습니다!!
// 메모리: 11500 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken()),
                k = Integer.parseInt(st.nextToken()), count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            
            if (count == k) {
                System.out.println(i);
                break;
            }
        }
        
        if (count < k) {
            System.out.println(0);
        }
    }
}
