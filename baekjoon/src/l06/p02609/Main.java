package l06.p02609;

// 주소: https://www.acmicpc.net/problem/2609
// 제목: 최대공약수와 최소공배수
// 결과: 맞았습니다!!
// 메모리: 11348 KB
// 시간: 108 ms

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
        int a = Integer.parseInt(st.nextToken()),
                b = Integer.parseInt(st.nextToken()), c = a * b;
        
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        int r = a % b;
        
        while (r > 0) {
            a = b;
            b = r;
            r = a % b;
        }
        
        System.out.println(b);
        System.out.println(c / b);
    }
}
