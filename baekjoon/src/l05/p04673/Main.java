package l05.p04673;

// 주소: https://www.acmicpc.net/problem/4673
// 제목: 셀프 넘버
// 결과: 맞았습니다!!
// 메모리: 14532 KB
// 시간: 192 ms

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> selfNumber = new ArrayList<Integer>();
        int num;
        
        for (int i = 0; i < 10000; i++) {
            selfNumber.add(i + 1);
        }
        
        for (int i = 0; i < 10000; i++) {
            num = i + 1;
            
            for (int j = num; j != 0; j /= 10) {
                num += j % 10;
            }
            
            if (selfNumber.contains((Object) num)) {
                selfNumber.remove((Object) num);
            }
        }
        
        for (int i = 0; i < selfNumber.size(); i++) {
            System.out.println(selfNumber.get(i));
        }
    }
}
