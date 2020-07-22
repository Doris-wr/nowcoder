package test0722;

/**
 * @Author:wangrui
 * @Date:2020/7/22 15:15
 */
/*
 * 功能描述:青蛙跳台阶
 * @return
 */
public class Solution3 {
    public int JumpFloor(int target) {
        if(target==0){
            return 1;
        }
        if(target<=2){
            return target;
        }
        int[] dp=new int[target+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=2;i<=target;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[target];
    }
}