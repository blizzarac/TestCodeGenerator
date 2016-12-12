package com.stolz.alexander.tcod.testclasses;

/**
 * Created by alexanderstolz on 12/2/16.
 */
public class PrimitiveTypesClass {
    private int a;
    private float b;
    private double c;
    private long d;
    private String e;

    public PrimitiveTypesClass() {}

    public PrimitiveTypesClass(int a, float b, double c, long d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }
}
