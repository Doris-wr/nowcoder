package 牛客test0731;

/**
 * @Author:wangrui
 * @Date:2020/7/31 11:15
 */
/*
 * 功能描述:给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
  * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @return 
 */
import java.util.*;
public class Solution1 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer>list=new ArrayList<>();
        if(size==0|num.length==0||num.length<size){
            return list;
        }
        for(int i=0;i<=num.length-size;i++){
            int max=num[i];
            for(int j=i;j<i+size;j++){
                max=num[j]>max?num[j]:max;
            }
            list.add(max);
        }
        return list;
    }
}