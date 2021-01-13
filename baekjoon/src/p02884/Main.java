package p02884;

// 주소: https://www.acmicpc.net/problem/2884
// 제목: 알람 시계
// 결과: 맞았습니다!!
// 메모리: 14360 KB
// 시간: 108 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H, M, time;
        
        H = scanner.nextInt();
        M = scanner.nextInt();
        scanner.close();
        
        time = H * 60 + M - 45;
        
        if (time < 0) {
            time += 24 * 60;
        }
        
        M = time % 60;
        H = (time - M) / 60;
        
        System.out.println(H + " " + M);
    }
}
