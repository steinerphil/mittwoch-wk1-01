package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(mystring (sum(20, 30)));

    }

    public static int sum(int int1, int int2){
        boolean check = int1 > 100 && int2 > 100;
        System.out.println("einer der werte >100 ?: " + check);
        return int1 + int2;
    }

    public static String mystring(int int1){
        return "Summe: " + int1 ;
    }
}
