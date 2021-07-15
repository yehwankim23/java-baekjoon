package p02170;

// 주소: https://www.acmicpc.net/problem/2170
// 제목: 선 긋기
// 결과: 틀렸습니다
// 메모리: - KB
// 시간: - ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            hm.put(x, y);
        }

        br.close();
        int start = -1000000000;
        int end = -1000000000;
        int sum = 0;

        for (Iterator<Entry<Integer, Integer>> i = hm.entrySet().iterator();
                i.hasNext();) {
            Entry<Integer, Integer> entry = i.next();
            int key = entry.getKey();
            int value = entry.getValue();

            if (key <= end) {
                end = value;
            } else {
                sum += end - start;
                start = key;
                end = value;
            }
        }

        System.out.println(sum + end - start);
    }
}
