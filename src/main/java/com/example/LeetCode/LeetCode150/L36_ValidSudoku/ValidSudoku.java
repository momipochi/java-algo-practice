package com.example.LeetCode.LeetCode150.L36_ValidSudoku;

import java.util.HashMap;

public class ValidSudoku {
    public boolean Solution(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!IsLineValid(board[i])) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            char[] tmp = new char[board.length];
            for (int j = 0; j < board[i].length; j++) {
                tmp[j] = board[j][i];
            }
            if (!IsLineValid(tmp)) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j++) {
                char[][] tmp = new char[3][3];
                int countTmp = 0;
                for (int row = i; row < i + 3; row++) {
                    char[] t = new char[3];
                    int countT = 0;
                    for (int col = j; col < j + 3; col++) {
                        t[countT] = board[row][col];
                        countT++;
                    }
                    tmp[countTmp] = t;
                    countTmp++;
                }
                if (!IsCubeValid(tmp)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean IsLineValid(char[] line) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < line.length; i++) {
            if (line[i] == '.') {
                continue;
            }
            if (map.containsKey(line[i])) {
                return false;
            }
            map.put(line[i], false);
        }
        return true;
    }

    private boolean IsCubeValid(char[][] cube) {
        HashMap<Character, Boolean> map = new HashMap<>();

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                if (cube[i][j] == '.') {
                    continue;
                }
                if (map.containsKey(cube[i][j])) {
                    return false;
                }
                map.put(cube[i][j], false);
            }
        }
        return true;
    }
}
