package test0722;

/**
 * @Author:wangrui
 * @Date:2020/7/22 16:04
 */
import java.util.ArrayList;
/*
 * 功能描述:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @return 
 */
public class Solution5 {
    //方法二：基于二分查找算法
    public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int left=0;
        int right=array.length-1;
        int mid=0;
        while(left<right){
            if(right-left==1){
                mid=right;
                break;
            }
            if(array[left]==array[right] && array[left]==array[mid]){
                int result=array[left];
                for(int i=left+1;i<right;i++){
                    if(array[i]<result){
                        result=array[i];
                    }
                }
                return result;
            }
            mid=(left+right)>>1;
            if(array[mid]>=array[left]){
                left=mid;
            }else{
                right=mid;
            }
        }
        return array[mid];
    }
}
