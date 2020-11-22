package l02.p16017;

// 주소: https://www.acmicpc.net/problem/16017
// 제목: Telemarketer or not?
// 결과: 맞았습니다!!
// 메모리: 14304 KB
// 시간: 108 ms

import java.util.*;

class Main {
    @SuppressWarnings("resource") // 숏코딩
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print(
                s.nextInt() > 7 & s.nextInt() == s.nextInt() & s.nextInt() > 7
                        ? "ignore" : "answer");
    }
}
