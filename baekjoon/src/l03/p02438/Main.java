package l03.p02438;

// 주소: https://www.acmicpc.net/problem/2438
// 제목: 별 찍기 - 1
// 결과: 맞았습니다!!
// 메모리: 15232 KB
// 시간: 160 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        N = scanner.nextInt();
        scanner.close();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
