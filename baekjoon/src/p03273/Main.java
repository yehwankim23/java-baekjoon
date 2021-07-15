package p03273;

// 주소: https://www.acmicpc.net/problem/3273
// 제목: 두 수의 합
// 결과: 맞았습니다!!
// 메모리: 26196 KB
// 시간: 360 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        int x = Integer.parseInt(br.readLine());
        br.close();
        int count = 0;

        for (int i = 0, j = n - 1; i != j;) {
            int ai = a[i];
            int sum = ai + a[j];

            if (sum < x) {
                i++;
            } else if (sum > x) {
                j--;
            } else {
                count++;

                if (a[i + 1] == ai) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        System.out.println(count);
    }
}
