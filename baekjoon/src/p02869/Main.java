package p02869;

// 주소: https://www.acmicpc.net/problem/2869
// 제목: 달팽이는 올라가고 싶다
// 결과: 맞았습니다!!
// 메모리: 14304 KB
// 시간: 108 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B, V;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        V = scanner.nextInt();
        scanner.close();
        
        System.out.println((int) Math.ceil((V - A) / (A - B) + 1));
    }
}
