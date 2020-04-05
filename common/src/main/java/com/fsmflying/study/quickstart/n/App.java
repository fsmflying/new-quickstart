package com.fsmflying.study.quickstart.n;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println(getKth(1, 1, 1));
        System.out.println(getKth(3, 18, 5));
    }

    /**
     * 获取按权重排序后的第k个数字
     * @param lo 起始数字
     * @param hi 结束数字
     * @param k 获取的数字的索引
     * @return 结果
     */
    public static int getKth(int lo, int hi, int k) {
        System.out.println("=====================================================");
        boolean log = true;//是否打印日志
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = lo; i <= hi; i++) {
            int j = i, weight = 0;//weight 权重
            System.out.print(i);
            boolean computed = false;//是否已经统计了步数，步数即权重
            while (!computed || j != 1) {
                if (!computed) {
                    computed = true;
                }
                weight++;
                j = j % 2 == 0 ? j / 2 : 3 * j + 1;
                if (log) {
                    System.out.print("->" + j);
                }
            }
            System.out.println();
            if (!map.containsKey(weight)) {
                map.put(weight, new ArrayList<Integer>());
            }
            map.get(weight).add(i);
            if (log) {
                System.out.println(weight);
            }
        }
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list);
        List<Integer> nums = new ArrayList<>(hi - lo + 1);
        for (Integer key : list) {
            Collections.sort(map.get(key));
            if (log) {
                System.out.print(key + ":");
            }
            for (Integer v : map.get(key)) {
                nums.add(v);
                System.out.print(" " + v);
            }
            if (log) {
                System.out.println();
            }
        }
        return nums.get(k - 1);
    }
}
