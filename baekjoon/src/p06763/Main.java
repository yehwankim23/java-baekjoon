package p06763;

// 주소: https://www.acmicpc.net/problem/6763
// 제목: Speed fines are not fine!
// 결과: 맞았습니다!!
// 메모리: 11380 KB
// 시간: 208 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int o = Integer.parseInt(br.readLine())
                - Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(
                o >= 0 ? "Congratulations, you are within the speed limit!"
                        : o >= -20 ? "You are speeding and your fine is $100."
                        : o >= -30 ? "You are speeding and your fine is $270."
                        : "You are speeding and your fine is $500.");
    }
}
