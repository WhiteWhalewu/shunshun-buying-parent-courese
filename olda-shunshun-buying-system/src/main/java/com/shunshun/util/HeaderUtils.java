package com.shunshun.util;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.shunshun.common.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author ：Zhuiwei Wu
 * @description：TODO
 * @date ：2024-11-21 11:25
 */
@Slf4j
public class HeaderUtils {

    /**
     * 获取-公共参数-平台
     *  org.springframework.web.context.request.RequestContextHolder#getRequestAttributes() 返回当前绑定到线程的请求属性
     *  org.springframework.web.context.request.ServletRequestAttributes#getRequest() 返回HttpServletRequest
     *  javax.servlet.http.HttpServletRequest#getHeader(java.lang.String) 获取请求头信息
     * @return
     */
    public static Integer getPlatform() {
        String platform = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getHeader(Constant.PLATFORM);
        if(StringUtils.isBlank(platform)){
            return null;
        }
        return Integer.valueOf(platform);
    }
}
