package com.exemples_tests;

/*Класс реализует калькулятор*/

public class Calculator {
                        /*Результат вычисления*/
    private int result;
                        /*Суммируем аргументы
                        @params Аргументы суммирования*/
    public void add(int ... params){
        for (int param : params){
            this.result += param;
        }
    }

    public void div(int ... args){
        if (args.length > 0) {
    } else {
        }
    }
                        /*Получить результат*/
                        /*@return результат вычисления*/
    public int getResult(){
        return this.result;
    }
                        /*@return результат вычисления*/
    public void cleaneResult(){
        this.result = 0;
    }
}
