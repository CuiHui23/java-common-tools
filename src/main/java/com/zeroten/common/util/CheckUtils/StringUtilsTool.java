package com.zeroten.common.util.CheckUtils;

public class StringUtilsTool {
    public static boolean isAnyEmpty(String[] str){
        for (int index = 0;index < str.length;index ++){
            if (str[index].length() == 0 || str[index] == null) {
                return true;
            }
            if (index == str.length - 1) {
                return false;
            }
        }
        return false;
    }
    public static boolean isEmpty(Object[] arr){
        if (arr.length == 0) {
            return true;
        } else {
            for (int index = 0;index < arr.length;index ++){
                if (arr[index] == null){
                    return true;
                } else {
                    return  false;
                }
            }
        }
        return false;
    }
    public static boolean equals(String str1, String str2){
        if (str1 == null || str2 == null){
            return  false;
        }
        if (str1.length() != str2.length()){
            return false;
        } else {
            for (int index = 0;index < str1.length();index ++){
                if (str1.charAt(index) != str2.charAt(index)){
                    return false;
                }
                if (index == str1.length() - 1){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean equals(Integer n1, Integer n2) {
        if (n1 == null || n2 == null) {
            return false;
        }
        if (n1 == n2)
            return true;
        else
            return false;
    }
}
