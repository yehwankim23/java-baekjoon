package p10818;

// 주소: https://www.acmicpc.net/problem/10818
// 제목: 최소, 최대
// 결과: 맞았습니다!!
// 메모리: 285012 KB
// 시간: 1436 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, num, min, max;
        
        N = scanner.nextInt();
        min = 1000001;
        max = -1000001;
        
        for (int i = 0; i < N; i++) {
            num = scanner.nextInt();
            
            if (num < min) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        
        System.out.println(min + " " + max);
        scanner.close();
    }
}
