package p02576;


// 주소: https://www.acmicpc.net/problem/2576
// 제목: 홀수
// 결과: 맞았습니다!!
// 메모리: 12936 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = 7, input, count = 0, sum = 0, min = 101;
        
        while (n-- > 0) {
            if ((input = Integer.parseInt(br.readLine())) % 2 == 1) {
                count++;
                sum += input;
                
                if (input < min) {
                    min = input;
                }
            }
        }
        
        br.close();
        System.out.println(count == 0 ? -1 : sum + "\n" + min);
    }
}
