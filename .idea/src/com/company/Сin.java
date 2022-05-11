package com.company;

import java.util.Scanner;

public class Сin { // ввожу пример
    private String operation;
    public String getOperation(){
        operation = numbers();
        return operation;
    }
    private String numbers() {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        return number;
    }
}

