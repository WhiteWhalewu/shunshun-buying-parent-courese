package com.shunshun.util;

/**
 * @author ：Zhuiwei Wu
 * @description：TODO
 * @date ：2024-11-21 15:08
 */

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdcardUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author oldA
 * @Description
 * @date 2023/6/28
 */
public class IdCardUtilTest {

    /**
     * 1、判断是否有效身份证号
     * 2、判断18位身份证的合法性
     * 3、根据身份编号获取生日  生日(yyyyMMdd)
     * 4、从身份证号码中获取生日日期
     * 5、根据身份编号获取年龄
     * 6、根据身份编号获取指定日期当时的年龄年龄
     * 7、根据身份编号获取生日年
     * 8、根据身份编号获取生日月
     * 9、根据身份编号获取生日天
     * 10、根据身份编号获取性别
     * 11、根据身份编号获取户籍省份编码
     * 12、根据身份编号获取户籍省份
     * 13、根据身份编号获取市级编码
     */
    public static void main(String[] args) {
        String idNumber="411381199012256510";

        //1、判断是否有效身份证号
        System.out.println(String.format("%s>>>>>>%s","判断是否有效身份证号",IdcardUtil.isValidCard(idNumber)));

        //2、判断18位身份证的合法性
        System.out.println(String.format("%s>>>>>>%s","判断18位身份证的合法性",IdcardUtil.isValidCard18(idNumber)));


        //3、根据身份编号获取生日  生日(yyyyMMdd)
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取生日",IdcardUtil.getBirthByIdCard(idNumber)));

        //4、从身份证号码中获取生日日期
        Date date=IdcardUtil.getBirthDate(idNumber);
        System.out.println(String.format("%s>>>>>>%s","从身份证号码中获取生日日期", DateUtil.format(date,"yyyy/MM/dd")));

        //5、根据身份编号获取年龄
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取年龄",IdcardUtil.getAgeByIdCard(idNumber)));

        //6、根据身份编号获取指定日期当时的年龄年龄
        //6.1、自定义时间
        Calendar calendar=Calendar.getInstance();
        calendar.set(2021,10,16,20,50,50);
        Date customDate=DateUtil.date(calendar);
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取指定日期当时的年龄年龄",IdcardUtil.getAgeByIdCard(idNumber,customDate)));
        //7、根据身份编号获取生日年
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取生日年",IdcardUtil.getYearByIdCard(idNumber)));

        //8、根据身份编号获取生日月
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取生日月",IdcardUtil.getMonthByIdCard(idNumber)));

        //9、根据身份编号获取生日天
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取生日天",IdcardUtil.getDayByIdCard(idNumber)));

        //10、根据身份编号获取性别
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取性别",IdcardUtil.getGenderByIdCard(idNumber)==0?"女":"男"));

        //11、根据身份编号获取户籍省份编码
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取户籍省份编码",IdcardUtil.getProvinceCodeByIdCard(idNumber)));

        //12、根据身份编号获取户籍省份
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取户籍省份",IdcardUtil.getProvinceByIdCard(idNumber)));

        //13、根据身份编号获取市级编码
        System.out.println(String.format("%s>>>>>>%s","根据身份编号获取市级编码",IdcardUtil.getCityCodeByIdCard(idNumber)));
    }
}