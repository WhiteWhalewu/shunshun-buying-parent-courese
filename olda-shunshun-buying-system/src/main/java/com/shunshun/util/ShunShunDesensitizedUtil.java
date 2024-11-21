package com.shunshun.util;

import cn.hutool.core.util.DesensitizedUtil;

/**
 * @author ：Zhuiwei Wu
 * @description：TODO
 * @date ：2024-11-21 12:46
 */
public class ShunShunDesensitizedUtil {
    /**
     * java工具包中脱敏工具
     * 1、【用户id】不对外提供userId
     * 2、【中文姓名】只显示第一个汉字，其他隐藏为2个星号，比如：李**
     * 3、【身份证号】前1位 和后2位
     * 4、【固定电话 前四位，后两位
     * 5、【手机号码】前三位，后4位，其他隐藏，比如135****2210
     * 6、【地址】只显示到地区，不显示详细地址，比如：北京市海淀区****
     * 7、【电子邮箱】邮箱前缀仅显示第一个字母，前缀其他隐藏，用星号代替，@及后面的地址显示，比如：d**@126.com
     * 8、【密码】密码的全部字符都用*代替，比如：******
     * 9、【中国车牌】车牌中间用*代替
     * 10、银行卡号脱敏
     * 11、
     */
    public static void main(String[] args) {
        //1、【中文姓名】只显示第一个汉字，其他隐藏为2个星号，比如：李**
        System.out.println(DesensitizedUtil.chineseName("李小龙"));
        System.out.println(DesensitizedUtil.chineseName("雷军"));

        //2、【身份证号】保留前四后六
        System.out.println(DesensitizedUtil.idCardNum("513436199010256982",4,6));

        //3、【固定电话 前四位，后两位
        System.out.println(DesensitizedUtil.fixedPhone("0571-12345"));

        //4、【手机号码】前三位，后4位，其他隐藏，比如135****2210
        System.out.println(DesensitizedUtil.mobilePhone("18888888888"));

        //5、【地址】只显示到地区，不显示详细地址，比如：北京市海淀区****  敏感信息长度
        System.out.println(DesensitizedUtil.address("浙江省杭州市滨江区西溪花园xxx",8));

        //6、【电子邮箱】邮箱前缀仅显示第一个字母，前缀其他隐藏，用星号代替，@及后面的地址显示，比如：d**@126.com
        System.out.println(DesensitizedUtil.email("shunshuntehui@163.com"));

        //7、【密码】密码的全部字符都用*代替，比如：******
        System.out.println(DesensitizedUtil.password("123456"));

        //8、银行卡号脱敏
        System.out.println(DesensitizedUtil.bankCard("6228888888888888888"));
    }
}
