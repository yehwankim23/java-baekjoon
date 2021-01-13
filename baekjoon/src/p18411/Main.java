package p18411;

// 주소: https://www.acmicpc.net/problem/18411
// 제목: 試験
// 결과: 맞았습니다!!
// 메모리: 14304 KB
// 시간: 112 ms

import java.util.*;

class Main {
    @SuppressWarnings("resource") // 숏코딩
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt(), B = s.nextInt(), C = s.nextInt();
        System.out.print(A + B + C - Math.min(Math.min(A, B), C));
    }
}
