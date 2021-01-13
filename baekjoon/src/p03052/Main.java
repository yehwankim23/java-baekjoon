package p03052;

// 주소: https://www.acmicpc.net/problem/3052
// 제목: 나머지
// 결과: 맞았습니다!!
// 메모리: 14316 KB
// 시간: 112 ms

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        int num;
        
        for (int i = 0; i < 10; i++) {
            num = scanner.nextInt() % 42;
            
            if (!array.contains(num)) {
                array.add(num);
            }
        }
        
        scanner.close();
        System.out.println(array.size());
    }
}
