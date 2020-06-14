package cn.zxl.service.impl;

import cn.zxl.service.ResultService;

import java.lang.reflect.Method;

/**
 * @author JavaZ5G
 * @date 2020/6/5 11:19 PM
 */
public class ResultServiceImpl implements ResultService {
    @Override
    public void before(Object proxy, Method method, Object[] args) {
        System.out.println("代理开始");
        System.out.println(method.getName());
        System.out.println(args);
    }

    @Override
    public void after(Object proxy, Method method, Object[] args) {
        System.out.println("代理结束");
        System.out.println(method.getName());
        System.out.println(args);
    }
}
