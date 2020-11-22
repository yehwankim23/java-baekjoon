package l04.p15596;

// 주소: https://www.acmicpc.net/problem/15596
// 제목: 정수 N개의 합
// 결과: 맞았습니다!!
// 메모리: 387268 KB
// 시간: 36 ms

import java.util.Random;

public class Test {
    static long sum(int[] a) {
        long ans = 0;
        
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[3000000];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(1000001);
        }
        
        long startTime = System.nanoTime();
        
        System.out.println(sum(a));
        
        long endTime = System.nanoTime();
        System.err.println((endTime - startTime) / 1000000 + " ms");
    }
}
