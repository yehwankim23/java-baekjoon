package p08718;

// 주소: https://www.acmicpc.net/problem/8718
// 제목: Bałwanek
// 결과: 맞았습니다!!
// 메모리: 14280 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), k = sc.nextInt();
        sc.close();
        
        System.out.println(1000 * x >= 7000 * k ? 7000 * k
                : 1000 * x >= 3500 * k ? 3500 * k
                : 1000 * x >= 1750 * k ? 1750 * k : 0);
    }
}
