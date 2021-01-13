package p10951;

// 주소: https://www.acmicpc.net/problem/10951
// 제목: A+B - 4
// 결과: 맞았습니다!!
// 메모리: 14556 KB
// 시간: 132 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;
        
        while (scanner.hasNext()) {
            sum = scanner.nextInt();
            sum += scanner.nextInt();
            
            System.out.println(sum);
        }
        
        scanner.close();
    }
}
