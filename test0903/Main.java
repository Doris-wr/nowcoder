package test0720;

/**
 * @Author:wangrui
 * @Date:2020/7/20 18:42
 */
/*
 * 功能描述:判断一个字符串是否是回文的
 * @return
 */
public class Main {
    public static boolean fun(String str){
        if(str.length()==0){
            return false;
        }
        StringBuffer sb=new StringBuffer(str);
        String reverse=sb.reverse().toString();
        boolean isEquals = str.equals(reverse);
        return isEquals;
    }
    public static boolean fun2(String str){
        int len=str.length();
        int mid=len>>2;
        int i=0;
        while(i<mid){
            if(str.charAt(i)==str.charAt(len-1-i)){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="aabaa";
        System.out.println( fun2(str));
    }
}
