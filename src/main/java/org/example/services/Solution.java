package org.example.services;

public class Solution {
    public int numDistinct(String source, String target) {
        int sourceLength = source.length();
        int targetLength = target.length();

        if (targetLength > sourceLength) return 0;

        int[][] dp = initializeDPMatrix(sourceLength, targetLength);

        for (int i = 1; i <= sourceLength; i++) {
            for (int j = 1; j <= targetLength; j++) {
                if (source.charAt(i - 1) == target.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[sourceLength][targetLength];
    }

    private int[][] initializeDPMatrix(int rows, int cols) {
        int[][] dp = new int[rows + 1][cols + 1];
        for (int i = 0; i <= rows; i++) {
            dp[i][0] = 1;
        }
        return dp;
    }
}
