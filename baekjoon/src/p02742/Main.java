package p02742;

// 주소: https://www.acmicpc.net/problem/2742
// 제목: 기찍 N
// 결과: 맞았습니다!!
// 메모리: 33824 KB
// 시간: 708 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        n = scanner.nextInt();
        scanner.close();
        
        for (; n > 0; n--) {
            System.out.println(n);
        }
    }
}
