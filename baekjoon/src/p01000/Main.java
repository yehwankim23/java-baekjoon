package p01000;

// 주소: https://www.acmicpc.net/problem/1000
// 제목: A+B
// 결과: 맞았습니다!!
// 메모리: 14332 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
        
        System.out.println(A + B);
    }
}
