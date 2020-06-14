package cn.zxl.proxy;

import cn.zxl.annotation.AnnotationInject;
import cn.zxl.proxy.invocation.ProxyHandle;
import cn.zxl.service.ResultService;

import java.lang.reflect.Proxy;

/**
 * @author JavaZ5G
 * @date 2020/5/31 11:08 AM
 */
public class ProxyFactory {
    public static Object proxyBase(Object object, ResultService method){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),
                new ProxyHandle(AnnotationInject.getBean(object), method));
    }

    @SuppressWarnings("unchecked")
    public static <T> T studyWhat(Class<?> clazz, ResultService method){
        Object o = null;
        try {
            o = proxyBase(clazz.newInstance(), method);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T)o;
    }
}
