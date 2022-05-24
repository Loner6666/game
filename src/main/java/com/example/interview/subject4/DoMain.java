package com.example.interview.subject4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description：读取本地文件A.txt、B.txt合并输出为C.txt
 * @Author：GuoFeng
 * @CreateTime：2022-05-24
 */
public class DoMain {
    // * 本地文件路径
    // * "C:\Users\GuoFeng\Desktop\新建文件夹\A.txt"
    // * "C:\Users\GuoFeng\Desktop\新建文件夹\B.txt"
    public static void main(String argv[]) throws IOException {
        String aFilePath = "C:\\Users\\GuoFeng\\Desktop\\新建文件夹\\A.txt";
        String bFilePath = "C:\\Users\\GuoFeng\\Desktop\\新建文件夹\\B.txt";
        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<C> cList = new ArrayList<>();

        String encoding = "UTF-8";
        File aFile = new File(aFilePath);
        File bFile = new File(bFilePath);

        if (aFile.isFile() && aFile.exists()) {
            A a = new A();
            InputStreamReader reader = new InputStreamReader(new FileInputStream(aFile), encoding);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                String[] split = lineTxt.split(",");
                a.setId(Integer.valueOf(split[0]));
                a.setName(split[1]);
                aList.add(a);
                a = new A();
            }
        }

        if (bFile.isFile() && bFile.exists()) {
            B b = new B();
            InputStreamReader reader = new InputStreamReader(new FileInputStream(bFile), encoding);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                String[] split = lineTxt.split(",");
                b.setId(Integer.valueOf(split[0]));
                b.setAge(Integer.valueOf(split[1]));
                bList.add(b);
                b = new B();
            }
        }

        Map<Integer, Integer> bMap = bList.stream().collect(Collectors.toMap(B::getId, B::getAge));
        C c = new C();
        for (A a : aList) {
            c.setId(a.getId());
            c.setName(a.getName());
            c.setAge(bMap.get(a.getId()));
            cList.add(c);
            c = new C();
        }

        cList.forEach(item -> System.out.println(item));

        StringBuilder sb = new StringBuilder();
        for (C item : cList) {
            sb.append(item.getId()).append(",").append(item.getName()).append(",").append(item.getAge()).append("\n");
        }
        File file = new File("C:\\Users\\GuoFeng\\Desktop\\新建文件夹\\C.txt");
        if (file.exists()) {
            file.delete();
        } else {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sb.toString());
        bw.close();
        fw.close();
        System.out.println(sb);
    }

}
