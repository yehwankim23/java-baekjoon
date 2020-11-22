package l02.p09498;

// 주소: https://www.acmicpc.net/problem/9498
// 제목: 시험 성적
// 결과: 맞았습니다!!
// 메모리: 14292 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        
        score = scanner.nextInt();
        scanner.close();
        
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
