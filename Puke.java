package src;
import java.util.*;
public class Puke {
	public static void main(String[] args){
		int[] deck = new int[52];
		int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int sum = 0,count=0;
		for(int i = 0; i < deck.length; i++){
			deck[i] = i;
		}
		while(sum!=24){
			for(int i = 0; i < deck.length; i++){
				int index = (int)(Math.random()*deck.length);
				int temp = deck[i];
				deck[i] = deck[index];
				deck[index] = temp;
			}
			int rank;
			sum = 0;
			for(int i = 0; i < 4; i++){
				rank = ranks[deck[i]%13];
				System.out.print(rank+" ");
				sum = sum+rank;
			}
			count++;
			System.out.println();
		}
	System.out.println("Ñ¡ÅÆ´ÎÊý£º"+count);
	}
	
}