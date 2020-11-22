package l04.p05585;

// 주소: https://www.acmicpc.net/problem/5585
// 제목: 거스름돈
// 결과: 맞았습니다!!
// 메모리: 11440 KB
// 시간: 124 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine());
        br.close();
        int count = 0;
        
        while (n >= 500) {
            n -= 500;
            count++;
        }
        
        while (n >= 100) {
            n -= 100;
            count++;
        }
        
        while (n >= 50) {
            n -= 50;
            count++;
        }
        
        while (n >= 10) {
            n -= 10;
            count++;
        }
        
        while (n >= 5) {
            n -= 5;
            count++;
        }
        
        while (n >= 1) {
            n -= 1;
            count++;
        }
        
        System.out.println(count);
    }
}
