package com.company;

public class MathOperator  { // сдесь я проверяю арабское число или римское
    public boolean ArabinOrRomane(String[] temp) throws Exp {
        if ((temp[0].matches("[-+]?\\d+") == false && temp[2].matches("[-+]?\\d+") == true)
                || (temp[0].matches("[-+]?\\d+") == true && temp[2].matches("[-+]?\\d+") == false)){
            throw new Exp("Нельзя складывать римские и Арабские цифры" , 8);
        }
        if(temp[0].matches("[-+]?\\d+") == true && temp[2].matches("[-+]?\\d+") == true){
            return true;
        } else {
            return false;
        }

    }

}
