package cn.jml.work.report.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 20:34
 **/
public class ObjectUtil {

    public static Object transferTo(Object from, Class toClazz) throws Exception {
        Map<String, Object> map = transferTo(from);
        Object target = toClazz.newInstance();
        Field[] fields = toClazz.getFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++)
            fieldNames[i] = fields[i].getName();
        Method[] methods = toClazz.getMethods();
        for (int j = 0; j < methods.length; j++)
            for (int k = 0; k < fieldNames.length; k++)
                if (methods[j].getName().contains("set") && methods[j].getName().contains(fieldNames[k]))
                    methods[j].invoke(target, map.get(fieldNames[k]));
        return target;
    }

    public static Map<String, Object> transferTo(Object object) throws Exception {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            String fieldName = field.getName();
            map.put(fieldName, getFiledValue(field, object));
        }
        return map;
    }

    /**
     * 获取字段值
     * 
     * @param field
     * @param obj
     * @return
     */
    private static Object getFiledValue(Field field, Object obj) throws IllegalAccessException {
        // 获取原有的访问权限
        boolean access = field.isAccessible();
        try {
            // 设置可访问的权限
            field.setAccessible(true);
            return field.get(obj);
        } finally {
            // 恢复访问权限
            field.setAccessible(access);
        }
    }

}
