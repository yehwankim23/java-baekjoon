package l03.p10409;

// 주소: https://www.acmicpc.net/problem/10409
// 제목: 서버
// 결과: 맞았습니다!!
// 메모리: 11540 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()),
                t = Integer.parseInt(st.nextToken()), count = 0;
        st = new StringTokenizer(br.readLine());
        br.close();
        
        for (int sum = 0; count < n; count++) {
            sum += Integer.parseInt(st.nextToken());
            
            if (sum > t) {
                break;
            }
        }
        
        System.out.println(count);
    }
}
