import java.util.Scanner;

public class ControlHomework02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请任意输入一个数： ");

		double inputNumber = myScanner.nextDouble();
		if(inputNumber > 0){
			System.out.println(inputNumber + " > 0");
		}else if(inputNumber == 0){
			System.out.println(inputNumber + " = 0");
		}else{
			System.out.println(inputNumber + " < 0");
		}
	}
}