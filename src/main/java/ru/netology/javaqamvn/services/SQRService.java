
package ru.netology.javaqamvn.services;

public class SQRService {

    public int calcSqrt(int unRange, int upRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrt = i*i;
            if (sqrt >= unRange && sqrt <= upRange) {
                count++;
            }
        }
        return count;
    }
}