import java.util.Scanner;

public class ArrayTest04{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		double array[] =  new double[10];
		double array01[] = new double[array.length];

		for(int i = 0; i < array.length; i++){
			System.out.print("请输入第一个数组的第"+ (i+1)+ "个数:");
			array[i] = myScanner.nextDouble();
		}
		System.out.print("\n");
		for(int j = 0; j < array01.length; j++){
			array01[j] = array[j];
			System.out.println("第二个数组的第"+(j +1)+"个数为：" + array01[j] );
		}

	}
}