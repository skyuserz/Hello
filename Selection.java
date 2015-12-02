package 上机作业;
import java.util.*;
public class Selection {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Please input how many students:");
	int MaxSize = input.nextInt();
	double[] list = new double[MaxSize];
	System.out.println("\n"+"Please input students's grade:");
	for(int i=0;i<list.length;i++){
		list[i] = input.nextDouble();
	}
	 SelectionSort(list);
	 System.out.print("the result of sort is:");
	 for(int i=0;i<list.length;i++){
		 System.out.print(" "+list[i]+" ");
	 }
	}

	public static double[] SelectionSort(double[] list){
		for(int i=0;i < list.length;i++){
			double currentMin = list[i];
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

