package p02580;

// 주소: https://www.acmicpc.net/problem/2580
// 제목: 스도쿠
// 결과: 틀렸습니다
// 메모리: - KB
// 시간: - ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[][] board = new int[9][9];
    private static int[] empty = new int[81];
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        for (int row = 0; row < 9; row++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int col = 0; col < 9; col++) {
                int num = Integer.parseInt(st.nextToken());
                board[row][col] = num;

                if (num == 0) {
                    empty[count++] = row * 10 + col;
                }
            }
        }

        br.close();
        backtrack(0);
    }

    private static void backtrack(int index) {
        if (index == count) {
            StringBuilder sb = new StringBuilder();

            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    sb.append(board[row][col] + " ");
                }

                sb.append("\n");
            }

            System.out.println(sb);
            return;
        } else {
            int coord = empty[index];
            int row = coord / 10;
            int col = coord % 10;
            boolean found = false;
            int sumRow = 45;
            int sumCol = 45;
            int sumSqr = 45;
            int countRow = 0;
            int countCol = 0;
            int countSqr = 0;
            int startRow = row / 3 * 3;
            int startCol = col / 3 * 3;
            boolean[] candidate = new boolean[9];
            Arrays.fill(candidate, true);

            for (int i = 0; i < 9; i++) {
                int checkRow = board[row][i];
                int checkCol = board[i][col];
                int checkSqr = board[startRow + i / 3][startCol + i % 3];

                sumRow -= checkRow;
                sumCol -= checkCol;
                sumSqr -= checkSqr;

                if (checkRow == 0) {
                    countRow++;
                } else {
                    candidate[checkRow - 1] = false;
                }

                if (checkCol == 0) {
                    countCol++;
                } else {
                    candidate[checkCol - 1] = false;
                }

                if (checkSqr == 0) {
                    countSqr++;
                } else {
                    candidate[checkSqr - 1] = false;
                }
            }

            if (countRow == 1 && sumRow < 10) {
                board[row][col] = sumRow;
                found = true;
            } else if (countCol == 1 && sumCol < 10) {
                board[row][col] = sumCol;
                found = true;
            } else if (countSqr == 1 && sumSqr < 10) {
                board[row][col] = sumSqr;
                found = true;
            }

            if (found) {
                backtrack(index + 1);
            } else {
                for (int i = 0; i < 9; i++) {
                    if (candidate[i]) {
                        board[row][col] = i + 1;
                        backtrack(index + 1);
                    }
                }
            }
        }
    }
}
