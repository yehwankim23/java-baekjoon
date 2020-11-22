package l03.p02439;

// 주소: https://www.acmicpc.net/problem/2439
// 제목: 별 찍기 - 2
// 결과: 맞았습니다!!
// 메모리: 17296 KB
// 시간: 196 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        N = scanner.nextInt();
        scanner.close();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < N - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
    }
}
