import java.util.Scanner;

public class ControlHomework03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);

		System.out.print("请输入一个年份： ");

		int year = myScanner.nextInt();
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ){
			System.out.print(year + "是一个闰年！");
		}else{
			System.out.print(year + "不是一个闰年！");
		}
	}
}