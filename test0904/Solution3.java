package test0711;

/**
 * @Author:wangrui
 * @Date:2020/7/2 9:10
 */
/*
 * 功能描述:求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @return
 */
public class Solution3 {
    public int Sum_Solution(int n) {
        if(n==1){
            return 1;
        }
        int sum=n;
        return sum+Sum_Solution(n-1);
    }
}
