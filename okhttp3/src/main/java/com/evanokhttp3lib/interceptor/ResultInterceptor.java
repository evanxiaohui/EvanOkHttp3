package com.evanokhttp3lib.interceptor;

import com.evanokhttp3lib.HttpInfo;

/**
 * 请求结果拦截器
 * @author zhousf
 */
public interface ResultInterceptor {

    HttpInfo intercept(HttpInfo info) throws Exception;

}
