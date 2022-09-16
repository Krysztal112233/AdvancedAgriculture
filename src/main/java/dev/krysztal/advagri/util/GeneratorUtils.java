package dev.krysztal.advagri.util;

import dev.krysztal.advagri.annotations.DontGen;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneratorUtils {

    public static <T> ArrayList<T> collect(Class<?> clazz) {
        var arrayList = new ArrayList<T>();
        Arrays.stream(clazz.getFields())
//                .filter(field -> field.getAnnotation(DontGen.class) == null)
                .forEach(field -> {
                    try {
                        field.setAccessible(true);
                        var casted = (T) field.get(clazz);
                        field.setAccessible(false);
                        arrayList.add(casted);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });

        return arrayList;
    }

    public static <T> ArrayList<T> collectDontGen(Class<?> clazz) {
        var arrayList = new ArrayList<T>();
        Arrays.stream(clazz.getFields())
                .filter(field -> field.getAnnotation(DontGen.class) != null)
                .forEach(field -> {
                    try {
                        field.setAccessible(true);
                        var casted = (T) field.get(clazz);
                        field.setAccessible(false);
                        arrayList.add(casted);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });

        return arrayList;
    }

}
