package com.example.interview.subject2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：王开峰的方案
 * @Author：GuoFeng
 * @CreateTime：2022-05-18
 */
public class PlanA {
    public static void main(String[] args) {
        List<Integer> startStr = new ArrayList<>();
        startStr.add(1);
        List<Integer> nextStr = new ArrayList<>();
        for (int n = 0; n < startStr.size(); n++) {
            System.out.println(startStr.get(n) + " ");
        }
        for (int i = 0; i < 9; i++) {
            if (i > 0) {
                startStr = new ArrayList<>();
                startStr.addAll(nextStr);
                nextStr = new ArrayList<>();
            }
            int startValue = startStr.get(0);
            int nextValue = 1;
            int count = 1;
            for (int j = 0; j < startStr.size(); j++) {
                if (startValue == 0) {
                    startValue = startStr.get(j);
                }
                if (j == (startStr.size() - 1)) {
                    nextValue = 0;
                } else {
                    nextValue = startStr.get(j + 1);
                }
                if (nextValue == startValue) {
                    count++;
                }
                if (nextValue != startValue || j == (startStr.size() - 1)) {
                    nextStr.add(count);
                    nextStr.add(startValue);
                    startValue = 0;
                    count = 1;
                }
            }

            for (int n = 0; n < nextStr.size(); n++) {
                System.out.print(nextStr.get(n) + " ");
            }
            System.out.println();
        }
    }
}
