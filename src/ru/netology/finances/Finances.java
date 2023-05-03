package ru.netology.finances; //Указали пакет

public class Finances {
    public static int calcPayment(int amount, int start, int years) {
        return (amount - start) / (years * 12); //формула расчета
    }
}

