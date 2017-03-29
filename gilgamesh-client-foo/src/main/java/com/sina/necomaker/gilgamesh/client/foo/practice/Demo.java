package com.sina.necomaker.gilgamesh.client.foo.practice;

/**
 * Created by guiqiang on 14/03/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 321;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        /**
         * System.out.println(var3 == var4);
         */
        System.out.println(c == d);

        /**
         * System.out.println(var5 == var6);
         */
        System.out.println(e == f);

        /**
         * System.out.println(var3.intValue() == var1.intValue() + var2.intValue());
         */
        System.out.println(c == (a + b));

        /**
         * System.out.println(var3.equals(Integer.valueOf(var1.intValue() + var2.intValue())));
         */
        System.out.println(c.equals(a + b));

        /**
         * System.out.println(var7.longValue() == (long)(var1.intValue() + var2.intValue()));
         * 说明"=="号是支持数据转型的
         */
        System.out.println(g == (a + b));

        /**
         * System.out.println(var7.equals(Integer.valueOf(var1.intValue() + var2.intValue())));
         * 说明equals方法是不支持数据转型的
         */
        System.out.println(g.equals(a + b));
    }

}
