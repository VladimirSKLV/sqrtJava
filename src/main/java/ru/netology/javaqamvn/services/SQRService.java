package ru.netology.javaqamvn.services;

import static com.sun.tools.doclint.Entity.and;

public class SQRService {

    public int calcSqrt(int from, int to) {
        int lim = (int) Math.sqrt(to);
        int sqrs = 0;
        for (int i = 1; i <= 99; i++) {
            if (i * i >= from && i * i <= to) {
                sqrs++;
            }
        }
        return sqrs;
    }
}
