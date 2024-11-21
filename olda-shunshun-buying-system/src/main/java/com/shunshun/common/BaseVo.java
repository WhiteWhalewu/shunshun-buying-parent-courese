package com.shunshun.common;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.shunshun.util.GuavaUtils;

import java.io.Serializable;

/**
 * @author ：Zhuiwei Wu
 * @description：TODO
 * @date ：2024-11-21 10:42
 */
public class BaseVo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 当前页码
     */
    private Integer pageNum=1;
    /**
     * 每页记录数
     */
    private Integer pageSize=20;
    /**
     * 最大页面记录数
     */
    public static int maxPageSize = 1000;

    /**
     * 排序字段(驼峰字段)
     */
    private String fieldSort;
    /**
     * 排序类型
     * 正序 asc
     * 倒序 desc
     */
    private String orderSort;


    public String getFieldSort() {
        if(StringUtils.isNotBlank(fieldSort)){
            return GuavaUtils.transformToDatabaseFieldLower(fieldSort);
        }
        return fieldSort;
    }

    public void setFieldSort(String fieldSort) {
        this.fieldSort = fieldSort;
    }

    public String getOrderSort() {
        if(StringUtils.isNotBlank(orderSort)){
            return orderSort.split("end")[0];
        }
        return orderSort;
    }


    public void setOrderSort(String orderSort) {
        this.orderSort = orderSort;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
