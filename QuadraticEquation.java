import java.util.*;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	public QuadraticEquation(double newA,double newB,double newC){
		a=newA;
		b=newB;
		c=newC;
	}
	public double getA(){
		return a;
	}
	public void setA(double newA){
		a = newA;
	}
	public double getB(){
		return b;
	}
	public void setB(double newB){
		b = newB;
	}
	public double getC(){
		return c;
	}
	public void setC(double newC){
		c = newC;
	}
	public double getDiscriminant(){
		return b*b-4*a*c;
	}
	public double getRoot1(){

		if(b*b-4*a*c>=0)
			return (((-b)+Math.pow(b*b-4*a*c,0.5))/(2*a));
		else
			return 0;
	}
	public double getRoot2(){
	
		if(b*b-4*a*c>=0)
			return ((-b)-Math.pow(b*b-4*a*c,0.5))/(2*a);
		else
			return 0;
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the a,b,c(a!=0):(每一次回车)");
		double  a= input.nextDouble();
		double  b= input.nextDouble();
		double  c= input.nextDouble();
		QuadraticEquation t=new QuadraticEquation(a,b,c);
		System.out.println ("b*b-4*a*c="+t.getDiscriminant());
		if(b*b-4*a*c>0)
			System.out.println ("r1="+t.getRoot1()+"\nr2="+t.getRoot2());
		else if(b*b-4*a*c==0)
			System.out.println ("r1="+t.getRoot1());
		else
			System.out.println ("The equation has no roots");
	}
}

