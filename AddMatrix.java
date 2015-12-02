package 上机作业;

import java.util.*;
public class AddMatrix {
	public static double[][] addMatrix(double[][] a,double[][] b){
		double[][] c=new double[3][3];
		for(int row=0;row < a.length; row++){
			for(int column=0;column < a.length; column++){
				c[row][column] = a[row][column]+b[row][column];
			}
		}
		return c;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] c=new double[3][3];	
		
		System.out.println("输入a矩阵:");
		for(int row = 0; row < matrix1.length;row++){
			for(int column = 0;column < matrix1.length;column++){
				matrix1[row][column] = input.nextDouble();
			}
		}
		System.out.println("输入b矩阵:");
		for(int row = 0; row < matrix2.length;row++){
			for(int column = 0;column < matrix2.length;column++){
				matrix2[row][column] = input.nextDouble();
			}
		}
		c = addMatrix(matrix1,matrix2);
		for(int row=0;row < c.length; row++){
			for(int column=0;column < c.length; column++){
				System.out.print(c[row][column]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
