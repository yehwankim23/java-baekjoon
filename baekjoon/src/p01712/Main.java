package p01712;

// 주소: https://www.acmicpc.net/problem/1712
// 제목: 손익분기점
// 결과: 맞았습니다!!
// 메모리: 14280 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        scanner.close();
        
        if (C <= B) {
            System.out.println("-1");
        } else {
            System.out.println(A / (C - B) + 1);
        }
    }
}
