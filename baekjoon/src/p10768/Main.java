package p10768;

// 주소: https://www.acmicpc.net/problem/10768
// 제목: 특별한 날
// 결과: 맞았습니다!!
// 메모리: 12872 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int date = Integer.parseInt(br.readLine()) * 32
                + Integer.parseInt(br.readLine());
        
        System.out.println(
                date < 82 ? "Before" : date > 82 ? "After" : "Special");
        br.close();
    }
}
