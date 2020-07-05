package test0705;

/**
 * @Author:wangrui
 * @Date:2020/7/5 13:08
 */
/*
 * 功能描述:定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 *  注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 * @return
 */
import java.util.Stack;

public class Solution3 {
    Stack<Integer> dataStack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        if(minStack.isEmpty()||node<minStack.peek()){
            minStack.push(node);
        }
    }

    public void pop() {
        if(minStack.peek().equals(dataStack.peek())){
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}