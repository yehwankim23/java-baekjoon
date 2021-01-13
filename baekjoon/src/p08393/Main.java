package p08393;

// 주소: https://www.acmicpc.net/problem/8393
// 제목: 합
// 결과: 맞았습니다!!
// 메모리: 14280 KB
// 시간: 108 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum;
        
        n = scanner.nextInt();
        scanner.close();
        
        sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println(sum);
    }
}
