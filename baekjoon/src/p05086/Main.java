package p05086;

// 주소: https://www.acmicpc.net/problem/5086
// 제목: 배수와 약수
// 결과: 맞았습니다!!
// 메모리: 12896 KB
// 시간: 72 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a, b;
        
        while ((a = Integer.parseInt(st.nextToken())) != 0) {
            b = Integer.parseInt(st.nextToken());
            System.out.println(b % a == 0 ? "factor" : a % b == 0 ? "multiple"
                    : "neither");
            
            st = new StringTokenizer(br.readLine());
        }
        
        br.close();
    }
}
