package l02.p06778;

// 주소: https://www.acmicpc.net/problem/6778
// 제목: Which Alien?
// 결과: 맞았습니다!!
// 메모리: 12932 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()),
                e = Integer.parseInt(br.readLine());
        br.close();
        
        if (a >= 3 && e <= 4) {
            System.out.println("TroyMartian");
        }
        if (a <= 6 && e >= 2) {
            System.out.println("VladSaturnian");
        }
        if (a <= 2 && e <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}
