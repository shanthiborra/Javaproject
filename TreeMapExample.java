package xyz;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(101, "Nikitha");
		tm.put(102, "mahidar");
		tm.put(103, "shanthi");
		tm.put(104, "Nikitha");
		tm.put(102, "mahidar");
        System.out.println(tm);
        System.out.println(tm.isEmpty());
        System.out.println(tm.size());
	}

}
