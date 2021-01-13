package p01011;

// 주소: https://www.acmicpc.net/problem/1011
// 제목: Fly me to the Alpha Centauri
// 결과: 맞았습니다!!
// 메모리: 14584 KB
// 시간: 140 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, y, moves;
        
        T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            y = (scanner.nextInt() - scanner.nextInt()) * -1;
            moves = 0;
            
            for (int j = 1; y > 0; j++) {
                if (y > j) {
                    y -= j * 2;
                    moves += 2;
                } else {
                    y -= j;
                    moves++;
                }
            }
            
            System.out.println(moves);
        }
        
        scanner.close();
    }
}
