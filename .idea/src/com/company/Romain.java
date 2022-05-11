package com.company;

public class Romain { // сдесь я провожу операции на арабскими цифрами

    public int stringInInt(String num) {
        int temp = Integer.valueOf(num);
        return temp;
    }
    public int otvet (String [] temp) throws Exp{
        int num1 = stringInInt(temp[0]);
        int num2 = stringInInt(temp[2]);
        if ((num1 > 10 || num1 < -10) && (num2 > 10 || num2 < -10)) throw new Exp("Первая и Вторая переменная не в границе [-10; 10] " , 4);
        if (num1 > 10 || num1 < -10) throw new Exp("Первая переменная не в границе [-10; 10] " , 6);
        if (num2 > 10 || num2 < -10) throw new Exp("Вторая переменная не в границе [-10; 10] " , 5);
        switch (temp[1]){
            case("+"): return num1 + num2;
            case("-"): return num1 - num2;
            case("*"): return num1 * num2;
            case("/"): return Math.round(num1 / num2);
            default: throw new Exp("В строке введен не правильный оператор " , 3);
        }
    }
}

