package �ϻ���ҵ;

import java.util.*;
public class SamePrefix{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		System.out.println("��ͬ��ǰ׺Ϊ:"+prefix(s1,s2));
	}

	public static String prefix(String s1,String s2){
		int i = 0;
		String s = null;
		while(s1.charAt(i) == s2.charAt(i)){
			s = s1.substring(0,i+1);
			i++;
		}
		return s;
	}	
}

