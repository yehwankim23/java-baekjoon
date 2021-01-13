package p02839;

// 주소: https://www.acmicpc.net/problem/2839
// 제목: 설탕 배달
// 결과: 맞았습니다!!
// 메모리: 14308 KB
// 시간: 108 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, count, min;
        
        N = scanner.nextInt();
        scanner.close();
        min = 1667;
        
        for (int i = N / 5; i >= 0; i--) {
            if ((N - (5 * i)) % 3 == 0) {
                if ((count = (i + ((N - (5 * i)) / 3))) < min) {
                    min = count;
                }
            }
        }
        
        if (min == 1667) {
            min = -1;
        }
        
        System.out.println(min);
    }
}
