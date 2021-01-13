package p18108;

// 주소: https://www.acmicpc.net/problem/18108
// 제목: 1998년생인 내가 태국에서는 2541년생?!
// 결과: 맞았습니다!!
// 메모리: 12940 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(Integer.parseInt(br.readLine()) - 543);
    }
}
