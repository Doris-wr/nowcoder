package test0703;

/**
 * @Author:wangrui
 * @Date:2020/7/3 9:48
 */
/*
 * 功能描述:统计一个数字在排序数组中出现的次数。
 * @return
 */
public class Solution3 {
    public int GetNumberOfK(int [] array , int k){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                count++;
            }
        }
        return count;
    }
}
