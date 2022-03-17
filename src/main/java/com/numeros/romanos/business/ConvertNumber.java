package com.numeros.romanos.business;

public class ConvertNumber {

    public String execute(Integer num) {
        Integer x = 0;
        String result = "";

        if (num >= 1000) {
            x = num / 1000;
            num = num % 1000;
            result = "M".repeat(x);
        }

        if (num >= 900) {
            num = num - 900;
            result = result.concat("CM");
        }

        if (num >= 500) {
            num = num % 500;
            result = result.concat("D");
        }

        if (num >= 100) {
            x = num / 100;
            num = num % 100;
            if (x.equals(4)) {
                result = result.concat("CD");
            } else {
                result = result.concat("C".repeat(x));
            }
        }

        if (num >= 90) {
            num = num - 90;
            result = result.concat("XC");
        }

        if (num >= 50) {
            num = num % 50;
            result = result.concat("L");
        }

        if (num >= 10) {
            x = num / 10;
            num = num % 10;
            if (x.equals(4)) {
                result = result.concat("XL");
            } else {
                result = result.concat("X".repeat(x));
            }
        }

        if (num == 9) {
            num = 0;
            result = result.concat("IX");
        }

        if (num >= 5) {
            num = num % 5;
            result = result.concat("V");
        }

        if (num.equals(4)) {
            result = result.concat("IV");
        } else {
            result = result.concat("I".repeat(num));
        }

        return result;
    }

}
