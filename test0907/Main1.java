package test0907;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @Author:wangrui
 * @Date:2020/9/7 19:55
 */
//字符串中找出最长的数字串
public class Main1 {
   public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       while(scan.hasNext()){
           String str=scan.nextLine();
           int count=0,max=0,end=0;
           for(int i=0;i<str.length();i++){
               if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                   count++;
                   if(max<count){
                       max=count;
                       end=i;
                   }
               }else{
                   count=0;
               }
           }
           System.out.println(str.substring(end-max+1,end+1));
       }
   }
}
