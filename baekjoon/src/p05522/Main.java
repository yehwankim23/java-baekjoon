package p05522;

// 주소: https://www.acmicpc.net/problem/5522
// 제목: 카드 게임
// 결과: 맞았습니다!!
// 메모리: 12944 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(Integer.parseInt(br.readLine())
                + Integer.parseInt(br.readLine())
                + Integer.parseInt(br.readLine())
                + Integer.parseInt(br.readLine())
                + Integer.parseInt(br.readLine()));
        br.close();
    }
}
