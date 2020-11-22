package l02.p13610;

// 주소: https://www.acmicpc.net/problem/13610
// 제목: Volta
// 결과: 맞았습니다!!
// 메모리: 14304 KB
// 시간: 112 ms

import java.util.*;

class Main {
    @SuppressWarnings("resource") // 숏코딩
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        float X = s.nextInt(), Y = s.nextInt();
        System.out.print((int) Math.ceil(Y / (Y - X)));
    }
}
