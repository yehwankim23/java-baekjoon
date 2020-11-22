package l04.p10996;

// 주소: https://www.acmicpc.net/problem/10996
// 제목: 별 찍기 - 21
// 결과: 맞았습니다!!
// 메모리: 19572 KB
// 시간: 252 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        N = scanner.nextInt();
        
        if (N == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < 2 * N; i++) {
                for (int j = 0; j < N; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
