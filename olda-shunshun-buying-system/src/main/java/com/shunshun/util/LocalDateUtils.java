package com.shunshun.util;


import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * LocalDateTime工具类
 *  LocalDateTime年月日十分秒；LocalDate日期；LocalTime时间；
 *  LocalDateTime 类型都带的有毫秒
 */
@Slf4j
public class LocalDateUtils {

    /**
     * hutool工具包提供的LocalDateTime工具类
     *      cn.hutool.core.date.LocalDateTimeUtil
     * 1、获取当前时间
     * 2、毫秒转{@link LocalDateTime}
     * 3、{@link Date}转{@link LocalDateTime}
     * 4、格式化日期时间为yyyy-MM-dd HH:mm:ss格式、格式化日期时间为指定格式、格式化日期时间为yyyy-MM-dd格式
     * 5、日期偏移
     * 6、获取两个日期的差
     * 7、修改为一天的开始时间、修改为一天的结束时间
     * 8、是否为周末（周六或周日）、获取{@link LocalDate}对应的星期值
     * 9、检查两个时间段是否有时间重叠
     * 10、获得指定日期是所在年份的第几周
     * ...
     */

    public static void main(String[] args) {


    }



    /**
     * 比较两个时间的先后
     * @param time1
     * @param time2
     * @return
     *  0、相等
     *  -1、time1小于time2
     *  1、tim1大于time2
     */
    public static Integer compareLocalDateTime(LocalDateTime time1,LocalDateTime time2){
        if(time1.equals(time2)){
            return 0;
        }else if(time1.isBefore(time2)){
            return -1;
        }else{
            return 1;
        }
    }

    /**
     * LocalDateTime 转 LocalDate
     * @param time
     * @return (注意带了毫秒)
     */
    public static LocalDate localdatetimeToDate(LocalDateTime time){
        LocalDate localDate=time.toLocalDate();
        log.info("localDate = " + localDate.toString());
        return localDate;
    }

    /**
     * LocalDateTime 转 LocalTime
     * @param time
     * @return (注意带了毫秒)
     */
    public static LocalTime localdatetimeToTime(LocalDateTime time){
        LocalTime localTime=time.toLocalTime();
        log.info("localTime = " + localTime.toString());
        return localTime;
    }


    /**
     * 拆解时间子项
     * @param time
     * @param type
     *      0、获取年份
     *      1、获取月份
     *      2、获取日期为所在月的几号
     *      3、获取日期为周几(LocalDateTime---星期一为周一)
     *      4、获取日期为当年的第几天
     *      5、获取小时
     *      6、获取分钟
     *      7、获取秒
     * @return
     */
    public static Integer dismantleTime(LocalDateTime time, int type){
        switch (type){
            case 0:
                return time.getYear();
            case 1:
                return time.getMonthValue();
            case 2:
                return time.getDayOfMonth();
            case 3:
                return time.getDayOfWeek().getValue();
            case 4:
                return time.getDayOfYear();
            case 5:
                return time.getHour();
            case 6:
                return time.getMinute();
            case 7:
                return time.getSecond();
            default:
                return 0;
        }
    }


    /**
     * LocalDateTime转换为Date
     *
     * @param dateTime 日期时间
     * @return Date
     */
    public static Date toDate(LocalDateTime dateTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
        String dateString = simpleDateFormat.format(date);
        Date result = null;//parse():String--->date
        try {
            result = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }



}