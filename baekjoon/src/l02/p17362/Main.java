package l02.p17362;

// 주소: https://www.acmicpc.net/problem/17362
// 제목: 수학은 체육과목 입니다 2
// 결과: 맞았습니다!!
// 메모리: 12988 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) - 1;
        br.close();
        
        System.out.println(((n / 4 % 2 == 0) ? n % 4 : 4 - (n % 4)) + 1);
    }
}
