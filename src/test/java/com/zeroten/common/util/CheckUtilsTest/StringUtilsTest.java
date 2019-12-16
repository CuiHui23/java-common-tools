package com.zeroten.common.util.CheckUtilsTest;

import com.zeroten.common.util.CheckUtils.StringUtilsTool;
import org.testng.annotations.Test;

import java.util.Arrays;

public class StringUtilsTest {
    @Test
    public void testIsAnyEmpty(){
        String[] strArr = new String[3];
        String[] strArr1 = new String[3];
        strArr[0] = "123";
        strArr[1] = "hello";
        strArr[2] = "world";

        strArr1[0] = "";
        strArr1[1] = "hello";
        strArr1[2] = "world";

        System.out.println("strArr = " + Arrays.toString(strArr));
        System.out.println("strArr是否有空值" + StringUtilsTool.isAnyEmpty(strArr));
        System.out.println("strArr1 = " + Arrays.toString(strArr1));
        System.out.println("strArr是否有空值" + StringUtilsTool.isAnyEmpty(strArr1));
    }

    @Test
    public void testIsEmpty(){
        Object[] obj = new Object[3];
        System.out.println("obj = " + Arrays.toString(obj));
        System.out.println("obj是否空值" + StringUtilsTool.isEmpty(obj));
    }

    @Test
    public void testequals(){
        String str1 = "HelloWorld";
        String str2 = "Hello" + "World";
        System.out.println("String类型比较：" + StringUtilsTool.equals(str1,str2));
        System.out.println("是否相等：" + str1.equals(str2));
    }

    @Test
    public void testequalsInt(){
        Integer integer1 = 123;
        Integer integer2 = 99 + 24;
        System.out.println("Integer类型比较：" + StringUtilsTool.equals(integer1,integer2));
        System.out.println("是否相等：" + integer1.equals(integer2));
    }
}
