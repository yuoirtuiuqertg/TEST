package com.company;

public class GetNumberAndOperator { // разбераюсь с количеством переменных и оператором
    private String oneNum, twoNum,operator;
    private String[] oper = {"*", "/","-","="};

    private boolean thisIsTrue( String num){
        switch (num){
            case("+"): return true;
            case("-"): return true;
            case("*"): return true;
            case("/"): return true;
            default: return false;
        }
    }

    public String[] arrOperatorNums() throws Exp {
        Сin cin = new Сin();
        String temp = cin.getOperation();
        String[] arrOp = temp.split(" ");
        if(arrOp.length == 1) throw new Exp("В строке содержится только одна переменная либо один оператор" , 1);
        if(arrOp.length != 3) throw new Exp("В строке больше операторов и переменных " , 2);
        oneNum = arrOp[0];
        twoNum = arrOp[2];
        operator = arrOp[1];
        return arrOp;
    }
}

