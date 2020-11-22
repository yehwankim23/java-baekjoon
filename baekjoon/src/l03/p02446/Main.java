package l03.p02446;

// 주소: https://www.acmicpc.net/problem/2446
// 제목: 별 찍기 - 9
// 결과: 맞았습니다!!
// 메모리: 17664 KB
// 시간: 292 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        N = scanner.nextInt();
        
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < N - 1 - Math.abs(N - 1 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * Math.abs(N - 1 - i) + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
