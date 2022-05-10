package com.company;

import java.util.Scanner;

public class Calc extends Exception {
    private String oneNum, twoNum;
    private int oneNumArab = -999, twoNumArab = -999;
    private String mathOper;
    private static Calc stringNum = new Calc();
    private String numbers() {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        return number;
    }
    public static void calc() {
        System.out.print("Введите ваш пример : ");
        String temp = stringNum.numbers();
        temp.trim();
        String[] arrNumbers = temp.split(" ");
        if (arrNumbers.length == 1){
            try {
                throw new Exception ("//т.к. строка не является математической операцией");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(1);
        }
        if (arrNumbers.length != 3 ) {
            try {
                throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(1);

        } else {
            ArrabianNumberOrReemNumber(arrNumbers[0], arrNumbers[2]);
            stringNum.mathOper = arrNumbers[1];
            if (stringNum.oneNumArab != -999 && stringNum.oneNumArab != -999) {
                if (stringNum.oneNumArab <= 10 && stringNum.oneNumArab >= -10 && stringNum.twoNumArab <= 10 && stringNum.twoNumArab >= -10) {
                    System.out.print("Ваш ответ : " + stringNum.CalculaterArabian(stringNum.oneNumArab, stringNum.twoNumArab));
                } else {
                    try {
                        throw new Exception("число больше 10 , или меньше -10");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.exit(1);
                }
            } else {
                if (stringNum.CalculaterReem(stringNum.oneNum, stringNum.twoNum) == 0){
                    try {
                        throw new Exception("//т.к. в римской системе не существует 0");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.exit(1);
                }
                if (stringNum.CalculaterReem(stringNum.oneNum, stringNum.twoNum) > 0) {
                    System.out.print("Ваш ответ : " + transformNumberRomanNumeral(stringNum.CalculaterReem(stringNum.oneNum, stringNum.twoNum)));
                } else {
                    try {
                        throw new Exception("//т.к. в римской системе нет отрицательных чисел или введенного числа вообще не сущестует");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.exit(1);
                }
            }

        }
    }
    private static void ArrabianNumberOrReemNumber (String num1 ,String num2) throws NumberFormatException{
        try {
            stringNum.oneNumArab = Integer.valueOf(num1);
            stringNum.twoNumArab = Integer.valueOf(num2);
        } catch (NumberFormatException e){
            if(stringNum.twoNumArab == -999 && stringNum.oneNumArab == -999) {
                stringNum.oneNum = num1;
                stringNum.twoNum = num2;
            } else {
                try {
                    throw new Exception("//т.к. используются одновременно разные системы счисления");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.exit(1);
            }
        }

    }
    private   int CalculaterArabian(int num1 , int num2){
        switch (stringNum.mathOper){
            case("+"): return stringNum.oneNumArab + stringNum.twoNumArab;
            case("-"): return stringNum.oneNumArab - stringNum.twoNumArab;
            case("*"): return stringNum.oneNumArab * stringNum.twoNumArab;
            case("/"): return Math.round(stringNum.oneNumArab / stringNum.twoNumArab);
            default: return -200;
        }

    }
    private int numReem (String num ){
        switch(num){
            case("I"): return 1;
            case("II"): return 2;
            case("III"): return 3;
            case("IV"): return 4;
            case("V"): return 5;
            case("VI"): return 6;
            case("VII"): return 7;
            case("VIII"): return 8;
            case("IX"): return 9;
            case("X"): return 10;
            default: return -2000;
        }
    }
    private int CalculaterReem(String num1 , String num2){
        switch (stringNum.mathOper){
            case("+"): return numReem(num1) + numReem(num2);
            case("-"): return numReem(num1) - numReem(num2);
            case("*"): return numReem(num1) * numReem(num2);
            case("/"): return Math.round(numReem(num1) / numReem(num2));
            default: return -1;
        }
    }
    private static String transformNumberRomanNumeral(int num) {
        int[] romanValueList = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanCharList = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < romanValueList.length; i += 1) {
            while (num >= romanValueList[i]){
                num -= romanValueList[i];
                res.append(romanCharList[i]);
            }
        }
        return res.toString();
    }
}