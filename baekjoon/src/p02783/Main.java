package p02783;

// 주소: https://www.acmicpc.net/problem/2783
// 제목: 삼각 김밥
// 결과: 맞았습니다!!
// 메모리: 11664 KB
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
        double min = Double.parseDouble(st.nextToken())
                / Double.parseDouble(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            double temp = Double.parseDouble(st.nextToken())
                    / Double.parseDouble(st.nextToken());
            
            if (temp < min) {
                min = temp;
            }
        }
        
        br.close();
        System.out.println(min * 1000);
    }
}
