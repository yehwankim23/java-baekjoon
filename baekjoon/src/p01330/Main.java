package p01330;

// 주소: https://www.acmicpc.net/problem/1330
// 제목: 두 수 비교하기
// 결과: 맞았습니다!!
// 메모리: 14300 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
        
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }
    }
}
