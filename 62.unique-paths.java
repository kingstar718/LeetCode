/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 *
 * https://leetcode.com/problems/unique-paths/description/
 *
 * algorithms
 * Medium (46.95%)
 * Total Accepted:    272.8K
 * Total Submissions: 581.2K
 * Testcase Example:  '3\n2'
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * 
 * Above is a 7 x 3 grid. How many possible unique paths are there?
 * 
 * Note: m and n will be at most 100.
 * 
 * Example 1:
 * 
 * 
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the
 * bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: m = 7, n = 3
 * Output: 28
 * 统计从矩阵左上角到右下角的路径总数，每次只能向右或者向下移动
 */
class Solution {
    public int uniquePaths(int m, int n) {
        // int[] dp = new int[n];
        // Arrays.fill(dp, 1);
        // for (int i = 1; i < m; i++) {
        // for (int j = 1; j < n; j++) {
        // dp[j] = dp[j] + dp[j - 1];
        // }
        // }
        // return dp[n - 1];

        // 机器人总共移动的次数 S=m+n-2，向下移动的次数 D=m-1，
        // 问题可以看成从 S 中取出 D 个位置的组合数量,解为 C(S, D)
        int S = m + n - 2;// 总共的动次数
        int D = m - 1;// 向下的移动次数
        long ret = 1;
        for (int i = 1; i <= D; i++) {
            ret = ret * (S - D + i) / i;
        }
        return (int) ret;
    }
}
