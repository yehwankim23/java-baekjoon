package l03.p10952;

// 주소: https://www.acmicpc.net/problem/10952
// 제목: A+B - 5
// 결과: 맞았습니다!!
// 메모리: 14544 KB
// 시간: 132 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;
        
        while ((sum = scanner.nextInt()) != 0) {
            sum += scanner.nextInt();
            System.out.println(sum);
        }
        
        scanner.close();
    }
}
