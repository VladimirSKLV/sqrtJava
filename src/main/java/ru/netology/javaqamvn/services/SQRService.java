package ru.netology.javaqamvn.services;

import static com.sun.tools.doclint.Entity.and;

public class SQRService {

    public int calcSqrt (int a, int b) {
        int lim = (int) Math.sqrt(b);
        int sqrs = 0;
        for (int i = 1; i <=99; i++) {
            if (i*i >= a && i*i <= b) {
                sqrs++;
            }
        }
        return sqrs;
    }
}
