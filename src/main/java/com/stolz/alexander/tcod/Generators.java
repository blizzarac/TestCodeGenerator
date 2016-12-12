package com.stolz.alexander.tcod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexanderstolz on 12/2/16.
 */
public class Generators<T> {

    public String generateConstructorCall(T object, String instancePostFix) {
        StringBuffer resultBuffer = new StringBuffer();

        resultBuffer.append(object.getClass().getSimpleName());
        resultBuffer.append(" ");
        resultBuffer.append(
                Character.toLowerCase(object.getClass().getSimpleName().charAt(0))
                        + object.getClass().getSimpleName().substring(1) + instancePostFix);
        resultBuffer.append(" = ");
        resultBuffer.append("new " + object.getClass().getSimpleName() + "();");

        return resultBuffer.toString();
    }

    public List<String> generateSetters(T object, String instancePostFix) {
        List<String> result = new ArrayList<>();
        String instanceName = Character.toLowerCase(object.getClass().getSimpleName().charAt(0))
                + object.getClass().getSimpleName().substring(1) + instancePostFix;

        ReflectionHelper<T> reflectionHelper = new ReflectionHelper<>();
        List<String> allSettableMethods = reflectionHelper.getAllSettableMethods(object);

        allSettableMethods.stream().forEach(method -> {
            final Object o;
            try {
                o = reflectionHelper.executeMethodNameGetter(object, method);
                result.add(instanceName + ".set" + method + "("+ o +");");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        return result;
    }
}
