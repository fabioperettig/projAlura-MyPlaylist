package com.fabioperettig.myMusic;

public class test {

    int atributo = 2;
    static int atributoStatic = 2;

    public static int somaClass(int a, int b) {
        return a+b;
    }

    public static int somaStatic(int a, int b) {
        return (a+b)*atributoStatic;
    }

    public int somaObj(int a, int b) {
        return a+b;
    }

    public int somaObjAtrib(int a) {
        int result = a + atributo;
        this.atributo ++;
        return result;
    };
}
