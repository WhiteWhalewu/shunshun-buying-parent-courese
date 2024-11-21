package com.shunshun.util;

import cn.hutool.core.date.DateUtil;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;


/**
 * @author ：Zhuiwei Wu
 * @description：TODO
 * @date ：2024-11-21 11:27
 */

import cn.hutool.core.date.DateUtil;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
public class ShunShunDateUtil {

    /**
     * 1、获取当前时间
     * @return
     */
    public static Date getCurrentDate(){
        return DateUtil.date();
    }

    /**
     * 2、获取当前时间的时间戳（毫秒级）
     * @return 时间
     */
    public static long getCurrentTimestampMS() {
        return DateUtil.current();
    }

    /**
     * 3、获取当前时间的时间戳（秒级）
     * @return 当前时间秒数
     * @since 4.0.0
     */
    public static long getCurrentTimestampS() {
        return DateUtil.currentSeconds();
    }

    /**
     * 4、当前时间格式化，格式 yyyy-MM-dd HH:mm:ss
     * @return 当前时间的标准形式字符串
     */
    public static String now() {
        return DateUtil.now();
    }

    /**
     * 5、当前日期格式化，格式 yyyy-MM-dd
     * @return 当前日期的标准形式字符串
     */
    public static String today() {
        return DateUtil.today();
    }

    /**
     * 1、获得指定日期所属季度，从1开始计数
     * 2、获得指定日期的月份，从0开始计数
     * 3、获得指定日期是所在年份的第几周
     * 4、获得指定日期是所在月份的第几周
     * 5、获得指定日期是这个日期所在月份的第几天
     * 6、获得指定日期是这个日期所在月份的第几天
     * 7、获得指定日期是星期几，1表示周日，2表示周一
     * 8、判断指定日期是否为周末（周六或周日）
     * 9、获得指定日期的小时数部分、分钟数部分、秒数部分、毫秒数部分
     * 10、判断当前日期 是否为上午、是否为下午、是否为今年
     * 11、返回当前日期的 月份、所在年份的第几周、所在月份的第几周、是这个日期所在月份的第几天、是星期几、小时数部分、分钟数部分、秒数部分、毫秒数部分
     * 12、获得指定日期年份和季节、获得指定日期区间内的年份和季节
     * 13、格式化日期时间、根据特定格式格式化日期、格式化日期时间、仅格式化日期部分、仅格式化时间、格式化为Http的标准日期格式、格式化为中文日期格式
     * 14、解析UTC时间
     * 15、解析CST时间
     * 16、获取秒级别的开始时间、获取秒级别的结束时间
     * 17、获取某小时的开始时间/结束时间、获取某分钟的开始时间/结束时间、、获取某天的开始时间/结束时间、、获取某周的开始时间/结束时间、获取某月的开始时间、获取某季度的开始时间、获取某年的开始时间
     * 18、获取同一时刻 昨天、明天、上周、下周、上个月、下个月、
     * 19、偏移毫秒数、秒数、分钟、小时、偏移天、偏移周、偏移月
     * 20、获取指定日期偏移指定时间后的时间，生成的偏移日期不影响原日期
     * 21、判断两个日期相差的时长、判断两个日期相差的毫秒数、判断两个日期相差的天数
     * 22、计算指定时间区间内的周数、计算两个日期相差月数、计算两个日期相差年数、
     * 23、当前日期是否在日期指定范围内、是否为相同时间
     * 24、比较两个日期是否为同一天、比较两个日期是否为同一周、比较两个日期是否为同一月
     * 25、计时，常用于记录某段代码的执行时间
     * 26、计时器
     * 27、生日转为年龄，计算法定年龄、是否闰年
     * 28、计算相对于dateToCompare的年龄，长用于计算指定生日在某年的年龄
     * 29、判定给定开始时间经过某段时间后是否过期、判定在指定检查时间是否过期
     * 30、HH:mm:ss 时间格式字符串转为秒数、秒数转为时间格式
     * 31、创建日期范围生成器
     * 32、俩个时间区间取交集、俩个时间区间取差集
     * 33、按日期范围遍历、创建日期范围生成器
     * 34、通过生日计算星座、计算生肖
     * 35、安全的日期比较
     * 36、纳秒转毫秒、纳秒转秒
     * 37、{@link Date} 转换为 {@link LocalDateTime}，使用系统默认时区
     * 38、获得指定年份的总天数、获得指定月份的总天数、
     * 39、 创建{@link SimpleDateFormat}
     * 40、获取时长单位简写
     */

    public static void main(String[] args) {

    }

}
