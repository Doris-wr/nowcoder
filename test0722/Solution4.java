package test0722;

/**
 * @Author:wangrui
 * @Date:2020/7/22 15:19
 */
/*
 * 功能描述:变态跳台阶
 * @return
 */
public class Solution4{
    public int JumpFloorII(int target) {
        if(target == 0) {
            return 0;
        }

        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2;i <= target;i++) {
            dp[i] = 0;
            for(int j = 0;j < i;j++) {
                dp[i] += dp[j];
            }
        }

        return dp[target];
    }
}
