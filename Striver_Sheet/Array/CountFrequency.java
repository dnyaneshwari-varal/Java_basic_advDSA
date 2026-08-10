package Striver_Sheet.Array;

import java.util.HashMap;

public class CountFrequency {

	public static void countFrequency(String str) {
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
			
			
			
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		String str="banana";
		countFrequency(str);

	}

}
