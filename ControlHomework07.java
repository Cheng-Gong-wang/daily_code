public class ControlHomework07{
	public static void main(String[] args){
		double sum = 0;
		for(double i = 1; i <= 100; i++){
			if(i % 2 == 0){
				sum -= (1 / i);
			}else{
				sum += (1 / i);
			} 
		}
		System.out.print("总和  = " + sum);
	}
}