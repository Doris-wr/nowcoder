package test0707;

/**
 * @Author:wangrui
 * @Date:2020/7/7 8:20
 */
/*
 * 功能描述:汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
 * 请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * @return
 */
public class Solution3 {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0){
            return str;
        }
        StringBuffer buffer=new StringBuffer();
        StringBuffer buffer1=new StringBuffer(str);
        StringBuffer buffer2=new StringBuffer(str);
        buffer1.delete(0,n);
        buffer2.delete(n,str.length());
        buffer.append(buffer1.toString()).append(buffer2.toString());
        return buffer.toString();
    }
}
