package test0722;

/**
 * @Author:wangrui
 * @Date:2020/7/22 11:34
 */
/*
 * 功能描述:二进制中1  的个数
 * @return
 */
public class Solution2 {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return count;
    }
}