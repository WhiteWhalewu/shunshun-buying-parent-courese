package com.shunshun.util;

import com.google.common.base.CaseFormat;

/**
 * @author ：Zhuiwei Wu
 * @description：TODO
 * @date ：2024-11-21 10:44
 */
public class GuavaUtils {

    public static void main(String[] args) {
        System.out.println("CaseFormat = "+transformToDatabaseFieldLower("createTime"));
        System.out.println("CaseFormat = "+transformToDatabaseFieldUpper("createTime"));
        System.out.println("CaseFormat = "+transformToDatabaseFieldUpper1("createTime"));

        System.out.println(String.format("%s>>>>>>%s","数据库字段转驼峰命名格式",CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,"create_time")));
    }


    /**
     * 驼峰字段转LOWER_UNDERSCORE(数据库字段)
     */
    public static String transformToDatabaseFieldUpper(String name){
        //CaseFormat.LOWER_CAMEL-标识输入字符串name 本身的格式
        //CaseFormat.UPPER_UNDERSCORE 表示要被转换的格式
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE,name);
    }



    /**
     * 驼峰字段转LOWER_UNDERSCORE(数据库字段)
     */
    public static String transformToDatabaseFieldLower(String name){
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE,name);
    }



    /**
     * 数据库字段转驼峰字段
     */
    public static String transformToDatabaseFieldUpper2(String name){
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,name);
    }


    /**
     * 驼峰字段转LOWER_HYPHEN
     */
    public static String transformToDatabaseFieldUpper1(String name){
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN,name);
    }

}

