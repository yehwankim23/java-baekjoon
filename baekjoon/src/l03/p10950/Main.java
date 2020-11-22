package l03.p10950;

// 주소: https://www.acmicpc.net/problem/10950
// 제목: A+B - 3
// 결과: 맞았습니다!!
// 메모리: 14588 KB
// 시간: 132 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, A, B;
        
        T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            
            System.out.println(A + B);
        }
        
        scanner.close();
    }
}
