package test0703;

/**
 * @Author:wangrui
 * @Date:2020/7/3 11:46
 */
/*
 * 功能描述:数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @return
 */
import java.util.HashMap;
public class Solution4 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length == 0) return 0 ;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            Integer temp=map.get(array[i]);
            if(temp==null){
                map.put(array[i],1);
            }else{
                map.put(array[i],temp+1);
            }
        }
        for(int i=0;i<map.size();i++){
            if(map.get(array[i])>array.length/2){
                return array[i];
            }
        }
        return 0;
    }
}
