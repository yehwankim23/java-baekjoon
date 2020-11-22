package l01.p10699;

// 주소: https://www.acmicpc.net/problem/10699
// 제목: 오늘 날짜
// 결과: 맞았습니다!!
// 메모리: 15448 KB
// 시간: 144 ms

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
        System.out.println(df.format(new Date()));
    }
}
