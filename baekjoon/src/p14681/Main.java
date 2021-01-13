package p14681;

// 주소: https://www.acmicpc.net/problem/14681
// 제목: 사분면 고르기
// 결과: 맞았습니다!!
// 메모리: 14280 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();
        
        if (y > 0) {
            if (x > 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else {
            if (x < 0) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        }
    }
}
