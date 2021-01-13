package p16170;

// 주소: https://www.acmicpc.net/problem/16170
// 제목: 오늘의 날짜는?
// 결과: 맞았습니다!!
// 메모리: 14604 KB
// 시간: 124 ms

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy\nMM\ndd", Locale.UK);
        System.out.println(df.format(new Date()));
    }
}
