package l01.p05554;

// 주소: https://www.acmicpc.net/problem/5554
// 제목: 심부름 가는 길
// 결과: 맞았습니다!!
// 메모리: 12896 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int sum;
        
        sum = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine())
                + Integer.parseInt(br.readLine())
                + Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(sum / 60 + "\n" + sum % 60);
    }
}
