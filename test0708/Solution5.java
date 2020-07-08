package test0708;

/**
 * @Author:wangrui
 * @Date:2020/7/8 9:55
 */
/*
 * 功能描述:请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @return 
 */
public class Solution5 {
    public String replaceSpace(StringBuffer str) {
        if(str==null){
            return str.toString();
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}