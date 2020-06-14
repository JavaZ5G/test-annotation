package cn.zxl.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author JavaZ5G
 * @date 2020/5/30 11:24 PM
 */
public class AnnotationInject {
    public static Object getBean(Object object){
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field: fields) {
            Study test = field.getAnnotation(Study.class);
            if (null != test){
                System.out.println("name:" + test.name() + "; value:" + test.value());
                try {
                    object.getClass()
                            .getMethod("set" +  field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1), new Class<?>[]{String.class})
                            .invoke(object, test.name());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }

        Method[] methods = object.getClass().getMethods();
        for (Method method: methods){
            Study test = method.getAnnotation(Study.class);
            if (null != test){
                System.out.println("name:" + test.name() + "; value:" + test.value());
                try {
                    method.invoke(object, test.value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return object;
    }
}
