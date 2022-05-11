package com.company;

public class Main {

    public static void main(String[] args) {
        GetNumberAndOperator arrOperation = new GetNumberAndOperator();
        Romain numberRomain = new Romain();
        Arabian numberArabian = new Arabian();
        MathOperator romainOrArabian = new MathOperator();

        try{
            String[] temp = arrOperation.arrOperatorNums();
            if(romainOrArabian .ArabinOrRomane(temp)== true) {
                int te = numberRomain.otvet(temp);
                String str = String.valueOf(te);
                System.out.print(te);
            } else {
                int tem = numberArabian.CalculaterArabian(numberArabian.numReem(temp[0]),numberArabian.numReem(temp[2]) , temp[1]);
                System.out.println(numberArabian.transformNumberRomanNumeral(tem));
            }
        } catch (Exp e){
            System.out.println("Текст Ошибки : " + e.getMessage());
            System.out.println("Код ошибки : " + e.getNumber());
        }
    }
}
