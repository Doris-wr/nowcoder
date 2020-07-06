package test0706;

/**
 * @Author:wangrui
 * @Date:2020/7/6 10:10
 */
/*
 * 功能描述:剪绳子
 * @return
 */
public class Solution1 {
    public int cutRope(int n) {
        if(n==2){
            return 1;
        }else if(n==3){
            return 2;
        }
        if(n%3==0){
            return (int)Math.pow(3,n/3);
        }else if(n%3==1){
            return 4*(int)Math.pow(3,n/3-1);
        }else {
            return 2*(int)Math.pow(3,n/3);
        }
    }
}