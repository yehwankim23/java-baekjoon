package l04.p02292;

// 주소: https://www.acmicpc.net/problem/2292
// 제목: 벌집
// 결과: 맞았습니다!!
// 메모리: 14280 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, temp, moves;
        
        N = scanner.nextInt();
        scanner.close();
        temp = 1;
        moves = 1;
        
        while (temp < N) {
            temp += moves++ * 6;
        }
        
        System.out.println(moves);
    }
}
