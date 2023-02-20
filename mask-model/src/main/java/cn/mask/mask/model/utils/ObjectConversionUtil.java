package cn.mask.mask.model.utils;

import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.springframework.beans.BeanUtils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ObjectConversionUtil {
    private ObjectConversionUtil() {
    }

    public static <T, S> T convert(T target, S source) throws MaskException {
        if (null != source && null != target) {
            try {
                ConvertUtils.register(new DateConverter(null), Date.class);
                BeanUtils.copyProperties(source, target);
                return target;
            } catch (Exception var3) {
                throw new MaskException(ResultCode.ACCESS_PERMISSION_EXCEPTION, "对象类型转换异常:" + var3.getMessage());
            }
        } else {
            return null;
        }
    }

    public static Map<String, Object> transBean2Map(Object obj) {
        if (obj == null) {
            return null;
        } else {
            Map<String, Object> map = new HashMap();
            PropertyDescriptor[] propertyDescriptors = getPropertyDescriptor(obj);
            Arrays.stream(propertyDescriptors).filter((property) -> {
                return !"class".equals(property.getName());
            }).forEach((property) -> {
                Method getter = property.getReadMethod();
                Object value = null;
                String key = property.getName();

                try {
                    value = getter.invoke(obj);
                } catch (InvocationTargetException | IllegalAccessException var7) {
                    var7.printStackTrace();
                }

                map.put(key, value);
            });
            return map;
        }
    }

    private static PropertyDescriptor[] getPropertyDescriptor(Object obj) {
        BeanInfo beanInfo = null;

        try {
            beanInfo = Introspector.getBeanInfo(obj.getClass());
        } catch (IntrospectionException var3) {
            var3.printStackTrace();
        }

        return beanInfo != null ? beanInfo.getPropertyDescriptors() : new PropertyDescriptor[0];
    }

    public static <T> T transMap2Bean(Map<String, Object> map, T obj) {
        if (obj == null) {
            return null;
        } else {
            PropertyDescriptor[] propertyDescriptors = getPropertyDescriptor(obj);
            Arrays.stream(propertyDescriptors).filter((property) -> {
                return !"class".equals(property.getName());
            }).forEach((property) -> {
                Method setter = property.getWriteMethod();
                String key = property.getName();

                try {
                    Object value = map.get(key);
                    if (value != null) {
                        setter.invoke(obj, value);
                    }
                } catch (InvocationTargetException | IllegalAccessException var6) {
                    var6.printStackTrace();
                }

            });
            return obj;
        }
    }

    public static <T> T map2Bean(Map<String, Object> map, T t) {
        if (map != null && t != null) {
            try {
                org.apache.commons.beanutils.BeanUtils.populate(t, map);
            } catch (Exception var3) {
                var3.printStackTrace();
            }

            return t;
        } else {
            return null;
        }
    }
}
