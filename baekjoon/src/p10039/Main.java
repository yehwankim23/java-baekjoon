package p10039;

// 주소: https://www.acmicpc.net/problem/10039
// 제목: 평균 점수
// 결과: 맞았습니다!!
// 메모리: 14264 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score, temp;
        
        score = 0;
        
        for (int i = 0; i < 5; i++) {
            temp = scanner.nextInt();
            
            if (temp < 40) {
                temp = 40;
            }
            
            score += temp;
        }
        
        System.out.println(score / 5);
        scanner.close();
    }
}
