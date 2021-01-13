package p01076;

// 주소: https://www.acmicpc.net/problem/1076
// 제목: 저항
// 결과: 맞았습니다!!
// 메모리: 13000 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println((Color.valueOf(br.readLine()).ordinal() * 10
                + Color.valueOf(br.readLine()).ordinal())
                * (long) Math.pow(10, Color.valueOf(br.readLine()).ordinal()));
        br.close();
    }
    
    private enum Color {
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }
}
