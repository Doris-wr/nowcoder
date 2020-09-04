package test0711;

/**
 * @Author:wangrui
 * @Date:2020/7/3 8:45
 */
/*
 * 功能描述:写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @return
 * 做法：
 */
public class Solution5 {
    public int Add(int num1,int num2) {
        while (num2!=0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }

    public int Add2(int num1,int num2) {
        if(num1>0){
            while(num1--!=0)
                num2++;
        }
        else if(num1<0){
            while(num1++!=0)
                num2--;
        }
        return num2;
    }
}
