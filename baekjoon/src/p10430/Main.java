package p10430;

// 주소: https://www.acmicpc.net/problem/10430
// 제목: 나머지
// 결과: 맞았습니다!!
// 메모리: 14320 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        scanner.close();
        
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
