package com.stolz.alexander.tcod;

import com.stolz.alexander.tcod.testclasses.PrimitiveTypesClass;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexanderstolz on 12/2/16.
 */
public class GeneratorsTest {

    @Test
    public void shouldGenerateFiveSettersForPrimitiveTypesClass() {
        // Given
        Generators<PrimitiveTypesClass> sut = new Generators<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();

        // When
        List<String> result = sut.generateSetters(obj, "1");

        // Then
        assertThat(result.size(), is(5));
    }

    @Test
    public void shouldGenerateSetterForAFromPrimitiveTypesClass() {
        // Given
        Generators<PrimitiveTypesClass> sut = new Generators<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();
        obj.setA(3);

        // When
        List<String> result = sut.generateSetters(obj, "1");

        // Then
        assertThat(result.get(0), is("primitiveTypesClass1.setA(3);"));
    }

    @Test
    public void shouldGenerateSetterForBFromPrimitiveTypesClass() {
        // Given
        Generators<PrimitiveTypesClass> sut = new Generators<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();
        obj.setB(3.4f);

        // When
        List<String> result = sut.generateSetters(obj, "1");

        // Then
        assertThat(result.get(1), is("primitiveTypesClass1.setB(3.4f);"));
    }
}
