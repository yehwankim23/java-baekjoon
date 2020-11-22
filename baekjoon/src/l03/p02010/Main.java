package l03.p02010;

// 주소: https://www.acmicpc.net/problem/2010
// 제목: 플러그
// 결과: 맞았습니다!!
// 메모리: 37904 KB
// 시간: 212 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), sum = 1;
        
        while (n-- > 0) {
            sum += Integer.parseInt(br.readLine()) - 1;
        }
        
        br.close();
        System.out.println(sum);
    }
}
