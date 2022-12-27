class SwitchTest01{
	public static void main(String[] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("请输入您的成绩： ");
	double score = s.nextDouble();
	String str = "不及格";


	score = (score < 0 || score >100)? 111 : score;
	switch ((int)(score - (score % 10))){
	case 60:
		str = "及格";
		break;
	case 70:
		str = "中等";
		break;
	case 80:
		str = "良好";
		break;
	case 90: case 100:
		str = "优秀";
		break;
	case 110:
		str = "您输入的信息有误，请重新输入！";
	}
	System.out.println(str);
	
	
	
	}
}