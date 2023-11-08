package org.example.story7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class BuchuReflection {
    public static Class getClassByReflection(Object clazz) {
        return clazz.getClass();
    }

    public static void showClassInfo(Class demoClass) {
        String className = demoClass.getName();
        System.out.println("class name: " + className);

        String canonicalClassName = demoClass.getCanonicalName();
        System.out.println("canonical class name: " + canonicalClassName);

        String simpleClassName = demoClass.getSimpleName();
        System.out.println("simple class name: " + simpleClassName);

        String packageName = demoClass.getPackageName();
        System.out.println("package name: " + packageName);

        String toString = demoClass.toString();
        System.out.println("toString: " + toString);
    }

    public static void showFieldInfo(Class demoClass) {
        Field[] fields = demoClass.getFields();
        Field[] declaredFields = demoClass.getDeclaredFields();

        System.out.format("length of fields & declaredFields: %d, %d\n",
                fields.length,
                declaredFields.length);

        for (Field field : declaredFields) {
            String fieldName = field.getName();
            String modifier = Modifier.toString(field.getModifiers());
            String fieldType = field.getType().getSimpleName();

            System.out.format("%s %s %s\n", modifier, fieldType, fieldName);
        }
    }

    public static void showMethodInfo(Class demoClass) {
        Method[] methods = demoClass.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            String modifier = Modifier.toString(method.getModifiers());
            Parameter[] parameters = method.getParameters();

            System.out.format("method: %s %s\n", modifier, name);

            System.out.format("parameter: ");
            for (Parameter parameter : parameters) {
                System.out.format("%s %s; ",
                        parameter.getType().getSimpleName(),
                        parameter.getName());
            }
            System.out.println();
        }
    }
}
