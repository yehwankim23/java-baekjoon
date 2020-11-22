package l05.p01259;

// 주소: https://www.acmicpc.net/problem/1259
// 제목: 팰린드롬수
// 결과: 맞았습니다!!
// 메모리: 12788 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        input = "";
        
        while (!(input = br.readLine()).equals("0")) {
            if (input.equals(new StringBuilder(input).reverse().toString())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        br.close();
    }
}
