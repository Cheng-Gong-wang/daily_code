import java.util.Scanner;

public class ArrayTest01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		double array01[] = new double[5];

		for(int i = 0; i <= array01.length - 1; i++){
			System.out.print("请输入第"+(i+1)+"个数: ");
			array01[i] = myScanner.nextDouble(); 
		}
		System.out.print("\n");

		for(int j = 0; j <= array01.length - 1; j++){
			System.out.println("该数组的第"+(j+1)+"个数为"+ array01[j]);
		}
	}
}