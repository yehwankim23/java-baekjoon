package p02753;

// 주소: https://www.acmicpc.net/problem/2753
// 제목: 윤년
// 결과: 맞았습니다!!
// 메모리: 14288 KB
// 시간: 108 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        
        year = scanner.nextInt();
        scanner.close();
        
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
