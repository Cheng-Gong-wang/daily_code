class ForTest03{
	public static void main(String[] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("请输入一个正整数： ");
	double num = s.nextDouble();
	String str = "不是质数";

	if (num <= 0){
		str = "输入有误，请重新输入！";
	}else if(num == 2){
		str = "是质数";
	}else{
		if (num % 2 != 0 && num != 1){
			double x = 0;

			for (double i =3;i < ((num+1)/2);i += 2){
				if (num % i == 0){
					x += 1;
				}
			}
			if (x == 0){
				str = "是质数";
			}
		}
	}
	System.out.println(str);
	}
}