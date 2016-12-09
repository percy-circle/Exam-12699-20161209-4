package com.hand.lkl.Exam_12699_20161209_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 4 ， (8分)随机生成50个小于100的整数,放入List中,将List中的 数据除以10, 以结果的整数值作为key放入Map中,得到如
 * {1=>[11,10,12],2=>[21,24,23]}的Map,再将Map中key对应的
 * 数组进行排序,得到如{1=>[10,11,12],2=>[21,23,24]} 输出的形式如下: 随机生成 50 个小于 100 的数,分别为:
 * xxx,xxxx,xxxx Map 中的数据为: {1=>[11,10,12],2=>[21,24,23]} 排序后的 Map 为:
 * {1=>[10,11,12],2=>[21,23,24]}
 *
 */
public class App {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < 50; i++) {// 生成50个整数
			list.add((int) (Math.random() * 99));
		}
		System.out.print("生成50个小于100的数，分别为："+list);
		for (Integer integer : list) {// 分类存入map
			System.out.print(+integer + ",");
			if (integer > 9) {
				int j = integer / 10;
				if (!map.containsKey(j)) {
					map.put(j, new ArrayList<Integer>());
				}
				map.get(j).add(integer);
			}
		}
		System.out.println();
		// 输出
		System.out.print("Map中的数据为：");
		for (Entry<Integer, List<Integer>> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "=>");
			System.out.println(entry.getValue());

			System.out.println();

		}
		System.out.print("排序后的 Map 为:");
		for (Entry<Integer, List<Integer>> entry : map.entrySet()) {
			// 排序
			Collections.sort(entry.getValue());
			
		}
		// 输出
		for (Entry<Integer, List<Integer>> entry : map.entrySet()) {
			System.out.println();
			System.out.print(entry.getKey() + "=>");
			System.out.println(entry.getValue());
		}
	}
}
