package hw_06.runner;

import hw_06.reflection.ModelClass;
import hw_06.reflection.ReflectionUtil;

import java.lang.reflect.Method;

public class DemoReflection {
    public static void main(String[] args) {
        String fieldName = "name";
        String methodName = "getName";
        ModelClass mc = new ModelClass("Sport");
        Class<ModelClass> modelClass = ModelClass.class;
        System.out.println("Get Field\n" + ReflectionUtil.getField(modelClass, fieldName));
        System.out.println("Get Method\n" + ReflectionUtil.getMethod(modelClass, methodName));
        System.out.println("Get All Methods\n");
        for (Method method : ReflectionUtil.getArrayOfMethod(modelClass)) {
            System.out.println(method);
        }
        System.out.println("Invoke method\n");
        ReflectionUtil.invokeMethod(ReflectionUtil.getMethod(modelClass, "printName"), mc);
        System.out.println("Change field\nPast field name: " + mc.getName());
        ReflectionUtil.setField(ReflectionUtil.getField(modelClass, fieldName), mc, "NoSport");
        System.out.println("New field name: " + mc.getName());
    }
}

