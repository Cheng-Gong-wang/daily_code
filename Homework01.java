/*
1、猜数字游戏
一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
	如果大了则提示大了
	小了则提示小了
	等于则提示猜测成功
*/
public class Homework01{
	public static void main(String[] args){
		System.out.print("请输入一个正整数： ");
		java.util.Scanner s1 = new java.util.Scanner(System.in);
		A a = new A(s1.nextInt());
		System.out.print("请猜测刚输入的正整数的值： ");
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		B b = new B(s2.nextInt());
		b.guess();
		
	}
}
class A{
	private int v;
	public A(){}
	public A(int v){
		this.v = v;
	}
	public void setV(int v){
		this.v = v;
	}
	public int getV(){
		return v;
	}
}
class B{
	private int gusNum;
	public B(){}
	public B(int gusNum){
		this.gusNum = gusNum;
	}

	public void setGusNum(int gusNum){
		this.gusNum = gusNum;
	}
	public int getGusNum(){
		return gusNum;
	}
	//开始定义B类中的实例方法
	public void guess(){
		
		if (this.gusNum == a.getV()){
			System.out.println("恭喜您，猜对了！！！");
		}else if (this.gusNum > a.getV()){
			System.out.println("您猜的数字偏大！");
		}else{
			System.out.println("您猜的数字偏小！");
		}
	}
}