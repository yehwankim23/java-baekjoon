package l04.p02743;

// 주소: https://www.acmicpc.net/problem/2743
// 제목: 단어 길이 재기
// 결과: 맞았습니다!!
// 메모리: 11456 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(br.readLine().length());
        br.close();
    }
}
