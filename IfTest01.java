class IfTest01{
	public static void main(String[] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("请输入您的年龄：" );
	int num1 = s.nextInt();
	String str = "老年";
	if (num1 < 0 || num1 >150){
		System.out.print("您输入的信息有误，请重新输入您的年龄： ");
		int num2 = s.nextInt();			
		if (num2 < 0 || num2 >150){
		str = "您输入的信息有误，请重新输入！";
	} else{
		if (num2 < 8){
			str = "童年";
		}else if (num2 < 18){
			str = "少年";
		}else if (num2 < 35){
			str = "青年";
		}else if (num2 < 60){
			str = "中年";
		}else if (num2 < 90){
			str = "中老年";
		}else{
			str = "老年";
		}
	}
	} else{
		if (num1 < 8){
			str = "童年";
		}else if (num1 < 18){
			str = "少年";
		}else if (num1 < 35){
			str = "青年";
		}else if (num1 < 60){
			str = "中年";
		}else if (num1 < 90){
			str = "中老年";
		}else{
			str = "老年";
		}
	}
	System.out.println(str);
	}
}
	