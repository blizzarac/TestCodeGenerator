package com.stolz.alexander.tcod;

import com.stolz.alexander.tcod.testclasses.PrimitiveTypesClass;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexanderstolz on 12/2/16.
 */
public class ReflectionHelperTest {

    @Test
    public void shouldReturnEmptyListIfNoSettableMethods() {
        // Given
        ReflectionHelper<PrimitiveTypesClass> sut = new ReflectionHelper<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();

        // When
        List<String> allSettableMethods = sut.getAllSettableMethods(obj);

        // Then
        assertThat(allSettableMethods.size(), is(5));
    }

    @Test
    public void shouldReturnCorrectMethodForGetA() {
        // Given
        ReflectionHelper<PrimitiveTypesClass> sut = new ReflectionHelper<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();

        // When
        List<String> allSettableMethods = sut.getAllSettableMethods(obj);

        // Then
        assertThat(allSettableMethods.get(0), is("A"));
    }

    @Test
    public void shouldReturnCorrectMethodForGetB() {
        // Given
        ReflectionHelper<PrimitiveTypesClass> sut = new ReflectionHelper<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();

        // When
        List<String> allSettableMethods = sut.getAllSettableMethods(obj);

        // Then
        assertThat(allSettableMethods.get(1), is("B"));
    }

    @Test
    public void shouldReturnCorrectMethodForGetC() {
        // Given
        ReflectionHelper<PrimitiveTypesClass> sut = new ReflectionHelper<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();

        // When
        List<String> allSettableMethods = sut.getAllSettableMethods(obj);

        // Then
        assertThat(allSettableMethods.get(2), is("C"));
    }

    @Test
    public void shouldReturnCorrectMethodForGetD() {
        // Given
        ReflectionHelper<PrimitiveTypesClass> sut = new ReflectionHelper<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();

        // When
        List<String> allSettableMethods = sut.getAllSettableMethods(obj);

        // Then
        assertThat(allSettableMethods.get(3), is("D"));
    }

    @Test
    public void shouldReturnCorrectMethodForGetE() {
        // Given
        ReflectionHelper<PrimitiveTypesClass> sut = new ReflectionHelper<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();

        // When
        List<String> allSettableMethods = sut.getAllSettableMethods(obj);

        // Then
        assertThat(allSettableMethods.get(4), is("E"));
    }

    @Test
    public void shouldReturnCorrectIntForExecutedGetter() throws Exception {
        // Given
        ReflectionHelper<PrimitiveTypesClass> sut = new ReflectionHelper<>();
        PrimitiveTypesClass obj = new PrimitiveTypesClass();
        obj.setA(42);

        // When
        int executionResult = sut.executeMethodNameGetter(obj, "A");

        // Then
        assertThat(executionResult, is(42));
    }
}
