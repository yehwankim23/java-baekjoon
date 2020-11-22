package l03.p02741;

// 주소: https://www.acmicpc.net/problem/2741
// 제목: N 찍기
// 결과: 맞았습니다!!
// 메모리: 33824 KB
// 시간: 732 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        
        N = scanner.nextInt();
        scanner.close();
        
        for (int i = 0; i < N; i++) {
            System.out.println(i + 1);
        }
    }
}
