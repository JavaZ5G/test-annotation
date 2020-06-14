package cn.zxl;

import cn.zxl.proxy.ProxyFactory;
import cn.zxl.service.ResultService;
import cn.zxl.service.StudyService;
import cn.zxl.service.impl.StudyServiceImpl;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudyService english = ProxyFactory.studyWhat(StudyServiceImpl.class, new ResultService() {
            @Override
            public void before(Object proxy, Method method, Object[] args) {
                System.out.println("代理开始");
            }

            @Override
            public void after(Object proxy, Method method, Object[] args) {
                System.out.println("代理结束");
            }
        });
        System.out.println(english.getName());
    }
}
