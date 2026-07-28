package Striver_Sheet;

import java.util.Arrays;

public class AnagramString{

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] s1=str1.toCharArray();
         char[] s2=str2.toCharArray();

         Arrays.sort(s1);
        Arrays.sort(s2);

         for(int i=0;i<str1.length();i++){
            if(s1[i] != s2[i]){
                return false;
            }
         }
         return true;

    }
    public static void main(String [] args){
        String str1="CAT";
        String str2="ACT";

        boolean ans= isAnagram(str1,str2);
        System.out.println(ans);


    }
}