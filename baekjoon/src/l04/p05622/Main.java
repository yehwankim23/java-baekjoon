package l04.p05622;

// 주소: https://www.acmicpc.net/problem/5622
// 제목: 다이얼
// 결과: 맞았습니다!!
// 메모리: 14256 KB
// 시간: 116 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        int time;
        
        word = scanner.nextLine();
        scanner.close();
        time = 0;
        
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    time += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    time += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    time += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    time += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    time += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    time += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    time += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    time += 10;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(time);
    }
}
