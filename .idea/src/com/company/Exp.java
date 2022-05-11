package com.company;

public class Exp extends Exception { // класс ошибки (создаю кастом)
    private int number;
    public int getNumber(){return number;}
    public Exp (String message, int num){
        super(message);
        number=num;
    }
}
