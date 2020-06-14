package cn.zxl.service;

import java.lang.reflect.Method;

/**
 * @author JavaZ5G
 * @date 2020/6/5 11:09 PM
 */
public interface ResultService {
    void before(Object proxy, Method method, Object[] args);
    void after(Object proxy, Method method, Object[] args);
}
