package ru.netology.javaqamvn.services;

public class SQRService {

    public int calcSqrt(int from, int to) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrt = i*i;
            if (sqrt >= from && sqrt <= to) {
                count++;
            }
        }
        return count;
    }
}
