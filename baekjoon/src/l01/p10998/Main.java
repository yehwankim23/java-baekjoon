package l01.p10998;

// 주소: https://www.acmicpc.net/problem/10998
// 제목: A×B
// 결과: 맞았습니다!!
// 메모리: 14292 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
        
        System.out.println(A * B);
    }
}
