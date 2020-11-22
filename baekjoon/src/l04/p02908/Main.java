package l04.p02908;

// 주소: https://www.acmicpc.net/problem/2908
// 제목: 상수
// 결과: 맞았습니다!!
// 메모리: 14292 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, temp;
        
        A = 0;
        B = 0;
        temp = scanner.nextInt();
        
        while (temp != 0) {
            A = A * 10 + temp % 10;
            temp /= 10;
        }
        
        temp = scanner.nextInt();
        scanner.close();
        
        while (temp != 0) {
            B = B * 10 + temp % 10;
            temp /= 10;
        }
        
        System.out.println(Integer.max(A, B));
    }
}
