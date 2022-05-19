package com.example.interview.subject2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description：我的方案
 * @Author：GuoFeng
 * @CreateTime：2022-05-18
 */
public class B {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1);
        list.forEach(item -> System.out.println(item));
        List<Integer> resultList = new ArrayList<>();
        for (int a = 1; a < 10; a++) {
            getNextLine(list, resultList);
            list = new ArrayList<>();
            list.addAll(resultList);
            resultList = new ArrayList<>();
        }
    }

    /**
     * 获取下一行
     *
     * @param list       当前行
     * @param resultList 下一行
     */
    private static void getNextLine(List<Integer> list, List<Integer> resultList) {
        int n = 1;
        for (int i = 0; i < list.size(); ) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    n++;
                } else {
                    break;
                }
            }
            resultList.add(n);
            resultList.add(list.get(i));
            if (i + n > list.size() - 1) {
                break;
            }
            i = i + n;
            n = 1;
        }
        resultList.forEach(item -> System.out.print(item + ","));
        System.out.println();
    }
}
