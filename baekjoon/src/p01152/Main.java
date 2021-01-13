package p01152;

// 주소: https://www.acmicpc.net/problem/1152
// 제목: 단어의 개수
// 결과: 맞았습니다!!
// 메모리: 37744 KB
// 시간: 380 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split;
        int count;
        
        split = scanner.nextLine().split(" ");
        scanner.close();
        count = 0;
        
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
