package p10773;

// 주소: https://www.acmicpc.net/problem/10773
// 제목: 제로
// 결과: 맞았습니다!!
// 메모리: 23808 KB
// 시간: 192 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        IntStack intStack = new IntStack();
        int K, input;
        
        K = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < K; i++) {
            input = Integer.parseInt(br.readLine());
            
            if (input == 0) {
                intStack.pop();
            } else {
                intStack.push(input);
            }
        }
        
        br.close();
        System.out.println(intStack.sum());
    }
}
