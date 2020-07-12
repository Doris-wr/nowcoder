import java.util.ArrayList;

/**
 * @Author:wangrui
 * @Date:2020/7/2 7:55
 */
/*
 * 功能描述:输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 方法：因为是有序的，所以左右夹击
 * @return 
 */
import java.util.ArrayList;
public class Solution1 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum){
        ArrayList list=new ArrayList();
        if(array.length==0||array.length==2){
            return list;
        }
        int left=0;
        int right=array.length-1;
        while(left<right){
            if(array[left]+array[right]==sum){
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }else if(array[left]+array[right]>sum){
                right--;
            }else{
                left++;
            }
        }
        return list;
    }
}
