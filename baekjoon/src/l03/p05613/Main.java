package l03.p05613;

// 주소: https://www.acmicpc.net/problem/5613
// 제목: 계산기 프로그램
// 결과: 맞았습니다!!
// 메모리: 12912 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());
        char operator = br.readLine().charAt(0);
        
        while (operator != '=') {
            switch (operator) {
                case '+':
                    result += Integer.parseInt(br.readLine());
                    break;
                case '-':
                    result -= Integer.parseInt(br.readLine());
                    break;
                case '*':
                    result *= Integer.parseInt(br.readLine());
                    break;
                default:
                    result /= Integer.parseInt(br.readLine());
                    break;
            }
            
            operator = br.readLine().charAt(0);
        }
        
        br.close();
        System.out.println(result);
    }
}
