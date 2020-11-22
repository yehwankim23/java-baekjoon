package l02.p02588;

// 주소: https://www.acmicpc.net/problem/2588
// 제목: 곱셈
// 결과: 맞았습니다!!
// 메모리: 14276 KB
// 시간: 120 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one, two, three, four, five, six;
        
        one = scanner.nextInt();
        two = scanner.nextInt();
        scanner.close();
        
        three = one * (two % 10);
        four = one * (two % 100 / 10);
        five = one * (two / 100);
        six = three + four * 10 + five * 100;
        
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }
}
