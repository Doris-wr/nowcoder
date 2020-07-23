package test0723;

/**
 * @Author:wangrui
 * @Date:2020/7/23 0:00
 */
/*
 * 功能描述:
 * @return输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution1 {
    public void reOrderArray(int [] array) {
        if(array==null||array.length==0){
            return;
        }
        int k=0;
        int temp=0;
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1){
                temp=array[i];
                int j=i;
                while(j-k>0){
                    array[j]=array[j-1];
                    j--;
                }
                array[k++]=temp;
            }
        }
    }
}