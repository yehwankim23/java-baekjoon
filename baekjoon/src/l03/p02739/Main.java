package l03.p02739;

// 주소: https://www.acmicpc.net/problem/2739
// 제목: 구구단
// 결과: 맞았습니다!!
// 메모리: 14356 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        N = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
