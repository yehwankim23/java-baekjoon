package l04.p02562;

// 주소: https://www.acmicpc.net/problem/2562
// 제목: 최댓값
// 결과: 맞았습니다!!
// 메모리: 14376 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max, num, n;
        
        max = 0;
        n = 0;
        
        for (int i = 0; i < 9; i++) {
            if (max < (num = scanner.nextInt())) {
                max = num;
                n = i + 1;
            }
        }
        
        System.out.println(max);
        System.out.println(n);
        scanner.close();
    }
}
