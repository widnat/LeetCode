package com.leetcode;

import java.util.HashSet;

public class IsValidSodukuSolution {
    public boolean isValidSoduku(char[][] board) {
        return linesAreValid(board) && squaresAreValid(board);
    }

    private boolean linesAreValid(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            if (!isValidLine(board, i, false) || !isValidLine(board, i, true)) {
                return false;
            }
        }

        return true;
    }

    private boolean squaresAreValid(char[][] board) {
        return isValidSquare(board, 0, 0)
                && isValidSquare(board, 0, 3)
                && isValidSquare(board, 0, 6)
                && isValidSquare(board, 3, 0)
                && isValidSquare(board, 3, 3)
                && isValidSquare(board, 3, 6)
                && isValidSquare(board, 6, 0)
                && isValidSquare(board, 6, 3)
                && isValidSquare(board, 6, 6);
    }

    private boolean isValidSquare(char[][] board, int startX, int startY) {
        HashSet<Character> seen = new HashSet<>();
        for (int x = 0; x < 3; ++x) {
            for (int y = 0; y < 3; ++y) {
                char value = board[x + startX][y + startY];
                if (value == '.') {
                    continue;
                }
                if (!seen.contains(value)) {
                    seen.add(value);
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValidLine(char[][] board, int startIndex, boolean isRow) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            int x = isRow ? i : startIndex;
            int y = isRow ? startIndex : i;
            char value = board[x][y];
            if (value == '.') {
                continue;
            }

            if (!seen.contains(value)) {
                seen.add(value);
            } else {
                return false;
            }
        }

        return true;
    }
}
