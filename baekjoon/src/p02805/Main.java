package p02805;

// 주소: https://www.acmicpc.net/problem/2805
// 제목: 나무 자르기
// 결과: 시간 초과
// 메모리: - KB
// 시간: - ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        int[] tree = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(st.nextToken());
            tree[i] = height;

            if (height > max) {
                max = height;
            }
        }

        Arrays.sort(tree);
        int sum = 0;
        int min = 0;
        int mid = 0;

        while (sum != m) {
            sum = 0;
            mid = (min + max) / 2;

            for (int i = n - 1; i >= 0; i--) {
                int length = tree[i] - mid;

                if (length <= 0) {
                    break;
                }

                sum += length;
            }

            if (sum < m) {
                max = mid - 1;
            } else if (sum > m) {
                min = mid + 1;
            }
        }

        System.out.println(mid);
    }
}
