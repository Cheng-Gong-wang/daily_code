/*
4、编写Java程序模拟简单的计算器。 
定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值
再为该类定义加 addition()、减 subtration()、乘 multiplication()、除 division()等公有实例方法
分别对两个成员变量执行加、减、乘、除的运算。 

在main方法中创建Number类的对象调用各个方法并显示计算结果
*/
public class Homework04{
	public static void main(String[] args){
		Number num = new Number(10,20);
		
		int add = Number.addition(num.getN1(),num.getN2());
		int sub = Number.subtration(num.getN1(),num.getN2());
		int mul = Number.multiplication(num.getN1(),num.getN2());
		int div = Number.division(num.getN1(),num.getN2());
		System.out.println(add + " 、 " +sub +" 、 " + mul + " 、 " +div);
	}
}

class Number{
	private int n1;
	private int n2;
	
	public Number(){

	}
	public Number(int n1,int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public void setN1(int n1){
		this.n1 = n1;
	}
	public int getN1(){
		return n1;
	}
	public void setN2(int n2){
		this.n2 = n2;
	}
	public int getN2(){
		return n2;
	}
	public static int addition(int n1,int n2){
		return n1 + n2;
	}
	public static int subtration(int n1,int n2){
		return n1 - n2;
	}
	public static int multiplication(int n1,int n2){
		return n1 * n2;
	}
	public static int division(int n1,int n2){
		return n1 / n2;
	}
}