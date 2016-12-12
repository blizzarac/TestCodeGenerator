package com.stolz.alexander.tcod;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionHelper<T> {

    public List<String> getAllSettableMethods(T object) {
        HashSet<String> getterFound = new HashSet<>();
        HashSet<String> setterFound = new HashSet<>();

        Arrays.asList(object.getClass().getDeclaredMethods()).stream().forEach(method -> {
            String methodName = method.getName();
            switch (methodName.substring(0, 3)) {
                case "get":
                    getterFound.add(method.getName().substring(3));
                    break;
                case "set":
                    setterFound.add(method.getName().substring(3));
                    break;
            }
        });

        return getterFound.stream().filter(getter -> setterFound.contains(getter)).collect(Collectors.toList());
    }

    public <G> G executeMethodNameGetter(T object, String name) throws Exception {
        try {
            return (G)object.getClass().getDeclaredMethod("get" + name).invoke(object);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new Exception(e);
        }
    }
}
