public class ArrayTest02{
	public static void main(String[] args){
		int maxNum = 0;
		int index = 0;
		int array03[] = {4,-1,9,10,23};
		for(int i = 0; i < array03.length; i++){
			if(maxNum <= array03[i]){
				maxNum = array03[i];
				index = i;
			}
		}
		System.out.print("数组中最大的数是：" + maxNum+"角标为："+index);

	}
}