package p05543;

// 주소: https://www.acmicpc.net/problem/5543
// 제목: 상근날드
// 결과: 맞았습니다!!
// 메모리: 14284 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int burger, drink, temp;
        
        burger = scanner.nextInt();
        
        if ((temp = scanner.nextInt()) < burger) {
            burger = temp;
        }
        if ((temp = scanner.nextInt()) < burger) {
            burger = temp;
        }
        
        drink = scanner.nextInt();
        
        if ((temp = scanner.nextInt()) < drink) {
            drink = temp;
        }
        
        temp = burger + drink - 50;
        
        System.out.println(temp);
        scanner.close();
    }
}
