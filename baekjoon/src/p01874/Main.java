package p01874;

// 주소: https://www.acmicpc.net/problem/1874
// 제목: 스택 수열
// 결과: 맞았습니다!!
// 메모리: 30392 KB
// 시간: 368 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> nums = new Stack<Integer>();

        for (int i = n; i > 0; i--) {
            nums.push(i);
        }

        Stack<Integer> stack = new Stack<Integer>();
        boolean isPossible = true;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            if (stack.isEmpty() || stack.peek() != target) {
                int num;

                do {
                    if (nums.empty()) {
                        isPossible = false;
                        break;
                    }

                    num = nums.pop();
                    stack.push(num);
                    sb.append("+\n");
                } while (num != target);

                if (!isPossible) {
                    break;
                }
            }

            stack.pop();
            sb.append("-\n");
        }

        br.close();
        System.out.println(isPossible ? sb : "NO");
    }
}
