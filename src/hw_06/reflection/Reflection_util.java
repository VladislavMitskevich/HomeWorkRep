package hw_06.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection_util {

    /**
     * @param className - класс, в котором ищем поле
     * @param fieldName - название поля
     * @return поле класса className
     */
    public static Field getField(Class<?> className, String fieldName) throws NullPointerException {
        Field field = null;
        try {
            field = className.getDeclaredField(fieldName);
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } finally {
            field.setAccessible(false);
        }
        return field;
    }

    /**
     * @param className  - класс, в котором ищем метод
     * @param methodName - название метода
     * @return метод класса className
     */
    public static Method getMethod(Class<?> className, String methodName) throws NullPointerException {
        Method method = null;
        try {
            method = className.getDeclaredMethod(methodName);
            method.setAccessible(true);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } finally {
            method.setAccessible(false);
        }
        return method;
    }

    /**
     * @param className - класс, в котором ищем методы
     * @return поля класса className
     */
    public static Method[] getArrayOfMethod(Class<?> className) {
        Method[] method = null;
        method = className.getDeclaredMethods();
        return method;
    }

    /**
     * @param methodName - метод, который будем вызывать
     * @param objectName - объект, у которого вызываем метод
     */
    public static void invokeMethod(Method methodName, Object objectName) {
        methodName.setAccessible(true);
        try {
            objectName = methodName.invoke(objectName);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } finally {
            methodName.setAccessible(false);
        }
    }

    /**
     * @param fieldName  - поле, которое будем переопределять
     * @param objectName - объект, у которого меняем поле
     * @param value      - значение устанавливаемое
     */
    public static void setField(Field fieldName, Object objectName, Object value) {
        fieldName.setAccessible(true);
        try {
            fieldName.set(objectName, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            fieldName.setAccessible(false);
        }
    }

    /**
     * @param className  - класс с методом
     * @param methodName - имя метода
     * @param parametrs  - парметры передаваемые в метод
     * @return параметризированный метод
     */
    public static Method getMethodWithParameter(Class<?> className, String methodName, Class<?>... parametrs)
            throws NullPointerException {
        Method method = null;
        try {
            method = className.getDeclaredMethod(methodName, parametrs);
            method.setAccessible(true);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } finally {
            method.setAccessible(false);
        }
        return method;
    }

    /**
     * @param object     - класс с методом
     * @param methodName - имя метода
     * @param parametrs  - парметры передаваемые в метод
     */
    public static void invokeParameterMethod(Object object, Method methodName, Object... parametrs) {
        methodName.setAccessible(true);
        try {
            object = methodName.invoke(object, parametrs);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
