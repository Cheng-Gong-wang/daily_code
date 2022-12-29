import java.util.Scanner;

public class ArrayTest03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		double sum = 0;
		double average = 0;

		double array04[] = new double[10];
		for(int i = 0; i < array04.length; i++){
			System.out.print("请输入第"+(i+1)+"个数: ");
			array04[i] = myScanner.nextDouble();
		}
		System.out.println("\n");
		for(int j = 0; j < array04.length; j++){
			sum += array04[j];	
		}
		average = sum / array04.length;
		System.out.println("该数组的总和为: "+sum +"该数组的平均值为： "+ average);


	}
}