package test0705;

/**
 * @Author:wangrui
 * @Date:2020/7/5 13:07
 */
/*
 * 功能描述:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @return
 */
import java.util.Stack;

public class Solution2 {
    Stack<Integer> s1 = new Stack<Integer>();    //模拟进队列
    Stack<Integer> s2 = new Stack<Integer>();    //模拟出队列

    public void push(int node) {
        s1.push(node);
    }

    public int pop(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}