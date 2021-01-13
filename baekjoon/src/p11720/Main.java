package p11720;

// 주소: https://www.acmicpc.net/problem/11720
// 제목: 숫자의 합
// 결과: 맞았습니다!!
// 메모리: 14336 KB
// 시간: 108 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, sum;
        String num;
        
        N = scanner.nextInt();
        num = scanner.next();
        scanner.close();
        sum = 0;
        
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        System.out.println(sum);
    }
}
