package com.company;

public class Arabian { // сдесь я провожу операции на римскими цифрами
    public int numReem (String num ) throws Exp{
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
            default: throw new Exp("Эта буква не относится к Римской" , 3);
        }
    }
    public   int CalculaterArabian(int num1 , int num2 , String mathOper)throws Exp{
        //if(num1 + num2 <= 0 || num1 * num2 <= 0 ||num1 - num2 <= 0 ||num1 / num2 <= 0)  throw new Exp("Сумма не может быть отрицательной в римской математике" , 11);
        switch (mathOper){
            case("+"): if(num1 + num2 <= 0){throw new Exp("Сумма не может быть отрицательной в римской математике" , 11);}  return num1 + num2;
            case("-"): if(num1 - num2 <= 0){throw new Exp("Сумма не может быть отрицательной в римской математике" , 11);} return num1 - num2;
            case("*"): if(num1 * num2 <= 0){throw new Exp("Сумма не может быть отрицательной в римской математике" , 11);} return num1 * num2;
            case("/"): if(num1 / num2 <= 0){throw new Exp("Сумма не может быть отрицательной в римской математике" , 11);} return num1 / num2;
            default: throw new Exp("В строке введен не правильный оператор " , 3);
        }
    }

    public static String transformNumberRomanNumeral(int num) {
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

