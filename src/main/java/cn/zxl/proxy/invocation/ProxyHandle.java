package cn.zxl.proxy.invocation;

import cn.zxl.service.ResultService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author JavaZ5G
 * @date 2020/6/3 11:46 PM
 */
public class ProxyHandle implements InvocationHandler {
    private ResultService method;
    private Object object;

    public ProxyHandle(Object object, ResultService method){
        this.method = method;
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        this.method.before(proxy, method, args);
        result = method.invoke(object, args);
        this.method.after(proxy, method, args);
        return result;
    }
}
