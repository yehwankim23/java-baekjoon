package p19532;

// 주소: https://www.acmicpc.net/problem/19532
// 제목: 수학은 비대면강의입니다
// 결과: 맞았습니다!!
// 메모리: 14324 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, e, f;
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        f = scanner.nextInt();
        scanner.close();
        
        System.out.println((c * e - b * f) / (a * e - b * d) + " "
                + (a * f - c * d) / (a * e - b * d));
    }
}
