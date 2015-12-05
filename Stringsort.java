package 上机作业;

import java.util.*;
public class Stringsort {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s=input.nextLine();
		
		char List[]=sort(s);
		for(int i=0;i<s.length();i++){
			System.out.print(List[i]);
		}
		
	}
	public static char[] sort(String s){
		char[] list = new char[s.length()];
		for(int i=0;i<s.length();i++){
			list[i]=s.charAt(i);
		}
		for(int i=0;i < list.length;i++){
			char currentMin = list[i];
			int currentMinIndex = i;
	
			for(int j=i+1;j<list.length;j++){
				if(currentMin>list[j]){
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex != i){
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
			return list;
	}
}
