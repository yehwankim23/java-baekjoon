package l05.p01110;

// 주소: https://www.acmicpc.net/problem/1110
// 제목: 더하기 사이클
// 결과: 맞았습니다!!
// 메모리: 14292 KB
// 시간: 112 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, given, found, count, sum;
        
        N = scanner.nextInt();
        given = N;
        found = -1;
        count = 0;
        
        while (N != found) {
            if (0 <= found) {
                given = found;
            }
            if (given < 10) {
                sum = given;
            } else {
                sum = given / 10 + given % 10;
            }
            found = given % 10 * 10 + sum % 10;
            
            count++;
        }
        
        System.out.println(count);
        scanner.close();
    }
}
