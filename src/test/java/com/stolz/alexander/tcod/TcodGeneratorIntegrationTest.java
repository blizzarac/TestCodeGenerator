package com.stolz.alexander.tcod;

import com.stolz.alexander.tcod.testclasses.PrimitiveTypesClass;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * Created by alexanderstolz on 12/2/16.
 */
public class TcodGeneratorIntegrationTest {

    @Test
    public void shouldReturnCorrectNumberOfSettersForPrimitiveFields() {
        // Given
        TcodGenerator<PrimitiveTypesClass> sut = new TcodGenerator<>();
        PrimitiveTypesClass clazz = new PrimitiveTypesClass(42, 52.4f, 63.0, 5L, "");

        // When
        List<String> result = sut.generate(clazz);

        // Then
        assertThat(result.size(), is(6));
    }

    @Test
    public void shouldReturnCorrectInitializationForRootObject() {
        // Given
        TcodGenerator<PrimitiveTypesClass> sut = new TcodGenerator<>();
        PrimitiveTypesClass clazz = new PrimitiveTypesClass(42, 52.4f, 63.0, 5L, "");

        // When
        List<String> result = sut.generate(clazz);

        // Then
        assertThat(result.get(0), is("PrimitiveTypesClass primitiveTypesClass1 = new PrimitiveTypesClass();"));
    }

    @Test
    public void shouldReturnCorrectSettersForIntFields() {
        // Given
        TcodGenerator<PrimitiveTypesClass> sut = new TcodGenerator<>();
        PrimitiveTypesClass clazz = new PrimitiveTypesClass(42, 52.4f, 63.0, 5L, "");

        // When
        List<String> result = sut.generate(clazz);

        // Then
        assertThat(result.get(1), is("primitiveTypesClass1.setA(42);"));
    }
}




