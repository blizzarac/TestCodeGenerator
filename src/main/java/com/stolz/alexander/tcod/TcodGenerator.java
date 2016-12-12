package com.stolz.alexander.tcod;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alexanderstolz on 12/2/16.
 */
public class TcodGenerator<T> {
    public List<String> generate(T object) {
        Generators<T> gen = new Generators<>();
        String resultBuffer = gen.generateConstructorCall(object, "1");




        return Arrays.asList(resultBuffer.toString(), "", "", "", "", "");
    }


}
