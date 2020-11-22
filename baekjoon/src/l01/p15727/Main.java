package l01.p15727;

// 주소: https://www.acmicpc.net/problem/15727
// 제목: 조별과제를 하려는데 조장이 사라졌다
// 결과: 맞았습니다!!
// 메모리: 12952 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println((Integer.parseInt(br.readLine()) - 1) / 5 + 1);
        br.close();
    }
}
