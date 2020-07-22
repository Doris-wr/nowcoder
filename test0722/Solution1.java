package test0722;

/**
 * @Author:wangrui
 * @Date:2020/7/22 11:33
 */
/*
 * 功能描述:我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
比如n=3时，2*3的矩形块有3种覆盖方法：
 * @return
 */
public class Solution1 {
    //动态规划
    //f(n)：总的方法数
    //状态转移方程：f(n)=f(n-1)+f(n-2);
    //初始值:f(1)=1;f(2)=2;
    public int RectCover(int target) {
        if(target<=2){
            return target;
        }
        int[] dp=new int[target+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=target;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[target];
    }
}
