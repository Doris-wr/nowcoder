package test0907;

import java.util.Stack;

/**
 * @Author:wangrui
 * @Date:2020/9/7 20:02
 */
public class Main2 {
    public boolean chkParentthesis(String str,int n){
        Stack<Character>lefts=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                lefts.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(lefts.isEmpty()){
                    return false;
                }else{
                    lefts.pop();
                }
            }else{
                return false;
            }
        }
        if(!lefts.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
