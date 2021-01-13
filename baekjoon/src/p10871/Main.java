package p10871;

// 주소: https://www.acmicpc.net/problem/10871
// 제목: X보다 작은 수
// 결과: 맞았습니다!!
// 메모리: 371552 KB
// 시간: 1520 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, X, num;
        String answer = "";
        
        N = scanner.nextInt();
        X = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            num = scanner.nextInt();
            
            if (num < X) {
                if (!answer.equals("")) {
                    answer += " ";
                }
                answer += num;
            }
        }
        
        System.out.println(answer);
        scanner.close();
    }
}
