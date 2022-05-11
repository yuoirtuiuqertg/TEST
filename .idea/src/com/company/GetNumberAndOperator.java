package com.company;

public class GetNumberAndOperator { // разбераюсь с количеством переменных и оператором
    public String[] arrOperatorNums() throws Exp {
        Сin cin = new Сin();
        String temp = cin.getOperation();
        String[] arrOp = temp.split(" ");
        if(arrOp.length == 1) throw new Exp("В строке содержится только одна переменная либо один оператор" , 1);
        if(arrOp.length != 3) throw new Exp("В строке больше операторов и переменных " , 2);
        return arrOp;
    }
}

