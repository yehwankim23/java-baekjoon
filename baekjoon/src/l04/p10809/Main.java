package l04.p10809;

// 주소: https://www.acmicpc.net/problem/10809
// 제목: 알파벳 찾기
// 결과: 맞았습니다!!
// 메모리: 14236 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int pos;
        
        s = scanner.nextLine();
        scanner.close();
        
        for (int i = 'a'; i <= 'z'; i++) {
            pos = -1;
            pos = s.indexOf(i);
            
            System.out.print(pos);
            if (i < 'z') {
                System.out.print(" ");
            }
        }
    }
}
