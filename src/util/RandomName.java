package util;

import java.util.Random;

public class RandomName {
	static String set="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static Random rand=new Random();
	
	public static String generateName(int length){
		int count=0;
		int index=0;
		StringBuilder name=new StringBuilder();
		while(count++<length){
			index=rand.nextInt(set.length());
			name.append(set.charAt(index));
		}
		return name.toString();
		
	}

}
